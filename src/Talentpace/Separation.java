package Talentpace;

public class Separation {
    public static void main(String[] args) {

        int arr[] = {-1, -2, 4, 5};

        separation(arr);

    }

    public static void separation(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
