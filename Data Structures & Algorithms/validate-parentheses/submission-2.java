class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if((c == '(' && s.charAt(i) != ')') || (c == '{' && s.charAt(i) != '}') || (c == '[' && s.charAt(i) != ']')) {
                    return false;
                }
            } else {
                return false;
            }
        }

        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
