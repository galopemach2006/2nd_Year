package stacks;

public class stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public stack(int size) {
        this.maxSize = size;
        this.stackArray = new long [maxSize];
        this.top = -1;
    }

    public void push(long j) {
        top++;
        stackArray[top] = j;
    }

    public long pop() {
        int old_top = top; //copy the current index position on the top
        top--;
        return stackArray[old_top];
    }

    //push and pop operations

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == 1);
    }

    public boolean isFull() {
        return maxSize - 1 == top;
    }
}
