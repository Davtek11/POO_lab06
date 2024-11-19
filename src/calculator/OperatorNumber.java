package calculator;
import util.*;

public class OperatorNumber extends Operator {
    double val;
    @Override
    public void execute() {
        st.getStack().push(val);
    }

    public OperatorNumber(State st, int val) {
        super(st);
        this.val = (double) val;
    }
    
}
