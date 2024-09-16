package stacks.linkedStack;

import stacks.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Employee> stack;
    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }
    public void push(Employee employee) {
        stack.push(employee);
    }
    public Employee pop() {
        return stack.pop();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }
    public Employee peek() {
        return stack.peek();
    }
    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
