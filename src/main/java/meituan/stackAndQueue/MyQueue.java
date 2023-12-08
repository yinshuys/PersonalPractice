package meituan.stackAndQueue;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        stackIn.push(x);
    }

    public int pop() {
        int peek = peek();
        stackOut.pop();
        return peek;

    }

    public int peek() {
        if (!stackOut.isEmpty()) return stackOut.peek();
        if (stackIn.isEmpty()) return -1;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
        return stackOut.peek();
    }

    public boolean empty() {
        if (stackOut.isEmpty() && stackIn.isEmpty()) return true;
        else return false;
    }
}
