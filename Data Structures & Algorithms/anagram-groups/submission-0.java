class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
              Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : strs) {
            int[] frequency = new int[26];

            // Count each lowercase English letter in the current word.
            for (char character : word.toCharArray()) {
                frequency[character - 'a']++;
            }

            // Convert the frequency array to a usable HashMap key.
            String key = Arrays.toString(frequency);

            // Create a group only when this key appears for the first time.
            anagramGroups
                    .computeIfAbsent(key, ignored -> new ArrayList<>())
                    .add(word);
//            The above is equivalent to below
//            anagramGroups.putIfAbsent(key, new ArrayList<>());
//            anagramGroups.get(key).add(word);
        }

        // The order of groups may vary because HashMap does not preserve order.
        return new ArrayList<>(anagramGroups.values());
    }
}
