class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
class BinaryTree{
    void preorderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    void inorderTraversal(Node root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);
    }
    void postorderTraversal(Node root){
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
}
public class _1_Basics {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(19);
        root.left.left = new Node(20);
        root.left.right = new Node(21);
        root.right = new Node(31);
        root.right.left = new Node(56);
        root.right.right = new Node(71);

        BinaryTree traversal = new BinaryTree();
        traversal.preorderTraversal(root);
        traversal.inorderTraversal(root);
        traversal.postorderTraversal(root);
    }
}
