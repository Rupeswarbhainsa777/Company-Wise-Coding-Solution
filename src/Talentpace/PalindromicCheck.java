package Talentpace;

public class PalindromicCheck {

    public static void main(String[] args) {

        String str = "aba";

        String res = palindrome(str);

        if(str.equals(res)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

    public static String palindrome(String str) {

        String t = "";


        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            t = t + ch;
        }

        return t;

    }


}
