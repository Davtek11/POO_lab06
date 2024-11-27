package calculator;

/*
 * Permet d'effectuer une opération unaire (carré, racine carrée, inversion, inversion de signe) sur la valeur courante d'une State.
 * @author David Berger, Sara Camassa
*/
public abstract class OperatorUnaryOp extends Operator {

  @Override
  public void execute() {
    st.current = operate(st.current);
    st.isResult = true;
  }

  OperatorUnaryOp(State st) {
    super(st);
  }

  abstract double operate(double a);
}
