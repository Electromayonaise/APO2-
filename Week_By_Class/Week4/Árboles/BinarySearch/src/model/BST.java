package model;

public class BST {
    
    private Node root;


    public void add (String key){
        Node node = new Node(key);
        if (root == null) {
            root = node;
        } else {
            add(node, root);
        }
    }

    private void add(Node node, Node current){
        // Compare the keys, this case is where the key of the node to add is less than the key of the current node
        if (node.getKey().compareTo(current.getKey()) < 0) {
            // If the left child of the current node is null, then the node to add is added as the left child of the current node
            if (current.getLeft() == null) {
                current.setLeft(node);
            } else {
                // If the left child of the current node is not null, then the add method is called again, but this time the current node is the left child of the current node
                add(node, current.getLeft());
            }
        // Compare the keys, this case is where the key of the node to add is greater than the key of the current node
        } else if (node.getKey().compareTo(current.getKey()) > 0) {
            // If the right child of the current node is null, then the node to add is added as the right child of the current node
            if (current.getRight() == null) {
                current.setRight(node);
            } else {
                // If the right child of the current node is not null, then the add method is called again, but this time the current node is the right child of the current node
                add(node, current.getRight());
            }
        }
        else {
            // If the key of the node to add is equal to the key of the current node

        }
    }

    /*public void inorder (Node current){
        ArrayList<String> keyArray = new ArrayList<String>();
        if (current != null) {
            if (current.getLeft() != null) {
                keyArray.add(current.getKey());
                inorder(current.getLeft());
            } else {
                keyArray.add(current.getKey());
            }
            
        }
    } */

    public String inOrder(){
        if (root == null) {
            return "empty tree";
        } else {
            return inOrder(root);
        }
    }

    private String inOrder(Node current){
        String msg = "";
        if (current != null) {
            if (current.getLeft() != null) {
                msg += inOrder(current.getLeft());
            }
            msg += current.getKey() + "\n";
            if (current.getRight() != null) {
                msg += inOrder(current.getRight());
            }
        }
        return msg;
    }

    public String inOrderTwo(Node current){
        if (current == null) {
            return "";
        } else {
            return inOrderTwo(current.getLeft()) + current.getKey() + "\n" + inOrderTwo(current.getRight());
        }
    }

    public Node getMin(){
        return getMin(root);
    }

    private Node getMin(Node current){
        if(current.getLeft() == null){
            return current;
        }
        else {
            return getMin(current.getLeft());
        }
    }

    public void delete(String goal){
        delete(null, root, goal);
    }

    private void delete(Node parent, Node current, String goal){
        if(current == null){
            // el nodo no esta en el árbol
        }
        // Cuando encontramos el nodo
        if(goal.equals(current.getKey())){
            // El nodo es una hoja del árbol
            if(current.getLeft() == null && current.getRight() == null){
                if(current == this.root){
                    this.root = null;
                }
                // evaluar si el nodo es hijo izquierdo
                else if(parent.getLeft() == current){
                    parent.setLeft(null);
                }
                // evaluar si el nodo es hijo derecho
                else {
                    parent.setRight(null);
                }
            }
            // el nodo a eliminar tiene unicamente un hijo izquierdo
            else if (current.getLeft() != null && current.getRight() == null) {
                if(parent.getLeft() == current){
                    parent.setLeft(current.getLeft());
                } else {
                    parent.setRight(current.getLeft());
                }
            }
            // el nodo a eliminar tiene unicamente un hijo derecho
            else if (current.getLeft() == null && current.getRight() != null) {
                // el nodo es un hijo izquierdo
                if(parent.getLeft() == current){
                    parent.setLeft(current.getRight());
                }
                // el nodo es un hijo derecho
                else {
                    parent.setRight(current.getRight());
                }
            } else if (current.getLeft() != null && current.getRight() != null ) {
                // obtener el successor del nodo --> el menor nodo de los mayores
                Node successor = getMin(current.getRight());

                // un remplazo de los atributos
                current.setKey(successor.getKey());
                // current.setValue(successor.getValue());

                // eliminar el successor --> actualizar las conexiones
                delete(current, current.getRight(), successor.getKey());
            }
        }
        // cuando no lo encuentro
        else if (goal.compareTo(current.getKey()) < 0) {
           delete(current, current.getLeft(), goal);
        }
        else if(goal.compareTo(current.getKey()) > 0){
            delete(current, current.getRight(), goal);
        }
    }
}
