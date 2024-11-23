package calculator;

public class OperatorBackspace extends Operator {
    @Override
    public void execute() {
        String num = String.valueOf(st.current);
        if(st.current % 1 == 0) {
            num = num.substring(0, num.indexOf(".") - 1);
        } else {
            num = num.substring(0, num.length() - 1);
        }
        if(num.isEmpty())
            st.current = 0;
        else
            st.current = Double.parseDouble(num);
        st.isResult = false;
    }

    public OperatorBackspace(State st) {
        super(st);
    }
    
}
