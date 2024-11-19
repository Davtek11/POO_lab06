package calculator;
import util.*;

public class OperatorPow extends Operator {
    @Override
    public void execute() {
        double res = Math.pow(st.getStack().top(), 2.0);
        st.getStack().pop();
        
        st.getStack().push(res);
    }

    public OperatorPow(State st) {
        super(st);
    }
}
