package queueusingstack;



public class QueueUsingStack {
    private StackUsingLinkedList stack1;
    private StackUsingLinkedList stack2;

    public QueueUsingStack() {
        stack1 = new StackUsingLinkedList();
        stack2 = new StackUsingLinkedList();
    }

    // enqueue operation
    public void enqueue(int value){
        stack1.push(value);
        System.out.println(value + "Enqueue");
    }
    // dequeue operation
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
       if (stack2.isEmpty()){
           // Transfer elements from stack 1 to stack 2
           while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
       }
       return stack2.pop();
    }

    public int peek(){
        if (stack2.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
