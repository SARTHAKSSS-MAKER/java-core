public class RightRotateByOne {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int temp = numbers[numbers.length-1];

        for ( int i = numbers.length - 1; i > 0 ; i-- ) {
            numbers[i] = numbers[i-1];
        }
        numbers[0] = temp;
        for ( int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
