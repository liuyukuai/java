package com.itxiaoer.stack;

/**
 * @author : liuyk
 */
public class Main {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<>();


        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println("size = " + stack.size());

        String peek = stack.peek();
        System.out.println(peek);


        String pop = stack.pop();
        System.out.println(pop);

        pop = stack.pop();
        System.out.println(pop);

        pop = stack.pop();
        System.out.println(pop);

        pop = stack.pop();

        System.out.println(pop);
        pop = stack.pop();
        System.out.println(pop);


    }
}
