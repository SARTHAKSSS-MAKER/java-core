import java.util.HashMap;
public class LongestSubarrayWithGivenSum1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            sum = sum + arr[i];
            if ( sum == k ) {
                maxLength = i + 1;
            }
                int rem = sum - k;
                if ( prefixSumMap.containsKey(rem) ) {
                    int len = i - prefixSumMap.get(rem);
                    maxLength = Math.max(maxLength, len);
                }if ( !prefixSumMap.containsKey(sum) ) {
                    prefixSumMap.put(sum, i);
                }
        }
        System.out.println(maxLength);

}
}