public class LongestConsecutiveSequence {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int longest = 0;

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int count = 1;

            while (contains(arr, current + 1)) {
                current++;
                count++;
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println(longest);
    }

    static boolean contains(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}