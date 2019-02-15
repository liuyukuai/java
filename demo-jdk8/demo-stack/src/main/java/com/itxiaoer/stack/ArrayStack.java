package com.itxiaoer.stack;

/**
 * @author : liuyk
 */
@SuppressWarnings("WeakerAccess")
public class ArrayStack<T> implements Stack<T> {
    private static final int CAPACITY = 16;
    private Object[] elements;
    private int size;
    private int top = -1;


    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) {
        // 省略验证参数
        this.elements = new Object[capacity];
    }


    @Override
    public T push(T t) {
        this.top = size;
        this.elements[size++] = t;
        return t;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() throws RuntimeException {
        if (size == 0) {
            throw new RuntimeException();
        }
        return (T) elements[top];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T pop() throws RuntimeException {
        if (size == 0) {
            throw new RuntimeException();
        }
        Object obj = this.elements[top--];
        this.size--;
        return (T) obj;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 0;
    }
}
