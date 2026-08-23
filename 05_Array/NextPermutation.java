public class NextPermutation 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int i = arr.length - 2;

        if ( arr[i] < arr[i + 1] ) {
            int j = arr.length - 1;
            while ( arr[j] <= arr[i] ) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            for ( int k = 0; k < arr.length; k++ ) {
                System.out.print(arr[k] + " ");
            }
        }
        }
}
