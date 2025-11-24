
//Q1. Write a program to print sum of all the elements of a 2D matrix.
//
//public class PrintSum {
//    public static void main(String[] args){
//
//        int[][] arr = {{12, 67, 23},{5, 6, 10}};
//        int sum = 0;
//        int n = arr.length;
//        int m = arr[0].length;
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                sum += arr[i][j];
//            }
//        }
//        System.out.println("Total sum is: " + sum);
//    }
//}


public class PrintSum {
    public static void main(String[] args){

        int[][] a = {{1, 9, 2},{3, 7, 4},{8, 5, 6}};
        int[][] b = {{9, 3, 7},{8, 6, 5},{2, 4, 1}};
        int n = a.length;
        int m = b[0].length;

        int[][] res = new int[m][n];

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