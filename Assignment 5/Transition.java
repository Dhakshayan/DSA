public class Transition {
    int transitPt(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1 && arr[i - 1] == 0) {
                return i;
            }
        }
        if (arr[0] == 1) {
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        Transition s = new Transition();
        int arr[] = {0, 0, 0, 1, 1, 1};
        System.out.println(s.transitPt(arr));
    }
}
