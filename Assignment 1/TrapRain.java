public class TrapRain {

    public static int rainTrap(int[]arr) {
        int n= arr.length;
        int twr= 0;  
        for (int i= 1; i<n-1; i++) {
            int lmx = arr[i];
            for (int j = 0; j<i;j++) {
                lmx = Math.max(lmx, arr[j]);
            }
            
            int rmx= arr[i];
            for (int j=i+1;j<n;j++) {
                rmx=Math.max(rmx,arr[j]);
            }
            
            twr+= Math.max(0,Math.min(lmx,rmx)- arr[i]);
        }
        
        return twr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        System.out.println(rainTrap(arr));
    }
}
