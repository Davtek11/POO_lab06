package calculator;

public abstract class OperatorUnaryOp extends Operator {

  @Override
  public void execute() {
    st.current = operate(st.current);
    st.isResult = true;
  }

  OperatorUnaryOp(State st) {
    super(st);
  }

  abstract double operate(double a);
}
