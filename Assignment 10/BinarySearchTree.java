 class Node {
    public int val;
    public Node left, right;
 
    public Node(int val) {
       this.val = val;
       this.left = null;
       this.right = null;
    }
 }
 
public class BinarySearchTree {
    Node root;

    public Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        if (root.val < val)
            root.right = insert(root.right, val);
        else if (root.val > val)
            root.left = insert(root.left, val);
        return root;
    }

    public Node remove(Node root, int val) {
        if (root.val < val)
            root.right = remove(root.right, val);
        else if (root.val > val)
            root.left = remove(root.left, val);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                Node smNode = minNode(root.right);
                root.val = smNode.val;
                root.right = remove(root.right,
                smNode.val);
            }
        }
        return root;
    }

    public Node minNode(Node root) {
        Node temp = root;
        while (temp.left != null)
            temp = temp.left;
        return temp;
    }

    public boolean isValidBST(Node root){
        if (root == null){
            return true;
        }
        if (root.left!=null){
            if (root.left.val>root.val){
                return false;
            }
        }
        if (root.right!=null){
            if (root.right.val<root.val){
                return false;
            }
        }
        isValidBST(root.left);
        isValidBST(root.right);
        return true;
    }
    public static void main(String[] args) {
       BinarySearchTree bst = new BinarySearchTree(); 
       bst.root = bst.insert(bst.root,4);
       bst.root = bst.insert(bst.root,3);
       bst.root = bst.insert(bst.root,7);
       bst.root = bst.insert(bst.root,1);
       bst.root = bst.insert(bst.root,2);
       bst.root = bst.insert(bst.root,5);
       bst.root = bst.insert(bst.root,8);
      
    }
}
