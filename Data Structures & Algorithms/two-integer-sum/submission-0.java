class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int complement = target - currentNumber;

            // If the required complement appeared earlier,
            // return its index and the current index.
            if (seenNumbers.containsKey(complement)) {
                return new int[] {seenNumbers.get(complement), i};
            }

            // Store the current number after checking.
            // This ensures we never use the same index twice.
            seenNumbers.put(currentNumber, i);
        }

        // The problem guarantees that one valid pair exists.
        return new int[0];
    }
}
