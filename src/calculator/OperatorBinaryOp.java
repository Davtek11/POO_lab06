package calculator;

/*
 * Permet d'effectuer une opération binaire (+, -, *, /) entre la valeur courante d'une state et le haut de sa stack.
 * @author David Berger, Sara Camassa
*/
public abstract class OperatorBinaryOp extends Operator {

  @Override
  public void execute() {
    Double a = st.stack.pop();

    if(a != null) {
      st.current = operate(a, st.current);
      st.isResult = true;
    }
  }

  OperatorBinaryOp(State st) {
    super(st);
  }

  /*
   * Permet d'effectuer une opération binaire sur deux doubles.
   * @param a, le premier nombre de l'opération
   * @param b, le deuxième nombre de l'opération
  */
  abstract double operate(double a, double b);
}
