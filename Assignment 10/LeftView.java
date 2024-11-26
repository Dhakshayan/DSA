import java.util.*;

class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

public class LeftView{
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        // map -> (vertical index, node.val)
        Map<Integer, Integer> map = new TreeMap<>();
        // q -> (node object, vertical index)
        Queue<Pair<Node, Integer>> q = new LinkedList<>();

        q.add(new Pair<>(root, 0));
        while (!q.isEmpty()) {
            Pair<Node, Integer> curr = q.poll();
            int level = curr.second;
            if(!map.containsKey(curr.second)) {
                map.put(curr.second,curr.first.val);
            }

            if(curr.first.left != null) {
                q.add(new Pair<>(curr.first.left,level+1));
            }

            if(curr.first.right != null) {
                q.add(new Pair<>(curr.first.right,level+1));
            }
        }

        for(int mapV : map.values()) {
            ans.add(mapV);
        }
        return ans;
    }
     public static void main(String[] args) {
        // Creating a tricky binary tree:
        //               1
        //             /   \
        //            2     3
        //             \   / \
        //              4 5   6
        //             /       \
        //            7         8
        //
        // Top view: 7, 2, 1, 3, 8

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.left.right.left = new Node(7);
        root.right.right.right = new Node(8);

        // Create an instance of TopView and call the topView method
        LeftView lv= new LeftView();
        ArrayList<Integer> result = lv.leftView(root);

        // Print the top view of the tree
        System.out.println("Top view of the tree: " + result);
    }
}