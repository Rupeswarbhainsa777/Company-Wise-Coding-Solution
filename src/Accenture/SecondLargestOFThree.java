package Accenture;

public class SecondLargestOFThree {

    public static void main(String[] args) {

        int first = 5;
        int second = 10;
        int third = 15;

        int secondLargest;

        if ((first > second && first < third) || (first < second && first > third)) {
            secondLargest = first;
        }
        else if ((second > first && second < third) || (second < first && second > third)) {
            secondLargest = second;
        }
        else {
            secondLargest = third;
        }

        System.out.println("Second largest: " + secondLargest);
    }
}