package calculator;

abstract class Operator
{
  State st;

  abstract void execute();

  Operator(State st) {
    this.st = st;
  }
}
