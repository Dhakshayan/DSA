import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

class BottomView {

    static ArrayList<Integer> bottomView(Node root) {
        if (root == null) return new ArrayList<>();

        Map<Integer, Integer> hdMap = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        
        while (!q.isEmpty()) {
            Node curr = q.peek().node;
            int hd = q.peek().hd;
            q.poll();

            hdMap.put(hd, curr.data);

            if (curr.left != null) {
                q.add(new Pair(curr.left, hd - 1));
            }

            if (curr.right != null) {
                q.add(new Pair(curr.right, hd + 1));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int value : hdMap.values()) {
            result.add(value);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right.right = new Node(25);

        ArrayList<Integer> result = bottomView(root);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
