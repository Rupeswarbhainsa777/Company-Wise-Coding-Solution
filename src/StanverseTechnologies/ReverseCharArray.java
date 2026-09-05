package StanverseTechnologies;

public class ReverseCharArray {
    public static void main(String[] args) {

        char arr[] = {'a', 'b', 'c', 'd'};

      char reverseAr[] =  reverse(arr);

      for (int i=0;i<reverseAr.length;i++){
          System.out.print(reverseAr[i]+" ");
      }

    }

    public static char [] reverse(char arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;


    }
}
