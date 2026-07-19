public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        for ( int i = 0; i < numbers.length; i++ ) {
            System.out.println(numbers[i]);
        }
    }
}
