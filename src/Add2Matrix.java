
//Q1. Write a program to add two matrices.

public class Add2Matrix {
    public static void main(String[] args){

        int[][] a = {{7, 5, 7},{9, 4, 8},{4, 6, 9}};
        int[][] b = {{3, 6, 9},{1, 8, 3},{7, 8, 5}};

        int n = a.length;
        int m = b[0].length;
        int[][] res = new int[m][n];

        //condition check
        //inner loop
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        //outer loop
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
