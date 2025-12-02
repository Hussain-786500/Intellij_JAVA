package com.stringdsajava;

//import java.util.Scanner;
//public class countingVowels {
//    public static void main(String[] args) {
//
//        //input condition
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your Name :");
//        String str = sc.nextLine();

////        Function write.....
//
//        int n = str.length();
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            char ch = str.charAt(i);
//            if(isVowel(ch) == true){
//                count++;
//            }
//        }
//        System.out.println("Total Vowel is : " + count);
//            }
//            public static boolean isVowel (char ch){
//               return "aeiouAEIOU".indexOf(ch) != -1;
//             if(ch == 'a' || ch == 'A') return true;
//             if(ch == 'e' || ch == 'E') return true;
//             if(ch == 'i' || ch == 'I') return true;
//             if(ch == 'o' || ch == 'O') return true;
//             if(ch == 'u' || ch == 'U') return true;
//             return false;
//            }
//        }

//    ******** As it is Vowel char print **********

public class countingVowels {
    public static void main(String[] args){
        String str = " HII IBRAHIM HUSSAIN";
        String[] word = str.split(" ");

        for(String ch : word){
            String vowels = getVowels(ch);
            System.out.println(ch + " -> " + vowels);
        }
    }
    public static String getVowels (String word){
        String result = " ";

        for(char ch : word.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                result += ch;
            }
        }
        return  result;
}

    }
