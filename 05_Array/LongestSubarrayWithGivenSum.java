public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3,};
        int k = 3;
        int maxLength = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            int sum = 0;
            for ( int j = i; j < arr.length; j ++) {
                sum = sum + arr[j];
                if ( sum == k ) {
                    int length = j - i + 1;
                    if ( length > maxLength ) {
                        maxLength = length;
                    }
                }
            }
        }
        System.out.println(maxLength);
    }
}
