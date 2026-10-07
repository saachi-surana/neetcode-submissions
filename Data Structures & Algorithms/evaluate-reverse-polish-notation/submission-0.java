class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            if(c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if(c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if(c.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if(c.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                int s = Integer.parseInt(c);
                stack.push(s);
            }
        }
        return stack.pop();
    }
}
