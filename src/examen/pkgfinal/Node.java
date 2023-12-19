package examen.pkgfinal;

public class Node<T> implements Comparable<Node<T>> {

    private T data;
    private Node next;
    private Node prev;

    public Node() {
    }

    public Node(T data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public int compareTo(Node<T> o) {
        return 0;
    }
}
