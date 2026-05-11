package Day_46.Anand;

import javax.swing.tree.TreeNode;

public class maxDeapth {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHeight= maxDepth(root.left);
        int rightHeight =maxDepth(root.right);

        return (Math.max(leftHeight,rightHeight)+1);
    }
    public static void main(String[] args) {
        maxDeapth obj = new maxDeapth();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int result = obj.maxDepth(root);
        System.out.println("Maximum depth of the binary tree: " + result);
    }
}
