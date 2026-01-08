//Q1. Writen a program to (swape matrix) rotate the matrix by 90 degrees clockwise.

public class RotateMatrix {
    public static void print(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

  public static void main(String[] args){

      //input 2D Array
        int[][] arr = {{1, 2, 3}
                      ,{4, 5, 6},
                       {7, 8, 9}};
        int n = arr.length;

       System.out.println("original Matrix");
        print(arr);

        //Step 1: print transpose
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < i; j++) {
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
          }
      }
      //step 2: print 90° rotate
      for(int i = 0; i < n; i++){
          for(int j = 0; j < n/2; j++){
              int temp = arr[i][j];
              arr[i][j] = arr[i][n-1-j];
              arr[i][n-1-j] = temp;
          }
      }
      System.out.ptintln("Matrix after 90° clockwise rotation");
      print(arr);
  }
}
