package calculator;

public class OperatorNumber extends OperatorDecimalNumber {
  double val;
  @Override
  public void execute() {
    if(st.isResult) st.pushToStack();
    if(isDecimal) {
      st.current += val / 10;
      isDecimal = false;
      st.isResult = true;
    } else {
      st.current = val;
    }
  }

  public OperatorNumber(State st, double val) {
    super(st);
    this.val = val;
  }  
}
