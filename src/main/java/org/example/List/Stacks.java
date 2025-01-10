package org.example.List;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: "+animals);
        System.out.println(animals.peek());  //Returns the topmost element of the stack.

        animals.pop();
        System.out.println("Stack: "+animals);
        System.out.println(animals.peek());

    }
}
