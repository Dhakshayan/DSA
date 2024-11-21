public class SearchSortedRotated {
    public int searchRotatedArr(int[] arr, int target){
        if (arr[0] == target){
            return 0;
        }else if (arr[0]>target){
            for (int i =0; i< arr.length;i++){
                if (arr[i]== target){
                    return i;
                }
            }
        }else{
            for (int i =arr.length-1;i>=0;i--){
                if (arr[i] == target){
                    return i;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        SearchSortedRotated sr = new SearchSortedRotated();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int pos = sr.searchRotatedArr(arr, target);
        System.out.println(pos);
    }
}