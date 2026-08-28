package StanverseTechnologies;

public class SwapNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        swapNumber(a, b);
    }

    public static void swapNumber(int a, int b) {

        a = b - a;
        b = b - a;
        a = a + b;

        System.out.println(a + " " + b);
    }
}
