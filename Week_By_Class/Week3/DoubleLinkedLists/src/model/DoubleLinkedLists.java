package model;

public class DoubleLinkedLists {
    
    private Node head;
    private Node tail;

    public DoubleLinkedLists() {}

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

    public String remove(int goal, Node current){
        String msg = "";
        if(head == null){
            msg="empty list";
        }else if(current == null){
            msg="No existe";
        }else if(current.getData() == goal){

            if(current == this.head){
                this.head = current.getNext(); // La cabeza ahora es el siguiente del actual (el segundo nodo) Actualizar el estado de la lista
                current.setNext(null); // desconección del elemento
                head.setPrevious(null); // desconección del elemento
                msg="cabeza";
            }
            // sub Caso Base (Caso borde)
            else if(current == tail){
                this.tail = current.getPrevious(); // La cola ahora es el anterior del actual (el penultimo nodo) Actualizar el estado de la lista
                current.setPrevious(null); // desconección del elemento
                tail.setNext(null); // desconección del elemento
                msg=" cola ";
            }
            // sub caso
            else {
                current.getPrevious().setNext(current.getNext()); // (El nodo anterior cambia su siguiente por el siguiente del actual) Actualizar el estado de la lista
                current.getNext().setPrevious(current.getPrevious()); // (El nodo siguiente cambia su anterior por el anterior del actual) Actualizar el estado de la lista
                current.setNext(null); // desconección del elemento
                current.setPrevious(null); // desconección del elemento
                msg="mitad";
            }


        }else{
            remove(goal, current.getNext());
        }
        return msg;
    }
    

}
