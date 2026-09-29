class Solution {
    public boolean hasDuplicate(int[] nums) {

      Set<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            // add() returns false when num already exists in the set.
            if (!seenNumbers.add(num)) {
                return true;
            }
        }

        // Every value was added once, so there are no duplicates.
        return false;
    }
}