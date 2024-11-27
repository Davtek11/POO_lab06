package calculator;

public abstract class OperatorDecimalNumber extends Operator {
  static boolean isDecimal = false;
    
  OperatorDecimalNumber(State st) {
    super(st);
  }
}
