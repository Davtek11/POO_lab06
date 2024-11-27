package calculator;

public class OperatorEnter extends Operator {
  @Override
  public void execute() {
    st.pushToStack();
  }

  public OperatorEnter(State st) {
    super(st);
  }  
}
