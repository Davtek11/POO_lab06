package calculator;

/*
 * Permet d'effectuer les opérations d'une calculatrice.
 * @author David Berger, Sara Camassa
*/
abstract class Operator
{
  State st;

  /*
   * Opération à effectuer sur la State.
  */
  abstract void execute();

  Operator(State st) {
    this.st = st;
  }
}
