package com.PassingArray;

//Q1. Find the doublet in the array whose sum is equal to the given
// value x. (Two Sum).

public class QuestionArray {
    public static void main(String[] args){

        int[] arr = {2, 4, 0, 5, 6, 8, 1, 7};
        int x = 10;
        int n = arr.length;

        //solution........

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]+arr[j] == x){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

    }
}
