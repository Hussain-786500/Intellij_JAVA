public class ArrayOfArray {
    public static void main(String[] args){
        int[][] arr = {{12, 34, 56},{22, 67, 89}};

        //from for loop....

//        for(int i = 0; i < 2; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        //from for each loop....

        for(int[] ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
