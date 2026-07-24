public class MoveZerosToStart {
    public static void main(String[] args) {
        int[] numbers = {1,0,2,0,3};
        int j = numbers.length-1;
        for ( int i = numbers.length-1; i >= 0; i-- ) {
            if ( numbers[i] != 0 ) {
                numbers[j] = numbers[i];
                j--;
            }
        }
        for ( int i = 0; i < j ; i++ ) {
            numbers[i] = 0;
        }
        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.println(numbers[i]);
        }
    }
}
