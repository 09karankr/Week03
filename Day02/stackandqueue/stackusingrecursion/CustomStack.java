package stackusingrecursion;

import java.util.LinkedList;

public class CustomStack {
    private LinkedList<Integer> list;

    public CustomStack(){
        list = new LinkedList<>();
    }

    public void push(int data){
        list.addFirst(data);
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return list.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Print stack elements
    public void printStack() {
        System.out.println(list);
    }
}
