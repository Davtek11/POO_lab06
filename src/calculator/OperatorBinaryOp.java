package calculator;

public abstract class OperatorBinaryOp extends Operator {

    @Override
    public void execute() {
        Double a = st.stack.pop();

        if(a != null) {
            st.current = operate(a, st.current);
            st.isResult = true;
        }
    }

    OperatorBinaryOp(State st) {
        super(st);
    }

    abstract double operate(double a, double b);


}
