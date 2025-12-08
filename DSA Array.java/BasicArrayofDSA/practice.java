package com.BasicArrayofDSA;

//Q1. Calculate the product of all the elements in the given array.
//
//public class practice {
//    public static void main(String[] args){
//
//        int[] arr = {2, 3, 4, 5, 6};
//        int n = arr.length;
//
//        int product = 1;   //start from 1
//
//        //condition check...
//
//        for(int i = 0; i < n; i++){
//            product = product + arr[i];
//        }
//        System.out.println("product: " + product);
//
//    }
//}

//Q2. Find the Second Largest element in the given Array in one pass.
//
//public class practice {
//    public static void main(String[] args){
//
//        int[] arr = {11, 2, 8, 33, 49, 28, 21};
//        int n = arr.length;
//        int[] ans = new int[n];
//        ans[n-1] = -1;
//
//        //condition check....
//
//        for(int i = 0; i < n-1; i++){
//            int mx = Integer.MIN_VALUE;
//        for(int j = i + 1; j < n; j++){
//            mx = Math.max(mx,arr[j]);
//        }
//        ans[i] = mx;
//        }
//        for(int ele : arr){
//            System.out.print(ele + " ");
//        }
//        System.out.println();
//        for(int ele : ans){
//            System.out.print(ele + " ");
//        }
//    }
//}

//Q3. Find the minimum value out of all elements in the array.
//
//public class practice {
//    public static void main(String[] args) {
//
//        int[] arr = {11, 20, 7, 45, 7, 16, 40};
//        int n = arr.length;
//
//        int min = arr[0];   // assume first element is minimum
//
//        //condition check...
//        for(int i = 0; i < n; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println("Minimum value : " + min);
//    }
//}

//Q4. WAP to find the duplicate elements from the given array of
// elements.

//public class practice {
//    public static void main(String[] args){
//
//       int[] arr = {3, 5, 7, 1, 3, 8, 1, 5, 7};
//       int n = arr.length;
//
//        System.out.println("Duplicate element : ");
//
//        //condition check...
//
//        for(int i = 0; i < n; i++){
//            for(int j = i + 1; j < n; j++){
//                if(arr[i] == arr[j]){
//                    System.out.print(arr[i] + " ");
//                    break;
//                }
//            }
//        }
//    }
//}

//Q5. WAP to find the smallest missing positive element in the sorted Array. (take the array as input)
// with sorted array.........

//public class practice {
//    public static void main(String[] args){
//
//        int[] arr = {1, 2, 3, 4,  5, 6, 8};    // sorted array
//        int n = arr.length;
//
//        int expected = 1;     // smallest positive number
//
//        //condition check
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] == expected){
//                expected++;           // move to next expected number
//            }
//            else if (arr[i] > expected){
//                break;               // missing number found
//            }
//        }
//        System.out.println("Missing smallest number : " + expected);
//    }
//}

// without sorted array......
//
//public class practice {
//    public static void main(String[] args){
//
//        int[] arr = {1, 6, 4, 8, 3, 5, 2};    //without sorted array
//        int n = arr.length;
//
//        java.util.Arrays.sort(arr);   // convert sorted array
//
//        int expected = 1;                 // smallest positive number
//
//        //condition check....
//
//        for(int i = 1; i < n; i++){
//            if(arr[i] == expected + 1){
//                expected++;              // move to next positive number
//            }
//        }
//        System.out.println("smallest missing number: " + expected);
//    }
//}


//Q6. WAP to find the  missing positive element and find the greatest mising number in the sorted Array.
//
//import java.util.Arrays;
//
//public class practice {
//    public static void main(String[] args) {
//
//        int[] arr = {1, 6, 4, 8, 3, 5, 2, 10};       //unsorted array
//        int n = arr.length;
//        Arrays.sort(arr);            // sorted array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) convert
//
//

import javax.naming.ldap.PagedResultsResponseControl;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

////        *********** condition check ***********
//        //find smallest missing number....
//
//        int expected = 1;                  //default check.......
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == expected) {
//                expected++;            // move to next positive number
//            }
//        }
//
//        //find Greatest missing number....
//
//        int GreatestMissing = -1;            // default check
//        for (int i = 1; i < n; i++) {
//            if (arr[i] != arr[i - 1] + 1) {
//                GreatestMissing = arr[i];       //find missing number
//            }
//        }
//        System.out.println("Smallest missing number : " + expected);
//        System.out.println("Greatest missing number : " + GreatestMissing);
//    }
//}

// Q7. Count the number of elements strictly greater than x.
//
//public class practice {
//    public static void main(String[] args) {
//        int[] arr = {3, 10, 5, 2, 12, 7, 1};         // Example array
//        int x = 5;                                   // value of x
//        int count = 0;                               // count element
//
//        int n = arr.length;
//
//        System.out.print("greater than element : " + x + " = " );
//        //condition check ...........
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] > x){
//                System.out.print(arr[i] + " ");         // print number
//                count++;               //increase element
//            }
//        }
//        //print result
//        System.out.println();     //new line after printing element
//        System.out.println("Total greater than element : " + x + " = " + count);
//    }
//}

//Q8. WAP to find the largest three elements in the array.
//
//public class practice {
//    public static void main(String[] args){
//        int[] arr = {1, 5, 17, 10, 9, 4, 3, 7, 2, 8};      // example array
//        int first = -1, second = -1, third = -1;
//
//        //condition check..........
//
//        for(int x : arr){
//            if( x > first){
//             third = second;
//             second = first;
//             first = x;
//            }
//            else if(x > second){
//                third = second;
//                second = x;
//            }
//            else if(x > third){
//                third = x;
//            }
//        }
//
//        System.out.println("Largest three elements: " + third +  " " + second + " " + first) ;
//    }
//}

//Q9. Check if the given array is sorted or not
//
//public class practice {
//    public static void main(String[] args) {
//
//        int[] arr = {1, 3, 6, 8, 33, 12, 7, 8, 2, 10, 11, 9};  // Example array
////        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        int n = arr.length;
//
//        boolean isSorted = true;        // assume array is sorted
//
//        // condition check......
//
//        for(int i = 0; i < n - 1; i++){
//            if(arr[i] > arr[i + 1]){    //if order is breaked so not sorted
//                isSorted = false;
//                break;
//            }
//        }
//        //first doing print array

//        System.out.println("Array : " + Arrays.toString(arr));

//        //print result sorted or not
//      if(isSorted){
//          System.out.println("Status : Sorted");
//      }else{
//          System.out.println("Status : Not sorted");
//      }
//
//    }
//}


//Q9. Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
//
//public class practice {
//    public static void main(String[] args){
//        int[]arr = {1, 2, 3, 5, 6, 7, 8, 9, 12};    // Example array
//        int n = arr.length;
//
//        int evenSum = 0;      // sum of even index element
//        int oddSum = 0;       // sum of odd index element
//
//
//        //condition check........
//
//        for(int i = 0; i < n; i++){
//
//            if(i % 2 == 0){
//                evenSum += arr[i];          // if index is even
//            }else {
//                oddSum += arr[i];          // if index is odd
//            }
//        }
//
//       // print result
//        int difference = evenSum - oddSum;     //difference between even or odd sum number
//
//        System.out.println("Sum of even index : " + evenSum);
//        System.out.println("Sum of odd index : " + oddSum);
//        System.out.println("Difference : " + difference);
//    }
//}


// Q10. Given an array of integers, change the value of all odd indexed elements to its second multiple and
//increment all even indexed values by 10.
//
//public class practice {
//    public static void main(String[] args) {
//
//        int[] arr = {5, 10, 3, 6, 8};
//        int n = arr.length;
//
//        //condition check
//
//        for(int i = 0; i < n; i++){
//
//            if(i % 2 == 0) {                //if index is even
//                arr[i] = arr[i] + 10;       // increment by 10
//            }else {
//                arr[i] = arr[i] * 2;        // multiply by 2
//            }
//        }
//        //print complete result
//        System.out.print("Updated Array : " );
//
//        for(int value : arr){
//            System.out.print(value + " ");
//        }
//
//    }
//}


//Q11. Find the unique number in a given Array where all the elements are being repeated twice with one value
//being unique.
//
//public class practice {
//    public static void main(String[] args) {
//
//        int[] arr = {2, 5, 3, 2, 3, 7, 5};      // Example array
//        int unique = 0;
//
//        //condition check....
//
//        for(int num : arr){
//            unique = unique ^ num;
//        }
//        System.out.println("Final unique value : " + unique);
//    }
//}

//Q12. If an array arr contains n elements, then check if the given array is a palindrome or not .
//
//public class practice {
//    public static void main(String[] args){
//
//        int[] arr = {1, 2, 3, 2, 1, 4};
//        int n = arr.length;
//
//        boolean isPalindrome = true;       // assume array is palindrome
//
//       // condition check..........
//
//        for(int i = 0; i < n / 2; i++){
//            if(arr[i] != arr[n - 1 - i]){
//                isPalindrome = false;
//               break;
//            }
//        }
//        if(isPalindrome){
//            System.out.println("Array is palindrome");
//        }else {
//            System.out.println("Array is not palindrome");
//        }
//    }
//}

//Q13. find the error.

//    this code is incorrect............
//
//public class practice {
//    double getAverage(int arr[], int size);
//        public static void main (String[]args){
//            int[] balance = {1000, 2, 3, 17, 50};
//            double avg;
//            avg = getAverage(balance[0], 5);
//
//            System.out.println("Average value is : " + avg);
//        }
//    }

//correct code ...........
//
//public class practice {
//
//    static double getAverage(int arr[], int size){
//
//        int sum = 0;
//
//        // condition check
//
//        for(int i = 0; i < size; i++){
//            sum += arr[i];
//        }
//        return (double) sum / size;         // return this method...
//    }
//
//   public static void main(String[] args){
//       int[] balance = {1000, 2, 3, 17, 50};    // Example array
//       double avg;
//
//       avg = getAverage(balance , 5);      // call the method
//
//       // print result
//       System.out.println("Average value is : " + avg);
//   }
//    }

//Q14.  Q14. You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m
//and n, representing the number of elements in nums1 and nums2 respectively.
//
//public class practice {
//    public static void main(String[] args) {
//
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {2, 5, 6};
//        int n = 3;
//
//        int p1 = m - 1;          //last valid element in nums1
//        int p2 = n - 1;           // last element in nums2
//        int p = m + n -1;        // last position in nums1
//
//
//        // merge condition........
//
//        while (p1 >= 0 && p2 >= 0){
//            if(nums1[p1] > nums2[p2]){
//                nums1[p] = nums2[p2];
//                p1--;
//            }else {
//                nums1[p] = nums2[p2];
//                p2--;
//            }
//            p--;
//        }
//
//        //copy remaining element...
//        while (p2 >= 0){
//            nums1[p] = nums2[p2];
//            p2--;
//            p--;
//        }
//
//        //print result....
//        for(int num : nums1){
//            System.out.print(num + " ");
//           }
//
//        }
//
//    }

//Q15. Count the number of triplets whose sum is equal to the given value x.
//
//public class practice {
//    public static void main(String[] args){
//
//        int[] arr = {1, 2, 3, 4,5, 6};       // Example array
//        int x = 10;                          // target array
//        int n = arr.length;
//        int count = 0;                      // Triplet count
//
//        Arrays.sort(arr);                   // sort array
//
//        //condition check..........use two pointer....
//
//        System.out.println("Triples");         // print
//
//        for(int i = 0; i < n - 2; i++){
//
//            int l = i + 1;                     // left pointer
//            int r = n - 1;                     // right pointer
//
//            while (l < r){                     // two pointer logic
//                int sum = arr[i] + arr[l] + arr[r];
//                if(sum == x){
//
//                    // print the found triplet.....
//                    System.out.println("(" + arr[i] + ", " + arr[l] + ", " + arr[r]+ ") = " + x );
//
//                    count++;                    //  increase triplet count
//                    l++;                        // move both pointer
//                    r--;
//                } else if (sum < x){
//                    l++;                       // move left pointer forward
//                }else {
//                    r--;                      // move right pointer backward
//                }
//            }
//        }
//
//        // final print result.......
//
//        System.out.print("Total Number of triples : " + count);
//
//    }
//}

// Q16. Find the factorial of a large number.
//import java.util.Scanner;
//public class practice {
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("inter factorial number : ");
//        int n = sc.nextInt();
//
////      int n = 15;                           // we want number factorial
//      BigInteger fact = BigInteger.ONE;    // start factorial value as 1
//
//      //condition check..........
//
//      //multiply number of 2 to n to calculate factorial
//
//        for(int i = 2; i <= n; i++){
//            fact = fact.multiply(BigInteger.valueOf(i));
//        }
//        //print result...........
//
//        System.out.println("Number of factorial " + n + " = " + fact);
//    }
//}

//Q17. Find the first non-repeating element in the array .
//
//public class practice {
//    public static void main(String[] args){
//
//        int[] arr = {4, 5,  9, 4, 9, 8};    //example array
//
//       //HashMap to store frequency of each element
//        HashMap< Integer, Integer> map = new HashMap<>();
//
//        //count occurrence of each element
//
//        for(int num : arr){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        //find the first element with  frequency
//
//        int answer = -1;           //Default if no unique number element
//        for(int num : arr){
//            if (map.get(num) == 1){
//                answer = num;
//                break;
//            }
//        }
//        //print result..........
//
//        System.out.println("First non-repeating element: " + answer);
//
//    }
//}

//Q18. What does the code determine ?
//
//public class practice {
//    public static void main(String[] args) {
//
//        int[] arr = {1, 7, 3, 9, 5};
//        int n = arr.length;
//        int element = 3;
//        boolean found = false;
//
//        for(int i = 0; i < n; i++){
//            if(arr[i] == element){
//                found = true;
//                break;
//            }
//        }
//        System.out.println("element " + found);
//    }
//}

//Q14. find the second largest number element?

public class practice {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 9, 5};
        int max = arr[0];
        int element = arr[0];
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                element = max;
                max = arr[i];

            }else if(arr[i] > element && arr[i] != max ){
                element = arr[i];
            }
        }
        System.out.println(element);
      }
    }
