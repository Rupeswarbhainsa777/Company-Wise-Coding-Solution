package Talentpace;

import java.util.Scanner;

public class SumOfSubarray {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};

        sumOfAll(3, arr);

    }

    public static void sumOfAll(int size, int arr[]) {


        for (int i = 0; i <= arr.length - size; i++) {

            int sum = 0;
            for (int j = i; j < size + i; j++) {
                sum = sum+arr[j];
            }
            System.out.println(sum  );
        }


    }
}
