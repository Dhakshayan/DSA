import java.util.*;
public class NextGreaterElement {

    public static void printNextGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int index = stack.pop();
                System.out.println(arr[index] +":"+ arr[i]);
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int index = stack.pop();
            System.out.println(arr[index] + ":-1");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4 , 5 , 2 , 25};
        printNextGreaterElements(arr);
    }
}
