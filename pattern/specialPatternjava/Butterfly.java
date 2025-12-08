
import java.util.Scanner;
public class Basic2Darray {
    public static void main(String[] args){

        //input condition.....
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();

        //upper half.......

        for(int i = 1; i <= n; i++){      //outer loop
            //1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower half..........

        for(int i = n; i >= 1; i--){      //outer loop
            //1st part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-i);
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
