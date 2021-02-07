class MinStack {
    //Note: This approach uses two stacks which is not ideal but works in o(1) complexity;
    Stack<Integer> stack;
    Stack<Integer> minVals;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack();
        this.minVals = new Stack();
    }
    
    public void push(int x) {
        if(minVals.isEmpty() || x<=minVals.peek()){
            this.minVals.push(x);
        }
        this.stack.push(x);
    }
    
    public void pop() {
        if(stack.peek().equals(minVals.peek())){
            this.minVals.pop();
        }
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minVals.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
