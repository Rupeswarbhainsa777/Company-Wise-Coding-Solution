package Talentpace;

public class FindMinMax {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 5, 4};
        System.out.println(minAndMax(arr));

    }

    public static String minAndMax(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }

            i++;
        }while (j < arr.length) {
            if (max < arr[j]) {
                max = arr[j];
            }

            j++;
        }

        return min + " " + max;
    }
}
