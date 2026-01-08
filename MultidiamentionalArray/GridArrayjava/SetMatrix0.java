//Q1. Given an (M x N) integer matrix , if an element is 0, et entier
//row and column t 0's,

package com.GridArrayjava;


public class SetMatrix0 {

    //    1st Method .....its very very important...and good method
////
//    public void setZero(int[][] arr) {
//
//        int n = arr.length;
//        int m = arr[0].length;
//
//        boolean firstRow = false;
//        boolean firstCols = false;
//
////       check row & column
//        for (int i = 0; i < n; i++) {
//            if (arr[i][0] == 0) {
//                firstRow = true;
//
//                for (int j = 0; j < m; j++) {
//                    if (arr[0][j] == 0) {
//                        firstCols = true;
//                    }
//                }
//            }
//        }
////     mark row & column
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] == 0) {
//                    arr[i][0] = 0;
//                    arr[0][j] = 0;
//                }
//            }
//        }
////        Apply marks row & column
//        for (int i = 1; i < n; i++) {
//            for (int j = 1; j < m; j++) {
//                if (arr[i][0] == 0 || arr[j][0] == 0) {
//                    arr[i][j] = 0;
//                }
//            }
//        }

    /// /        i needed first cols & row zero
//        if (firstRow) {
//            for (int i = 0; i < n; i++)
//                arr[i][0] = 0;
//
//        }
//
//        if (firstCols) {
//            for (int j = 0; j < m; j++)
//                arr[0][j] = 0;
//        }
//
//    }
//}
//public void main(String[] args) {
//
//    SetMatrix0 s = new SetMatrix0();
//
//    int[][] arr = {
//            {1, 1, 1},
//            {1, 0, 1},
//            {1, 1, 1}
//    };
//    s.setZero(arr);
//
//    int n = arr.length;
//    int m = arr[0].length;
//
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < m; j++) {
//            System.out.print(arr[i][j] + " ");
//        }
//        System.out.println();
//    }
//}
//


//2nd Method ........A straightforward solution using O(mn) space is
// probably a bad idea.(high space required).

    public void setZero(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

// create helper array
        int[][] helper = new int[m][n];

//  copy original to helper
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                helper[i][j] = arr[i][j];
            }
        }

//        check helper and modify error
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {


                //if found zero
                if(helper[i][j] == 0){


                    //set column to 0

                    for (int a = 0; a < n; a++) {
                        arr[a][i] = 0;

                        //set row to 0

                        for (int b = 0; b < m; b++) {
                            arr[i][b] = 0;
                        }
                    }
                }
            }
        }

    }

    public void main(String[] args) {

        SetMatrix0 s = new SetMatrix0();

        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        s.setZero(arr);

        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//3rd Method.....A simple improvement uses O(m + n) space, but still
// not the best solution.(mid space required).

//    public void setZero(int[][] arr) {
//        int m = arr.length;
//        int n = arr[0].length;
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//
////    marking the particular row and col
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 0) {
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
////    set the 'true' rows to 0
//        for (int i = 0; i < m; i++) {
//            if (row[i]) {    // set ith row;
//                for (int j = 0; j < n; j++) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//        for (int j = 0; j < m; j++) {
//            if (col[j] ) {    // set ith col;
//                for (int i = 0; i < n; i++) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//    }
//
//static void main(String[] args){
//
//        blank s = new blank();
//
//        int[][] arr = {
//                {1, 1, 1},
//                {1, 0, 1},
//                {1, 1, 1}
//        };
//        s.setZero(arr);
//
//        int n = arr.length;
//        int m = arr[0].length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
