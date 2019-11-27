package algorithms.binarytree;

/**
 * Created by agaped on 12.03.2018.
 */
public class TreeNode<E> {
    private E value;
    private TreeNode<E> parent;
    private TreeNode<E> leftChild;
    private TreeNode<E> rightChild;
    private boolean visited;

    public TreeNode(E value, TreeNode<E> parent) {
        this.value = value;
        this.parent = parent;
        this.leftChild=null;
        this.rightChild=null;
    }

    public TreeNode<E> getLeftChild() {
        return leftChild;
    }

    public TreeNode<E> getRightChild() {
        return rightChild;
    }

    public TreeNode<E> addLeftChild(E value){
        return this.leftChild=new TreeNode(value, this);
    }

    public TreeNode<E> addRightChild(E value){
        return this.rightChild=new TreeNode(value, this);
    }

    public void visit(){
        this.visited=true;
        System.out.print(this.toString()+" ");
    }
    public String toString(){
        return this.value.toString();
    }


}
