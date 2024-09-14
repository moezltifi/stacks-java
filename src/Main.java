import stacks.arrayStack.ArrayStack;
import stacks.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Moez", "Ltifi",123));
        stack.push(new Employee("Mohamed", "Ltifi",23));
        stack.push(new Employee("Ahmed", "Ltifi",723));
        stack.push(new Employee("Jhon", "Ltifi",923));

        stack.print();
        System.out.println("peek(): "+stack.peek());
        System.out.println("pop():  "+stack.pop());
        System.out.println("size(): "+stack.size());
    }
}