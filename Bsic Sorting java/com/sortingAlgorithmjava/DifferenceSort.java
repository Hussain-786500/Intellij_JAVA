package com.sortingAlgorithmjava;

public class DifferenceSort {

//       ---- function ----
    public static int findK(int[] arr){
        int n = arr.length;
        int sum = arr[0] + arr[n-1];

        if(sum % 2 != 0)return -1;
        int k = sum/2;

        boolean Decreasing = true;

        for (int i = 1; i < n; i++) {
            int prevDist = Math.abs(arr[i - 1] - k);
            int currDist = Math.abs(arr[i] - k);

            if (Decreasing) {
                if (currDist > prevDist) {
                    Decreasing = false;

                } else {
                    if (currDist < prevDist) {
                        Decreasing = false;
                        return -1;
                    }
                }
            }
        }
        return k;
    }

        public static void main(String[] args) {
            int[] arr = {4, 2, 6};
            System.out.println(findK(arr));
        }
    }


