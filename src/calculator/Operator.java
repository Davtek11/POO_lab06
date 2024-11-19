package calculator;
import util.*;

abstract class Operator
{
  State st;

  abstract void execute();

  public Operator(State st) {
    this.st = st;
  }
}
