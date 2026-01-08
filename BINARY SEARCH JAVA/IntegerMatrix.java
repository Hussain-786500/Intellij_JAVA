package com.binarySearchjava;

public class IntegerMatrix {
    public static boolean searchMatrix(int[][] mat, int x){
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            if(x >= mat[i][0] && x <= mat[i][mat[i].length - 1]){

                int lo = 0;
                int hi = n-1;

                while (lo <= hi){
                    int mid = lo+(hi -lo)/2;

                    if(mat[i][mid] == x){
                        return  true;
                    }else if(mat[i][mid] < x){
                        lo = mid +1;
                    }else{
                        hi = mid -1;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        IntegerMatrix sol = new IntegerMatrix();
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int k = 12;

        System.out.println(sol.searchMatrix(mat, k));

    }
}
