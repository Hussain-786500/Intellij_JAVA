//Q1. Write a program to print the transpose of the matrix entered
// by user store it in new matrix.
//
//public class TransposeMatrix {
//    public static void main(String[] args){
//        //1 2
//        //3 4
//        //5 6
//        int[][] arr = {{1, 2, 7},{3, 4, 9},{5, 6, 3}};
//        int m = arr.length;
//        int n = arr[0].length;
//
//
//        for (int j = 0; j < n; j++) {
//            for (int i = 0; i < m; i++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//2nd method....

import com.sun.security.jgss.GSSUtil;

public class TransposeMatrix {
    public static void main(String[] args){
        int[][] arr = {{1, 2, 7},{3, 4, 9},{5, 6, 3}};
        int m = arr.length;
        int n = arr[0].length;

        int[][] transpose = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();
        }
    }
}