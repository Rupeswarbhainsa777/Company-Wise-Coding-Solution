package StanverseTechnologies;

public class PrintAllSubstring {

    public static void main(String[] args) {

        String str = "abc";
            printSubstring(str);
    }

    public static void printSubstring(String str) {

        int length = str.length();

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j <= length - i; j++) {

                String t = "";
                for (int k = j; k < j + i; k++) {

                    t = t + str.charAt(k);

                }
                System.out.println(t);
            }
        }

    }
}
