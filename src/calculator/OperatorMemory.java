package calculator;

/*
 * Permet de gérer le stockage et la récupération d'un double en mémoire sur la calculatrice.
 * @author David Berger, Sara Camassa
*/
public abstract class OperatorMemory extends Operator {
  static double memory;

  OperatorMemory(State st) {
    super(st);
  }
}
