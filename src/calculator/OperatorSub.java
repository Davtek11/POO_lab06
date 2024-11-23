package calculator;

public class OperatorSub extends OperatorBinaryOp {

    public OperatorSub(State st) {
        super(st);
    }

    @Override
    public double operate(double a, double b) {
        return a - b;
    }
}
