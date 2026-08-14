package Talentpace;

public class SwapTwoNumber {
    public static void main(String[] args) {

        int a = 15;
        int b = 10;

        swapTwoNum(a, b);


    }

    public static void swapTwoNum(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print(a + " " + b);

    }
}
