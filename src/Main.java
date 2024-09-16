import stacks.arrayStack.ArrayStack;
import stacks.Employee;
import stacks.linkedStack.LinkedStack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array");
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Moez", "Ltifi",123));
        stack.push(new Employee("Mohamed", "Ltifi",23));
        stack.push(new Employee("Ahmed", "Ltifi",723));
        stack.push(new Employee("Jhon", "Ltifi",923));

        stack.print();
        System.out.println("peek(): "+stack.peek());
        System.out.println("pop():  "+stack.pop());
        System.out.println("size(): "+stack.size());


        System.out.println("Linked List");
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(new Employee("Moez", "Ltifi",123));
        linkedStack.push(new Employee("Mohamed", "Ltifi",23));
        linkedStack.push(new Employee("Ahmed", "Ltifi",723));
        linkedStack.push(new Employee("Jhon", "Ltifi",923));
        linkedStack.printStack();
        System.out.println("peek(): "+linkedStack.peek());
        System.out.println("pop():  "+linkedStack.pop());
        System.out.println("size(): "+linkedStack.size());
    }
}