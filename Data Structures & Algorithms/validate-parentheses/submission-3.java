class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        if(s.length() % 2 == 1) return false;
        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i);
            if(c == '('){
                stack.push(')');
            } else if(c == '{'){
                stack.push('}');
            } else if (c == '['){
                stack.push(']');
            } else {
                if(stack.isEmpty() || c != stack.pop()) return false;
            }
        }

        if(!stack.isEmpty()) return false;
        return true;
    }
}
