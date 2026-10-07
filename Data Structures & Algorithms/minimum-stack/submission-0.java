class MinStack {
    ArrayDeque<Integer> stack;
    ArrayDeque<Integer> min;

    public MinStack() {
        stack = new ArrayDeque<>();
        min = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()) {
            min.push(val);
        } else {
            min.push(Math.min(min.peek(), val));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
            min.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!stack.isEmpty()) {
            return min.peek();
        }
        return -1;
    }
}
