package seven;
import java.util.*;
public class MyQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public MyQueue(){
    }
    
    public void push(int node) {
    	if(stack1.size() == stack1.capacity())
    		System.err.println("Overflow!");
        stack1.push(node);
    }
    
    public int size(){
    	return stack1.size()+stack2.size();
    }
    
    public int pop() {
    	if(stack2.isEmpty())
    		while(!stack1.isEmpty())
    			stack2.push(stack1.pop());
    	if(stack2.isEmpty())
    		System.err.println("Empty Queue");
    	return stack2.pop();
    }
    public static void main(String[] args){
    	MyQueue queue = new MyQueue();
    	int[] a = {1,2,3,4,5,6,7};
    	for(int i = 0; i < a.length; i++){
    		queue.push(a[i]);
    	}
    	while(queue.size() >= 0)
    		System.out.println(queue.pop());
    }
}
