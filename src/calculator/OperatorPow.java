package calculator;

public class OperatorPow extends OperatorUnaryOp {

    public OperatorPow(State st) {
        super(st);
    }

    @Override
    public double operate(double a) {
        return Math.pow(a, 2.0);
    }
}
