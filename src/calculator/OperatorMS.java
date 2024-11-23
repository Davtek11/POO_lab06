package calculator;

public class OperatorMS extends OperatorMemory {
    @Override
    public void execute() {
        memory = st.current;
    }

    public OperatorMS(State st) {
        super(st);
    }
    
}
