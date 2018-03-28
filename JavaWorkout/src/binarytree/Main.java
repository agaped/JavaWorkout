package binarytree;

/**
 * Created by agaped on 12.03.2018.
 */
public class Main {

    public static void main(String[] args){
        TreeNode<String> root=new TreeNode<>("A", null);
        TreeNode<String> B=root.addLeftChild("B");
        TreeNode<String> C=root.addRightChild("C");
        TreeNode<String> D=B.addLeftChild("D");
        TreeNode<String> E=B.addRightChild("E");
        TreeNode<String> F=C.addLeftChild("F");
        TreeNode<String> G=C.addRightChild("G");

        BinaryTree<String> bt=new BinaryTree<>(root);

        System.out.println("Preorder:");
        bt.preOrder();
        System.out.println("\nPostorder:");
        bt.postOrder();
        System.out.println("\nInorder:");
        bt.inOrder();
        System.out.println("\nLevel order:");
        bt.levelOrder();
    }
}
