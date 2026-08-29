package Accenture;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Work";

        System.out.println(reverseString(str));

    }

    public static String reverseString(String str) {

        String t = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            t += str.charAt(i);
        }


        return t;


    }
}
