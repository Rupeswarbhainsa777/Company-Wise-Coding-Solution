package Amiti;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str);
        System.out.println(reverse(str));

    }

    public static String reverse(String s) {

        String t = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        return t;


    }
}
