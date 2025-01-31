package queueusingstack;

public class StackUsingLinkedList {
      private StackNode top;

      public StackUsingLinkedList(){
          this.top = null;

      }

      // push operation to add an element
    public void push(int value){
       StackNode newNode = new StackNode(value);
       newNode.next = top;
       top = newNode;
        System.out.println(value + "pushed to the stack");
    }

    // pop operation to remove the top element
    public int pop(){
          if (isEmpty()){
              System.out.println("StackUnderflow! Cannot pop!");
              return -1;
          }
          int popedValue = top.data;
          top = top.next;
          return popedValue;
      }

      // peek operation to check the top element
    public int peek(){
          if (isEmpty()){
              System.out.println("Stack is empty");
              return -1;
          }
          return top.data;
    }

    public boolean isEmpty(){
          return top == null;
    }
}
