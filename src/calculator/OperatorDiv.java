package calculator;

public class OperatorDiv extends OperatorBinaryOp {

    public OperatorDiv(State st) {
        super(st);
    }

    @Override
    public double operate(double a, double b) {
        if(b == 0) throw new IllegalArgumentException("Division by 0");
        return a / b;
    }
}
