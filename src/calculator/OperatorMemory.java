package calculator;

public abstract class OperatorMemory extends Operator {
  static double memory;

  OperatorMemory(State st) {
    super(st);
  }
}
