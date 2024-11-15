public class Kadanes {

    public int findMaxSubArray(int[] arr){
        int currSum= arr[0];
        int maxSum= arr[0];
        for (int i=0;i<arr.length;i++){
            currSum = Math.max(currSum+ arr[i], arr[i]);
            if (currSum>maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Kadanes kd = new Kadanes();
        int [] arr = {-2, -4};
        int maximum = kd.findMaxSubArray(arr);
        System.out.println(maximum);
    }
}