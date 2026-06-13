class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character,Integer> first = new HashMap<>();
        HashMap<Character,Integer> second = new HashMap<>();

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for (char c : sChars) first.put(c, first.getOrDefault(c, 0) + 1);
        for (char c : tChars) second.put(c, second.getOrDefault(c, 0) + 1);

        return first.equals(second);
    }
}
