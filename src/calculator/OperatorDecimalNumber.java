package calculator;

/*
 * Permet de gérer l'écriture de nombre décimaux sur la calculatrice.
 * @author David Berger, Sara Camassa
*/
public abstract class OperatorDecimalNumber extends Operator {
  static boolean isDecimal = false;
    
  OperatorDecimalNumber(State st) {
    super(st);
  }
}
