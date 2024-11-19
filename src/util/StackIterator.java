package util;

public class StackIterator<T> {

    private Node<T> currentNode;

    public StackIterator(Node<T> start) {
        currentNode = start;
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public T next() {
        currentNode = currentNode.next;
        return currentNode.value;
    }
}
