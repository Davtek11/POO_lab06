package util;

public class StackIterator<T> {

    private Node<T> currentNode;

    public StackIterator(Node<T> start) {
        currentNode = new Node<T>(null, start);
    }

    public boolean hasNext() {
        return currentNode.next != null;
    }

    public T next() {
        currentNode = currentNode.next;
        return currentNode.value;
    }
}
