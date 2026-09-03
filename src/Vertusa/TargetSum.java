package Vertusa;

public class TargetSum {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        targetSum(arr, 5);
    }

    public static void targetSum(int arr[], int target) {


        int length = arr.length - 1;

        for (int i = 1; i <= length; i++) {
            for (int j = 0; j <= length - i; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum = sum + arr[k];
                }
                if (sum == target) {
                    for (int k = j; k < j + i; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();

                }
            }
        }


    }
}
