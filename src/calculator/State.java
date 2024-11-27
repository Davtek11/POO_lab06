package calculator;
import util.Stack;

/*
 * Permet de sauvegarder l'état d'une stack.
 * @author David Berger, Sara Camassa
*/
public class State {
  Stack<Double> stack;
  double current;
  boolean isResult;

  public State() {
    stack = new Stack<>();
    current = 0;
    isResult = false;
  }

  /*
   * Ajouter une valeur en haut de la stack.
  */
  public void pushToStack() {
    isResult = false;
    stack.push(current);
  }
}
