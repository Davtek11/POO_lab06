package calculator;
import util.*;

public class OperatorSqrt extends Operator {
    @Override
    public void execute() {
        double res = Math.sqrt(st.getStack().top());
        st.getStack().pop();
        
        st.getStack().push(res);
    }

    public OperatorSqrt(State st) {
        super(st);
    }
    
}
