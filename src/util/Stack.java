package util;

public class Stack<T> {

    private Node<T> top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    //add a value to the stack
    public void push(T value) {
        top = new Node<>(value, top);
        size++;
    }

    //delete the top value
    public void pop() {
        top = top.next;
        size--;
    }

    //return the value of the top Node
    public T top() {
        return top.value;
    }

    //return the stack in a string
    public String toString() {
        if (empty()){
            return "";
        }

        //String builder est mutable
        StringBuilder s = new StringBuilder();
        StackIterator<T> iterator = new StackIterator<>(top);
        while (iterator.hasNext()) {
            s.append(String.valueOf(iterator.next())).append(" ");
        }
        //trim() supprime l'espace final
        return s.toString().trim();
    }


    //is the stack empty
    public boolean empty() {
        return (top == null);
    }

    //return an Object tab composed of the stack values
    public Object[] getStack() {
        if (empty()) {
            return new Object[0];
            //return null;
        }
        Object[] stack = new Object[size];
        StackIterator<T> iterator = new StackIterator<>(top);
        int index = 0;
        while (iterator.hasNext()) {
            stack[index++] = iterator.next();
        }

        return stack;
    }

}
