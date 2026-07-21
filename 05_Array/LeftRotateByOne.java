public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int temp = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = temp;
        for ( int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}