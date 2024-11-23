package calculator;

public class OperatorC extends Operator {
    @Override
    public void execute() {
        st.current = 0;
        st.isResult = false;
        while(!st.stack.empty()) {
            st.stack.pop();
        }
    }

    public OperatorC(State st) {
        super(st);
    }
    
}
