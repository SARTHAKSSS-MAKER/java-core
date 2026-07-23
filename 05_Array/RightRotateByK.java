public class RightRotateByK {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int k = 2;
        for ( int i = 0; i < k; i++ ) {
            int temp = numbers[numbers.length-1];
            for ( int j = numbers.length-1; j > 0; j-- ) {
                numbers[j] = numbers[j-1];
            }
            numbers[0] = temp;
        }
        for ( int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers[i]);
        }

    }
    
}
