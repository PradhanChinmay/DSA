class MinStack {
    
    Stack<Integer> st;
    Stack<Integer> min_st;

    public MinStack() {
        
        this.st = new Stack<>();
        this.min_st = new Stack<>();
        
    }
    
    public void push(int val) {
        
        st.push(val);
        
        val = Math.min(val, min_st.isEmpty() ? val : min_st.peek());
        
        min_st.push(val);
        
    }
    
    public void pop() {
        
        st.pop();
        min_st.pop();
        
    }
    
    public int top() {
        
        return st.peek();
        
    }
    
    public int getMin() {
        
        
            return min_st.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */