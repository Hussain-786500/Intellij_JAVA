package com.GridArrayjava;

//Q1. write an efficient algorithm that search for a value target in an
// (M x N) Integer matrix which has the following properties:
// A. Integers in each row are sorted in ascending form left to right
// B. Integers in each column are sorted in ascending from top to bottom.

public class SearchMatrix {
    //    ****** Method to logic create ******
    public boolean search(int[][] arr, int target){
        int n = arr.length;
        int m = arr[0].length;

        int i = 0, j = m-1;          // fixed !!
        while (i < n && j >= 0){
            if(arr[i][j] == target) return true;
            else if(arr[i][j] > target) j--;        // go left
            else i++;                               // go down
        }
        return false;
    }

    //    ****** Men Method to print matrix ******
    public static void main(String[] args){

//       ------ create object of solution ------
        SearchMatrix s = new SearchMatrix();      // class name fixed

//       ------ Hardcode matrix (without matrix) ------
        int[][] matrix = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        int target = 9;

//           --- call to method -----
        boolean res = s.search(matrix, target);

        //print result
        System.out.println("Target found :" + res);

    }
}


