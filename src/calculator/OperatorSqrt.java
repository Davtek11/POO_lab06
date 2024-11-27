package calculator;

public class OperatorSqrt extends OperatorUnaryOp {

  public OperatorSqrt(State st) {
    super(st);
  }

  @Override
  public double operate(double a) {
    return Math.sqrt(a);
  }  
}
