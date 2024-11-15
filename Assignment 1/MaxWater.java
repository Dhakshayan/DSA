public class MaxWater {

    public int maxAreaOptimized(int[] height) {
        int maxarea= 0;
        int left =0;
        int right=height.length-1;

        while (left<right) {
            int area= Math.min(height[left], height[right])* (right-left);
            maxarea= Math.max(maxarea, area);
            if (height[left]< height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxarea;
    }

    public static void main(String[] args) {
        MaxWater mw= new MaxWater();
        int[] height= {3, 1, 2, 4, 5};
        System.out.println(mw.maxAreaOptimized(height));
    }
}
