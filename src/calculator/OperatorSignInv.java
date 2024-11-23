package calculator;

public class OperatorSignInv extends OperatorUnaryOp {

    public OperatorSignInv(State st) {
        super(st);
    }

    @Override
    public double operate(double a) {
        return -a;
    }
    
}
