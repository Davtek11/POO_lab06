package calculator;
import util.*;

public class OperatorInvert extends Operator {
    @Override
    public void execute() {
        double res = st.getStack().top();
        res = 1/res;
        st.getStack().pop();
        st.getStack().push(res);
    }

    public OperatorInvert(State st) {
        super(st);
    }
    
}
