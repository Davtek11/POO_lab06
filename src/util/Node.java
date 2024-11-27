package util;

/*
 * Classe générique pour un élément de Stack générique.
 * @author David Berger, Sara Camassa
*/
public class Node<T> {

  T value;
  Node<T> next;

  public Node(T value, Node<T> next) {
    this.value = value;
    this.next = next;
  }
}
