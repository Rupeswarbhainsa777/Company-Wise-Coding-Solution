package Talentpace;

import java.util.Scanner;

public class ReverseWordsString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String arr[] = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (i == 0) {
                sb.append(arr[i]);
            } else {

                sb.append(arr[i]);
                sb.append(" ");

            }


        }

        return sb.toString();


    }
}
