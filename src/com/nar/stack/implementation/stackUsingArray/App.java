package com.nar.stack.implementation.stackUsingArray;

public class App {
    public static void main(String[] args) {
        Stack<String> nameStack= new Stack<String>();

        nameStack.pop();

        nameStack.push("a");
        nameStack.push("b");
        nameStack.push("c");
        nameStack.push("d");

        System.out.println(nameStack.getSize());

        System.out.println("pop1 "+nameStack.pop());
        System.out.println("pop2 "+nameStack.pop());
        System.out.println("pop3 "+nameStack.pop());
        //System.out.println("pop3 "+nameStack.pop());
        //System.out.println("pop4 "+nameStack.pop()); // ON Empty Stack
    }
}
