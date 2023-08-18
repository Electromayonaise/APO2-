package model;

public class DoubleLinkedLists {

    private Node head;
    private Node tail;

    public DoubleLinkedLists() {
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
    }

    public String remove (int goal) {
        return remove(goal, this.head);
    }

    private String remove(int goal, Node current) {
        String msg = "";
        if (head == null) {
            msg = "empty list";
        } else if (current == null) {
            msg = "No existe";
        } else if (current.getData() == goal) {

            if (current == this.head) {
                this.head = current.getNext(); // La cabeza ahora es el siguiente del actual (el segundo nodo)
                                               // Actualizar el estado de la lista
                current.setNext(null); // desconección del elemento
                head.setPrevious(null); // desconección del elemento
                msg = "head";
            }
            // sub Caso Base (Caso borde)
            else if (current == tail) {
                this.tail = current.getPrevious(); // La cola ahora es el anterior del actual (el penultimo nodo)
                                                   // Actualizar el estado de la lista
                current.setPrevious(null); // desconección del elemento
                tail.setNext(null); // desconección del elemento
                msg = " tail ";
            }
            // sub caso
            else {
                current.getPrevious().setNext(current.getNext()); // (El nodo anterior cambia su siguiente por el
                                                                  // siguiente del actual) Actualizar el estado de la
                                                                  // lista
                current.getNext().setPrevious(current.getPrevious()); // (El nodo siguiente cambia su anterior por el
                                                                      // anterior del actual) Actualizar el estado de la
                                                                      // lista
                current.setNext(null); // desconección del elemento
                current.setPrevious(null); // desconección del elemento
                msg = "half";
            }

        } else {
            remove(goal, current.getNext());
        }
        return msg;
    }


    public String print(Node current){
        String str = "";
        // Caso base, la lista esta completamente vacia
        if(head == null){
           str = "The list is empty";
        }
        // segundo caso base, la lista no esta vacia, see llega al final de la lista
        else if(current.getNext() == null){
            str += "" + current.getData();
        }
        // caso recursivo, se salta al siguiente elemento de la lista

        /*
        * Primer llamado recursivo current = 2
        *
        * head
        * |
        * 2 -> 1 -> 0 -> null
        * |         |
        * current   tail
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *
        * Segundo llamado recursivo: current = 1
        * head
        * |
        * 2 -> 1 -> 0 -> null
        *      |    |
        * current   tail
        *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        * Tercer llamado recursivo: current = 0
        * Se llega al segundo caso base
        * head      current
        * |         |
        * 2 -> 1 -> 0 -> null
        *           |
        *           tail
        * */
        else {
            str += current.getData() + " "+ print(current.getNext());
        }
        return str;
    }

    // Method to exchange two nodes of the list
    public void swap(int x, int y)
    {
        // Nothing to do if x and y are same
        if (x == y)
            return;
 
        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        while (currX != null && currX.getData() != x) {
            prevX = currX;
            currX = currX.getNext();
        }
 
        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.getData() != y) {
            prevY = currY;
            currY = currY.getNext();
        }
 
        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;
 
        // If x is not head of linked list
        if (prevX != null)
            prevX.setNext(currY);
        else // make y the new head
            head = currY;
 
        // If y is not head of linked list
        if (prevY != null)
            prevY.setNext(currX);
        else // make x the new head
            head = currX;
 
        // Swap next pointers
        Node temp = currX.getNext();
        currX.setNext(currY.getNext());
        currY.setNext(temp);
    }

    public Node searchNode(int id, Node current) {

        if (current == null) {

            return null;

        } else if (current.getData() == id) {

            return current;

        } else {

            return searchNode(id, current.getNext());

        }

    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public void setTail(Node tail){
        this.tail = tail;
    }


}
