public class MissingNumber {
    public static int findMissingNumber(int [] nums, int maxNum) {
        // Calculate the expected sum
        int expectedSum = (maxNum * (maxNum + 1)) / 2;

        // Calculate the actual sum
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // Calculate the difference between the expected and actual sums
        int missingNum = expectedSum - actualSum;

        // If there is no missing num, return 0
        return missingNum == 0 ? 0 : missingNum;
    }
}
