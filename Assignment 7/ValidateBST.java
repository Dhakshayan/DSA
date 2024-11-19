class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    private boolean validate(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }
        int val = node.val;
        if (lower != null && val <= lower) {
            System.out.println("Node value " + val + " is not greater than the lower bound " + lower);
            return false;
        }
        if (upper != null && val >= upper) {
            System.out.println("Node value " + val + " is not less than the upper bound " + upper);
            return false;
        }
        if (!validate(node.right, val, upper)) {
            System.out.println("Right subtree of node with value " + val + " is invalid.");
            return false;
        }
        if (!validate(node.left, lower, val)) {
            System.out.println("Left subtree of node with value " + val + " is invalid.");
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        ValidateBST v = new ValidateBST();
        System.out.println(v.isValidBST(root));
    }
}
