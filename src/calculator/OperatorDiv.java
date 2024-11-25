package calculator;

public class OperatorDiv extends OperatorBinaryOp {

    public OperatorDiv(State st) {
        super(st);
    }

    @Override
    public double operate(double a, double b) {
        return a / b;
    }
}
