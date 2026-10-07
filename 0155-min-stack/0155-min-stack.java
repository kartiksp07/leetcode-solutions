class MinStack {
    Stack <Integer> s; 
    int min = Integer.MAX_VALUE;
    public MinStack() {
        s = new Stack<>();
    }
    
    
    public void push(int value) {
        if(value <= min){
            s.push(min);
            min = value;
        }
        s.push(value);
    }
    
    public void pop() {
        if(s.pop()==min){min = s.pop();}
    }
    
    public int top() {return s.peek();}
    
    public int getMin() {return min;}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */