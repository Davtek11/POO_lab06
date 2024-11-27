package calculator;

public class OperatorInvert extends OperatorUnaryOp {
    
  public OperatorInvert(State st) {
    super(st);
  }
    
  @Override
  public double operate(double a) {
    return 1/a;
  }
}
