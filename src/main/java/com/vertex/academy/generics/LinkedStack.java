package com.vertex.academy.generics;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class LinkedStack<T> {
    private Node<T> top = new Node<>(); // End sentinel

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    private static class Node<U> {
        private U item;
        private Node<U> next;

        boolean end() {
            return item == null && next == null;
        }

    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}