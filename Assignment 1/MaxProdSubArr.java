public class MaxProdSubArr {
    public int findMaxSubArray(int[] arr){
        int maxProd = 0;
        for (int i=0;i< arr.length;i++){
            int currProd = 1;
            for (int j =i; j< arr.length;j++){
                currProd*= arr[j];
                maxProd = Math.max(maxProd, currProd);
            }
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int [] arr = {6, -3, -1};
        MaxProdSubArr ms = new MaxProdSubArr();
        int maximum = ms.findMaxSubArray(arr);
        System.out.println(maximum);
    }
}
