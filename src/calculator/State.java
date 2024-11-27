package calculator;
import util.Stack;

public class State {
  Stack<Double> stack;
  double current;
  boolean isResult;

  public State() {
    stack = new Stack<>();
    current = 0;
    isResult = false;
  }

  public void pushToStack() {
    isResult = false;
    stack.push(current);
  }

  public String currentString() {
    return " ";
  }
}
