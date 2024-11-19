import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class PalindromeLL {
    public boolean isPalin(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = head;

        // Convert linked list to an array
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        // Check if array is a palindrome
        int start = 0, end = values.size() - 1;
        while (start < end) {
            if (!values.get(start).equals(values.get(end))) return false;
            start++;
            end--;
        }
        return true;
    }
}
