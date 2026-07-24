public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] numbers = {1,0,2,0,3};
        int j = 0;
        for ( int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] != 0) {
                numbers[j] = numbers[i];
                j++;
            }
        }
        for ( int i = j; i < numbers.length; i++ ) {
            numbers[i] = 0;
        }
        for ( int i = 0; i < numbers.length; i++ ) {
        System.out.println(numbers[i]);
        }
    }
}
