package calculator;
import util.*;

public class OperatorSub extends Operator {
    @Override
    public void execute() {
        double res = st.getStack().top();
        st.getStack().pop();

        res -= st.getStack().top();
        st.getStack().pop();
        
        st.getStack().push(res);
    }

    public OperatorSub(State st) {
        super(st);
    }
}
