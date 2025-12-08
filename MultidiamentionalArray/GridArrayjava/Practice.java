package com.GridArrayjava;

//Q1. Write a program to store 10 at every index of a 2D matrix with 5
// rows and 5 columns.
//
//public class Practice {
//    public static void main(String[] args){
//
//        int[][] arr = new int[5][5];
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr[i][j] = 10;
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//Q2. Write a program to add two matrices and save the result in one of
// the given matrices.

//
//public class Practice {
//    public static void main(String[] args){
//        int[][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
//        int[][] b = {{4, 5, 8},{0, 0, 8},{1, 2, 0}};
//
//        int n = a.length;
//        int m = b[0].length;
//
//        int[][] c = new int[n][m];
//
////        inner loop
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                c[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        //outer loop
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }
//     }
//    }


//Q3. Given a matrix ‘A’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the
//rectangle from (l1,r1) to (l2, r2).

//public class Practice {
//    public int rectangleSum(int[][] A, int l1, int r1, int l2, int r2){
//        int sum = 0;
//
//        //loop over the rectangle
//        for (int i = l1; i < l2; i++) {
//            for (int j = r1; j < r2; j++) {
//                sum += A[i][j];
//            }
//        }
//        return sum;
//    }
//    public static void main(String[] args){
//
//        Practice s = new Practice();
//
//        int[][] A = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A[0].length; j++) {
//                System.out.print(A[i][j] + " ");
//            }

////            System.out.println();
//        }
//
//        int l1 = 0, r1 = 1;
//        int l2 = 2, r2 = 2;
//
//        int res = s.rectangleSum(A, l1, r1, l2, r2);
//        System.out.println("Sum = " + res);
//    }
//}

//Q4. Write a program to find the largest element of a given 2D array of integers.

//public class Practice {
//
//    public int maxSum(int[][] arr){
//        int n = arr.length;
//        int m = arr[0].length;
//
//        int maxRow = 0;
//        int maxRowIndex = -1;
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                maxRow += arr[i][j];
//            }
//            System.out.println("Row " + i + " sum : " + maxRow);
//            if(maxRow > maxSum){
//                maxSum = maxRow;
//                maxRowIndex = i;
//            }
//        }
//        System.out.println("maximum row sum  = " + maxSum);
//        return maxRowIndex;
//    }
//    public static void main(String[] args){
//
//        Practice s = new Practice();
//        int[][] arr = {{2, 4, 6},{1, 9, 5},{3, 5, 7}};
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
//
//        System.out.println("final result:- ");
//
//        //store result
//        int rowIndex = s.maxSum(arr);
//
//        System.out.println("Maximum sum of row Index : " + rowIndex);
//
//    }


//Q6. Write a function which accepts a 2D array of integers and its size as arguments and displays the
//elements of middle row and the elements of middle column.
//
//public class Practice {
//    public void setPlus(int[][] arr){
//        int n = arr.length;
//        int m = arr[0].length;
//
//        int mid = n/2;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(i == mid || j == mid){
//                    System.out.print(arr[i][j] + " ");
//                }else
//                    System.out.print(" " + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        Practice s = new Practice();
//
//        int[][] arr = {{1, 2, 3, 4, 5},{3, 4, 5, 6, 7},{7, 6, 5, 4, 3},{8, 7, 6, 5, 4},{1, 2, 37, 8, 0}};
//        int n = arr.length;
//        int m = arr[0].length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        s.setPlus(arr);
//    }
//}
//

// Q7. print individual column and row sum.
//
//public class Practice {
//    public static void main(String[] args) {
//        int[][] arr = {{1, 1, 2, 2}, {1, 2, 2, 4}, {1, 2, 3, 4}, {1, 4, 1, 2}};
//        int sum = 0;
//        int n = arr.length;
//        for (int col = 0; col < n; col++) {
//            sum += arr[0][col];         // choose print column / row sum
//        }
//        System.out.println(sum);
//    }
//}

// Q8. Write a program to print the elements of both the diagonals in a square matrix.
//
//public class Practice {
//    public void setDiagonal(int[][] arr){
//        int n = arr.length;
//        int m = arr[0].length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(i == j || i + j ==  n-1) {
//                    System.out.print(arr[i][j] + " ");
//                }else System.out.print(" " + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        Practice s = new Practice();
//
//        System.out.println("original array: ");
//        int[][] arr = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
//        int n = arr.length;
//        int m = arr[0].length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Diagonal Array: ");
//        s.setDiagonal(arr);
//    }
//}

//    Q9. Write a program to rotate the matrix by 90 degrees anti-clockwise.
//
//public class Practice {
//    //    ***** print rotate matrix *****
//    public void setRotate(int[][] arr) {
//        int n = arr.length;
//
////        ---- transpose Logic ----
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
////        ----- 90 deg rotate logic -----\
//        for (int j = 0; j < n; j++) {
//            int l = 0, r = n-1;
//            if(l < r){
//                int temp = arr[l][j];
//                arr[l][j] = arr[r][j];
//                arr[r][j] = temp;
//            }
//        }
////        ---- print full transpose matrix ----
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < n; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }
//        }

////    ***** main method print *****
//        public static void main (String[]args){
//            Practice s = new Practice();
//
//            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//            int n = arr.length;
//            int m = arr[0].length;
//
//            System.out.println("Original Array: ");
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("Rotate Matrix :");
//            s.setRotate(arr);
//        }
//    }

// Q10. Write a program to print the matrix in reverse wave form.
//
//public class Practice {
//    public void wavePrint(int[][] arr){
//        int n = arr.length;
//        int m = arr[0].length;
//
//        //Even Column -> top to bottom
//        for (int j = 0; j < m; j++) {
//            if(j % 2 == 0){
//                for (int i = n-1; i >= 0 ; i--) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//            //odd Column -> bottom to top
//            else {
//                for (int i = 0; i < n; i++) {
//                    System.out.print(arr[i][j] + " ");
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args){
//
//        Practice s = new Practice();
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int n = arr.length;
//        int m = arr[0].length;
//
//        System.out.println("Original matrix: ");
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("wave form matrix: ");
//        s.wavePrint(arr);
//    }
//}

//  Q11. Given a positive integer n, generate a n x n matrix filled
//  with elements from 1 to n2 in spiral order.

//public class Practice {
//   public static int[][] printSpiral(int n) {
//       int[][] arr = new int[n][n];
//
//       int minr = 0, maxr = n - 1;
//       int minc = 0, maxc = n - 1;
//       int num = 1;
//
//       while (num <= n * n) {
//
//           //left to right
//           for (int j = minc; j <= maxc; j++) {
//               arr[minr][j] = num++;
//           }
//           minr++;
//
//           //top to bottom
//           for (int i = minr; i <= maxr; i++) {
//               arr[i][maxc] = num++;
//           }
//           maxc--;
//
//           //right to left
//           if (minr <= maxr) {
//               for (int j = maxc; j >= minc; j--) {
//                   arr[maxr][j] = num++;
//               }
//               maxr--;
//           }
//           //bottom to top
//           if (minc <= maxc) {
//               for (int i = maxr; i >= minr; i--) {
//                   arr[i][minc] = num++;
//               }
//               minc++;
//           }
//       }
//           return arr;
//       }
//       public static void main (String[]args){
//           int n = 3;
//           int[][] res = printSpiral(n);
//           for (int i = 0; i < n; i++) {
//               for (int j = 0; j < n; j++) {
//                   System.out.print(res[i][j] + " ");
//               }
//               System.out.println();
//           }
//
//       }
//   }
//


// Q13. Given an m x n integer matrix matrix, if an element is 0, set
// its entire row and column to 0's.

public class Practice {
public void setZero(int[][] arr){
    int n = arr.length;
    int m = arr[0].length;

    boolean[] row = new boolean[n];
    boolean[] col = new boolean[m];

    //marking the particular row & column
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if(arr[i][j] == 0){
                row[i] = true;
                col[j] = true;
            }
        }
    }
    //set the true 0 row & column

    for (int i = 0; i < n; i++) {
        if(row[i]){
            for (int j = 0; j < m; j++) {
                arr[i][j] = 0;
            }
        }
    }
    for (int j = 0; j < m; j++) {
        if(col[j]){
            for (int i = 0; i < n; i++) {
                arr[i][j] = 0;
            }
            System.out.println();
        }
    }
}

    public static void main(String[] args){

        Practice s = new Practice();
        int[][] arr = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };

        s.setZero(arr);

        int n = arr.length;
        int m = arr[0].length;

        System.out.println("original Array : ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}