class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        if(s.length() % 2 == 1) return false;
        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            } else if(s.charAt(i) == '{'){
                stack.push('}');
            } else if (s.charAt(i) == '['){
                stack.push(']');
            } else {
                if(stack.isEmpty() || s.charAt(i) != stack.pop()) return false;
            }
        }

        if(!stack.isEmpty()) return false;
        return true;
    }
}
