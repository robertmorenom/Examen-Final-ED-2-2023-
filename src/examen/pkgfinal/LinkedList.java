package examen.pkgfinal;

public class LinkedList {

    private Node head;

    public LinkedList() {

    }

    public void insertarNodoRecursivo(int valorNodo, Node apuntador) {
        if (head == null) {
            head = new Node();
            head.setData(valorNodo);
            return;
        }
        if (apuntador == null) {
            apuntador = head;
        }
        if (apuntador.getNext() == null) {
            Node newNode = new Node();
            newNode.setData(valorNodo);
            apuntador.setNext(newNode);
        } else {
            if (((Comparable) apuntador.getNext().getData()).compareTo(valorNodo) > 0) {
                Node aux = apuntador.getNext();
                Node newNode = new Node();
                newNode.setData(valorNodo);
                apuntador.setNext(newNode);
                newNode.setNext(aux);
            } else {
                insertarNodoRecursivo(valorNodo, apuntador.getNext());
            }
        }
    }

    public void printList(Node apuntador, boolean primeraVez) {
        if (primeraVez && apuntador == null) {
            apuntador = head;
        }
        if (apuntador != null) {
            System.out.print(apuntador.getData().toString() + " -> ");
            printList(apuntador.getNext(), false);
        }
    }
}
