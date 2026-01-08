
//public class Basic2Darray {
//    public static void main(String[] args) {
//
//        int[][]grid = new int[3][5];
//        grid[0][0] = 10;
//        grid[0][1] = 20;
//        grid[0][2] = 30;
//        grid[0][3] = 40;
//        System.out.println(grid[2][2]);
//        System.out.println(grid[0][0]);
//
//
//    }
//}
//
//import java.util.Scanner;
//public class Basic2Darray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter your button");
//            int button = sc.nextInt();
//
//            switch (button) {
//                case 1:
//                    System.out.println("Hello");
//                    break;
//                case 2:
//                    System.out.println("Namaste");
//                    break;
//                case 3:
//                    System.out.println("Bonjour");
//                    break;
//                default:
//                    System.out.println("Invalid button");
//            }
//        }
//    }
//
//
//import java.util.Scanner;
//
//public class Basic2Darray {
//    public static void main(String[] args){
//
//        //input
//Scanner sc = new Scanner(System.in);
//        System.out.println("Enter row");
//        int row = sc.nextInt();
//        System.out.println("Enter cols");
//        int cols = sc.nextInt();
//
//        int[][] numbers = new int[row][cols];
//
//        //inner... row
//        for(int i = 0; i < row; i++){
//            //colm
//            for(int j = 0; j < cols; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//        }
//        //outer....row
//        for(int i = 0; i < row; i++){
//            //colm
//            for(int j = 0; j < cols; j++){
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}


//Q.Takes a matrix as input from the user. Search for a given
// number x and print the indices at which is occurs.

import java.util.Scanner;

public class Basic2Darray {
    public static void main(String[] args){

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter cols");
        int cols = sc.nextInt();

        int[][] numbers = new int[row][cols];

        //inner...row
        for(int i = 0; i < row; i++){
            //cols
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //x input
        System.out.println("Enter value of x");
        int x = sc.nextInt();
        //outer...row
        for(int i = 0; i < row; i++){
            //cols
            for(int j = 0; j < cols; j++){
                //compare with x
                if(numbers[i][j] == x ){
                    System.out.println("Found at location of x: (" + i + ", " + j + ")"  );
                }else {
                    System.out.print("X Value not found");
                }
            }
            System.out.println();
        }
    }
}