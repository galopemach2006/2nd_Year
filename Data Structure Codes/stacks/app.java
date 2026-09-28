package stacks;

public class app {
    public static void main(String[] args) {
        stack theStack = new stack(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        
        while(!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }
    }
}
