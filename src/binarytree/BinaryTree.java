package binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by agaped on 12.03.2018.
 */
public class BinaryTree<E> {

    TreeNode<E> root;

    public BinaryTree(TreeNode<E> root) {
        this.root = root;
    }

    public void preOrder(){
        this.preOrder(root);
    }

    private void preOrder(TreeNode<E> node){
        if(node!=null){
            node.visit();
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }

    public void postOrder(){
        this.postOrder(root);
    }

    private void postOrder(TreeNode<E> node){
        if(node!=null){
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            node.visit();
        }
    }

    public void inOrder(){
        this.inOrder(root);
    }

    private void inOrder(TreeNode<E> node){
        if(node!=null){
            inOrder(node.getLeftChild());
            node.visit();
            inOrder(node.getRightChild());
        }
    }

    public void levelOrder(){
        Queue<TreeNode<E>> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode<E> current=q.remove();
            if(current!=null){
                current.visit();
                q.add(current.getLeftChild());
                q.add(current.getRightChild());
            }
        }
    }
}
