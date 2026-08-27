package StanverseTechnologies;

import java.util.Arrays;

public class ReArrangeArray {

    public static void main(String[] args) {

        int arr[] = {1, 0, 3, 0, 0};

        reArrangeArray(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void reArrangeArray(int arr[]) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }
}