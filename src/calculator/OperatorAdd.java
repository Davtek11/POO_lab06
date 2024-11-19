package calculator;
import util.*;

public class OperatorAdd extends Operator {
    @Override
    public void execute() {
        double res = st.getStack().top();
        st.getStack().pop();

        res += st.getStack().top();
        st.getStack().pop();
        
        st.getStack().push(res);
    }

    public OperatorAdd(State st) {
        super(st);
    }
}
