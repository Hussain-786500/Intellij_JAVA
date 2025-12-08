
//Q1. Write a java program to find the largest element of a
// given 2D Array of integers.

//for max value
//public class LargestElement {
//    public static void main(String[] args){
//        int[][] arr = {{2, 5, 7},{2, 7, 9},{5, 7, 10}};
//        int mx = Integer.MIN_VALUE;
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                mx = Math.max(mx, arr[i][j]);
//
//            }
//        }
//        System.out.println(mx);
//    }
//}

public class LargestElement {
    public static void main(String[] args){

        int[][] arr = {{2, 6, 9}, {4, 8, 9}, {9, 47, 20}};
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min, arr[i][j]);

            }
        }
        System.out.println(min);
    }
}