class SpiralMatrix {
    public static void printSpiral(int[][] mat) {
        int m= mat.length, n= mat[0].length;
        int i= 0,j= 0;
        while (i< m && j<n) {
            for (int k=j; k<n; k++) System.out.print(mat[i][k] + " ");
            i++;
            for (int k=i; k < m; k++) System.out.print(mat[k][n-1] + " ");
            n--;
            if (i<m) {
                for (int k = n - 1; k >= j; k--) System.out.print(mat[m - 1][k] + " ");
                m--;
            }
            if (j < n) {
                for (int k = m - 1; k >= i; k--) System.out.print(mat[k][j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        printSpiral(mat);
    }
}
