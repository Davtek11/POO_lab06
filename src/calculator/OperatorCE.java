package calculator;

public class OperatorCE extends Operator {
  @Override
  public void execute() {
    st.current = 0;
    st.isResult = false;
  }

  public OperatorCE(State st) {
    super(st);
  }  
}
