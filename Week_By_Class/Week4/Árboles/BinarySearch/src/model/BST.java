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
}
