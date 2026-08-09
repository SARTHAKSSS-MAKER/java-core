public class RearrangeArrayBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] result = new int[arr.length];
        int posIndex = 1;
        int negIndex = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] < 0 ) {
                result[posIndex] = arr[i];
                posIndex += 2;
            }
            else {
                result[negIndex] = arr[i];
                negIndex += 2;
            }
        }
        for ( int i = 0; i < arr.length; i++ ) {
            System.out.print(result[i] + " ");
        }
    }
}
