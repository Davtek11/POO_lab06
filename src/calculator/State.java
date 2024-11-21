package calculator;
import util.Stack;

public class State {
    private Stack<Double> st;

    public State() {
        st = new Stack<>();
    }

    public Stack<Double> getStack() {
        return st;
    }
}
