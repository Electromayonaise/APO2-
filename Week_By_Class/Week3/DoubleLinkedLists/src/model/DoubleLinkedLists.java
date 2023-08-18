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

    public String exchange(Node node1, Node node2) {
        return exchange(node1, node2, this.head);
    }

    // Method to exchange two nodes of the list
    private String exchange(Node node1, Node node2, Node current) {
        String msg = "";
        if (head == null) {
            msg = "empty list";
        } else if (current == null) {
            msg = "Does not exist";
        } else if (current == node1) {
            Node temp = node1.getNext();
            node1.setNext(node2.getNext());
            node2.setNext(temp);
            msg = "exchanged";
        } else {
            exchange(node1, node2, current.getNext());
        }
        return msg;
    }

    /*
    static pair find(int x, int y) {
        Node N1 = null;
        Node N2 = null;
        Node temp = head;

        // Traversing the list
        while (temp != null) {
            if (temp.data == x)
                N1 = temp;
            else if (temp.data == y)
                N2 = temp;
            temp = temp.next;
        }
        return new pair(N1, N2);
    }

    // Function to swap the nodes
    // consisting of x and y
    static void swap(int x, int y) {
        // Edge Cases
        if (head == null || head.next == null || x == y)
            return;
        // Finding the Nodes
        pair p = find(x, y);
        Node Node1 = p.first;
        Node Node2 = p.second;
        if (Node1 == head)
            head = Node2;
        else if (Node2 == head)
            head = Node1;
        if (Node1 == tail)
            tail = Node2;
        else if (Node2 == tail)
            tail = Node1;
        // Swapping Node1 and Node2
        Node temp;
        temp = Node1.next;
        Node1.next = Node2.next;
        Node2.next = temp;
        if (Node1.next != null)
            Node1.next.prev = Node1;
        if (Node2.next != null)
            Node2.next.prev = Node2;
        temp = Node1.prev;
        Node1.prev = Node2.prev;
        Node2.prev = temp;

        if (Node1.prev != null)
            Node1.prev.next = Node1;
        if (Node2.prev != null)
            Node2.prev.next = Node2;
    }

    ************OR************

    public void exchangeNodes(Node node1, Node node2) {
        if (node1 == node2) {
            return; // Nodes are the same, no need to exchange
        }
        
        // Update previous and next references of node1 and node2
        if (node1.prev != null) {
            node1.prev.next = node2;
        } else {
            head = node2;
        }
        if (node2.prev != null) {
            node2.prev.next = node1;
        } else {
            head = node1;
        }
        
        Node tempPrev = node1.prev;
        Node tempNext = node1.next;
        
        node1.prev = node2.prev;
        node1.next = node2.next;
        node2.prev = tempPrev;
        node2.next = tempNext;

        // Update neighboring nodes' references
        if (node1.prev != null) {
            node1.prev.next = node1;
        }
        if (node1.next != null) {
            node1.next.prev = node1;
        }
        if (node2.prev != null) {
            node2.prev.next = node2;
        }
        if (node2.next != null) {
            node2.next.prev = node2;
        }
    }

*/

}
