package examen.pkgfinal;

//Implemente dos métodos:
//- (4 puntos) Método recursivo que inserte un nodo de tipo entero en una lista doble enlazada ordenada de
//menor a mayor. Siempre se insertará un valor mayor, aunque no necesariamente, un valor mayor a todos.
//Ejemplo, se inserta el 10, luego se inserta el 15, luego se inserta el 13, etc. Nunca se insertará un valor
//menor al primer valor insertado. Se propone la firma de método, pero el estudiante puede cambiarla.
//- (1 punto) Método recursivo que imprima la lista desde la cabeza hasta la cola. Se propone la firma de
//método, pero el estudiante puede cambiarla.
//Use la siguiente firma de métodos:
//public class LinkedList {
//private Node head;
//public void insertarNodoRecursivo(int valorNodo, Node apuntador) {
//...
//}
//public void printList(Node apuntador, boolean primeraVez) {
//...
//}
//}
//A continuación, se presenta el código que se usará para probar la implementación.
//public static void main(String[] args) {
//LinkedList lista = new LinkedList();
//lista.insertarNodoRecursivo(10, null);
//lista.insertarNodoRecursivo(15, null);
//lista.insertarNodoRecursivo(13, null);
//lista.insertarNodoRecursivo(16, null);
//lista.printList(null, true);
//}
//La implementación se realizará en el computador. El estudiante deberá un proyecto con únicamente las
//clases requeridas para este examen, esto es, la clase LinkedList, la clase Node y la clase
//ClientLinkedList. La clase LinkedList únicamente tendrá los dos métodos y el único atributo presentado
//en este enunciado.

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
