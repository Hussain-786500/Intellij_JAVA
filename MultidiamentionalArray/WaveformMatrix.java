public class WaveformMatrix {
    public static void print(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 6}, {4, 5, 6, 8}, {7, 8, 9, 3}, {5, 7, 8, 6}};
        int m = arr.length;
        int n = arr[0].length;

        print(arr);

        System.out.println("yor wave result: ");

        for (int i = 0; i < m; i++) {
            if(i % 2 == 0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
