package calculator;
import util.*;

public class OperatorSignInv extends Operator {
    @Override
    public void execute() {
        double res = st.getStack().top();
        res = -res;
        st.getStack().pop();
        st.getStack().push(res);
    }

    public OperatorSignInv(State st) {
        super(st);
    }
    
}
