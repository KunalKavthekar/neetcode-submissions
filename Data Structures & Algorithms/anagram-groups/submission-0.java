class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            anagramMap.computeIfAbsent(sortStringByAscendingOrder(strs[i]), k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(anagramMap.values());
    }

    private String sortStringByAscendingOrder(String input) {
        char[] chars = input.toCharArray();
        
        Arrays.sort(chars);
        
        return new String(chars);
    }
}
