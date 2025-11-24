//public class practiceArray {
//    public static void main(String[] args){
//        int[][] grid = new int[3][3];
//
//        grid[0][0] = 10;
//        grid[0][1] = 20;
//        grid[0][2] = 30;
//
//        System.out.println(grid[0][2]);
//    }
//}

//public class practiceArray {
//    public static void main(String[] args){
//        int[][] arr = new int[2][3];
//        arr[0][0] = 20;
//        arr[0][1] = 30;
//        arr[0][2] = 40;
//
//        arr[1][0] = 50;
//        arr[1][1] = 60;
//        arr[1][2] = 70;
//
//        for(int i = 0; i < 2; i++){            // row
//            for(int j = 0; j < 3; j++){        // cols
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Scanner;

public class practiceArray {
    public static void main(String[] args){

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r = sc.nextInt();
        System.out.println("Enter cols");
        int c = sc.nextInt();
        int[][] arr = new int[3][3];

        System.out.println("Enter your matrix");
        //inner loop
        for(int i = 0; i < r; i++){           //row
            for(int j = 0; j < c; j++){       // cols
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" yor result");
        //outer loop
        for(int i = 0; i < r; i++){           //row
            for(int j = 0; j < c; j++){       //cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}