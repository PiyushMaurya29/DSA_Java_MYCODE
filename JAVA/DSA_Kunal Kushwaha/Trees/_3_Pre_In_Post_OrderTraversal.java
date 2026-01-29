import com.sun.source.tree.Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}
class BinaryTree{
    public void preorderTraversal(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public void inorderTraversal(TreeNode root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
    public void postorderTraversal(TreeNode root){
        if(root == null) return;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val+" ");
    }
}
public class _3_Pre_In_Post_OrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();

        System.out.print("Preorder Traversal : ");
        tree.preorderTraversal(root);
        System.out.println();

        System.out.print("Inorder Traversal : ");
        tree.inorderTraversal(root);
        System.out.println();

        System.out.print("Postorder Traversal : ");
        tree.postorderTraversal(root);
        System.out.println();
    }
}
