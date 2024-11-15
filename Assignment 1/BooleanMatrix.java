public class BooleanMatrix {
    public static void modifyMatrix(int[][] mat) {
        int M = mat.length;
        int N = mat[0].length;
        
        boolean[] row = new boolean[M];
        boolean[] col = new boolean[N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] mat = {{1, 0}, {0, 0}};
        modifyMatrix(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

