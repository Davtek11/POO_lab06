package calculator;

public class OperatorMR extends OperatorMemory {
  @Override
  public void execute() {
    st.current = memory;
  }

  public OperatorMR(State st) {
    super(st);
  }
    
}
