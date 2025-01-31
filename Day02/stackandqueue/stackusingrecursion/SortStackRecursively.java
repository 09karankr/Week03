package stackusingrecursion;

import java.util.Stack;

public class SortStackRecursively {
    public static void sortStack(CustomStack stack){
        if (!stack.isEmpty()){
            int top = (int) stack.pop();
            sortStack(stack);
            insertInsortedOrder(stack,top);
        }
    }
     //Helper function to insert an element in sorted order
    public static void insertInsortedOrder(CustomStack stack, int element){
        if (stack.isEmpty() || element > (int) stack.peek()){
            stack.push(element);
        } else{
            int top = (int) stack.pop();
            insertInsortedOrder(stack, element);
            stack.push(top);
        }
    }
}
