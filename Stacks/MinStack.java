class MinStack {

    /** initialize your data structure here. */
    Stack<Node> stack;
    
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        if(stack.empty()){
            stack.push(new Node(x,x));
        }else{
            int currentMinInStack = stack.peek().currentMin;
            stack.push(new Node(x, Math.min(x, currentMinInStack)));
        }
    }
    
    public void pop() {
        if(!stack.empty())
            stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().currentMin;
    }
}

class Node{
    int val;
    int currentMin;
    
    Node(int val, int currentMin){
        this.val = val;
        this.currentMin = currentMin;
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

 /* Performance: 
Runtime: 5 ms, faster than 94.45% of Java online submissions for Min Stack.
Memory Usage: 40 MB, less than 33.34% of Java online submissions for Min Stack.
*/