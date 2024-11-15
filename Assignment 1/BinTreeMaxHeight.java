class Tree{
    int data;
    Tree left, right;

    Tree(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinTreeMaxHeight {
    public static int maxheight(Tree tree){
        if (tree == null){
            return 0;
        }
        else{
            int ldepth = maxheight(tree.left);
            int rdepth = maxheight(tree.right);
            return 1+Math.max(ldepth, rdepth);

        }
    }
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        System.out.println(maxheight(tree));
    }
    
}
