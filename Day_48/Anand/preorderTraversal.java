import java.util.*;
// Definition for a binary tree node.
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

            // Using a stack for iterative preorder: Root -> Left -> Right
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
           result.add(curr.val);

                // Push right first, then left (so left is processed first)
            if (curr.right != null) stack.push(curr.right);
            if (curr.left != null) stack.push(curr.left);
        }
        return result;
    }
    public static void main(String[] args) {
        preorderTraversal sol = new preorderTraversal();
            /* Constructing the tree:
                    1
                    / \
                null  2
                        /
                    3
            */
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> output = sol.preorderTraversal(root);
            
        System.out.println("Preorder Traversal: " + output);
       // Expected Output: [1, 2, 3]
    }
}
