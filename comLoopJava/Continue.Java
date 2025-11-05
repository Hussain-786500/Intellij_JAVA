package comLoopJava;

//public class Continue {
//    public static void main(String[] args) {
//
//        for (int i = 0; i <= 10; i++) {
//            if (i == 5) {
//                System.out.println( 5 +": Detected");
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}

public class Continue {
    public static void main(String[] args){

        // 100 iteration........

        for(int i = 1; i<= 100; i++){
            if(i % 2 == 0) {
                continue;
            }
                System.out.println(i + " ");
        }
    }
}
