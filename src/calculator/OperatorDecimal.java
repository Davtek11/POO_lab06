package calculator;

public class OperatorDecimal extends OperatorDecimalNumber {
  @Override
  public void execute() {
    if(!st.isResult) isDecimal = true;
  }

  public OperatorDecimal(State st) {
    super(st);
  }
}
