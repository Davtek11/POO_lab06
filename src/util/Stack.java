package util;

/*
 * Classe implémentant une pile générique.
 * @author David Berger, Sara Camassa
*/
public class Stack<T> {

  private Node<T> top;
  private int size;

  public Stack() {
    top = null;
    size = 0;
  }

  /*
   * Ajoute un élément en haut de la pile.
   * @param value, la valeur du nouvel élément
  */
  public void push(T value) {
    Node<T> newTop = new Node<>(value, top);
    top = newTop;
    size++;
  }

  /*
   * Retire l'élément en haut de la pile.
   * @return la valeur de l'élément retiré
  */
  public T pop() {
    if(top() == null) return null;

    T temp = top();
    top = top.next;
    size--;
    return temp;
  }

  /*
   * Récupère la valeur de l'élément en haut de la pile.
   * @return la valeur de l'élément en haut de la pile
  */
  public T top() {
    if(top == null) return null;
    return top.value;
  }

  /*
   * Permet d'afficher la pile.
   * @return une string contenant les valeurs de tous les éléments de la pile séparés par un espace
  */
  @Override
  public String toString() {
    if (empty()) {
      return "<empty>";
    }

    String stackDisplay = "";

    for (String s : this.getStackString()) {
      stackDisplay = stackDisplay.concat(s + " ");
    }
    
    return stackDisplay.trim();
  }


  /*
   * Vérifie si la pile est vide.
   * @return un booléen indiquant si la pile est vide
  */
  public boolean empty() {
    return (top == null);
  }

  /*
   * Convertit la pile en tableau d'Object.
   * @return un tableau d'Object, avec chaque élément un Object représentant un élément de la pile
  */
  public Object[] getStack() {
    if (empty()) {
      return new Object[0];
    }
    Object[] stack = new Object[size];
    StackIterator<T> iterator = new StackIterator<>(top);
    int index = 0;
    while (iterator.hasNext()) {
      stack[index++] = iterator.next();
    }

    return stack;
  }

  /*
   * Convertit la pile en tableau de String.
   * @return un tableau de String, avec chaque élément une String représentant un élément de la pile
  */
  public String[] getStackString() {
    if (empty()) {
      return new String[0];
    }
    String[] stack = new String[size];
    StackIterator<T> iterator = new StackIterator<>(top);
    int index = 0;
    while (iterator.hasNext()) {
      stack[index++] = String.valueOf(iterator.next());
    }

    return stack;
  }
}
