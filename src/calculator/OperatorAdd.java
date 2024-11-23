package calculator;

public class OperatorAdd extends OperatorBinaryOp {
    
    public OperatorAdd(State st) {
        super(st);
    }

    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
