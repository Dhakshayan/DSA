import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class RtViewBinTree {

    public static ArrayList<Integer> rightViewBruteForce(TreeNode root) {
        ArrayList<Integer> rightView = new ArrayList<>(); 
        if (root == null) return rightView;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); 
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); 

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (i == levelSize - 1) {
                    rightView.add(node.val); 
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return rightView;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        ArrayList<Integer> result = rightViewBruteForce(root);

        System.out.println(result);
    }
}
