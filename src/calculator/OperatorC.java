package calculator;
import util.*;

public class OperatorC extends Operator {
    @Override
    public void execute() {
        while(!st.getStack().empty()) {
            st.getStack().pop();
        }
    }

    public OperatorC(State st) {
        super(st);
    }
    
}
