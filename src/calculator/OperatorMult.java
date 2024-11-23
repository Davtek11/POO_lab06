package calculator;

public class OperatorMult extends OperatorBinaryOp {

    public OperatorMult(State st) {
        super(st);
    }

    @Override
    public double operate(double a, double b) {
        return a * b;
    }
}
