public class MaxOne {
    static int rowWithMaxOnes(int[][] m) {
        int maxRow = -1, maxCount = -1;

        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) count++;
            }

            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        return maxRow;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {0, 0, 0, 1},
            {1, 1, 1, 1}
        };
        System.out.println(rowWithMaxOnes(matrix));
    }
}
