package stackusingrecursion;

import static stackusingrecursion.SortStackRecursively.sortStack;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack:");
        stack.printStack();

        sortStack(stack);

        System.out.println("Sorted Stack:");
        stack.printStack();
    }
}
