
public class BinaryTree<T extends Comparable> {

    private Node<T> root;

    public BinaryTree(){
        root = null;
    }

    public void add(T toAdd){
        Node<T> node = new Node<T>(toAdd);
        if(root == null){
            root = node;
        }
        else{
            if(root.getValue().compareTo(node) <= 0){
                //Go left
                if(root.getLeft() == null){
                    root.setLeft(node);
                }
                else{

                }
            }
            else{
                //Go right
                if(root.getRight() == null){
                    root.setRight(node);
                }
                else{

                }

            }
        }
    }

    public void addNode(Node<T> parentNode, Node<T> toAdd){

    }

}
