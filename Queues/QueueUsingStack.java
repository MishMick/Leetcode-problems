class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    private int front;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        front = -1;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.empty())
            front = x;
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.empty())
            stack1.push(stack2.pop());
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        return stack1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

/* Performance: 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Queue using Stacks.
Memory Usage: 34.1 MB, less than 20.83% of Java online submissions for Implement Queue using Stacks.
*/