class MinStack {
    
    class Node{
        int data;
        Node next;
        
        Node(int data,Node link){
            this.data=data;
            this.next=link;
        }
    }
    Node peek;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        this.peek=null;
        this.min=Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(this.peek==null){
            Node newNode = new Node(x,null);
            this.peek=newNode;
            this.min=x;
        }
        else if(x<this.min){
            int temp=(2*x)-this.min;
            Node newNode = new Node(temp,null);
            newNode.next = this.peek;
            this.peek=newNode;
            this.min=x;
        }
        else{
            Node newNode = new Node(x,null);
            newNode.next = this.peek;
            this.peek= newNode;
        }
    }
    
    public void pop() {
        int temp = this.peek.data;
        this.peek=this.peek.next;
        if(temp<this.min){
            this.min=(2*this.min)-temp;
        }
    }
    
    public int top() {
        if (this.peek.data<this.min){
            return this.min;
        }
        else{
            return this.peek.data;
        }
    }
    
    public int getMin() {
        return this.min;
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
