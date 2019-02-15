package com.itxiaoer.stack;


/**
 * stack 接口
 *
 * @author : liuyk
 */
@SuppressWarnings({"unused", "UnusedReturnValue"})
public interface Stack<T> {
    /**
     * push
     *
     * @param t t
     * @return t
     */
    T push(T t);

    /**
     * peek t  t
     *
     * @return t
     * @throws RuntimeException e
     */
    T peek() throws RuntimeException;

    /**
     * pop t
     *
     * @return t
     * @throws RuntimeException e
     */
    T pop() throws RuntimeException;

    /**
     * size
     *
     * @return size
     */
    int size();

    /**
     * isEmpty
     *
     * @return true | false
     */
    boolean isEmpty();
}
