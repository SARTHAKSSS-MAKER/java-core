public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {10,10,20,20,30,30,40};
        
        int j = 0;
        for ( int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[j]) {
                j++;
                numbers[j] = numbers[i];
            }
        }
        for ( int i = 0; i <= j; i++) {
            System.out.println(numbers[i]);
        }
    }
}
