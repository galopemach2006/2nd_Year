package data_Structure_codes;
import java.util.Scanner; 

public class V3_TraceAdded {
    private static int moveCount = 0;
    private static String indent(int depth) {
        return " ".repeat(depth);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");

        int numberOfDisks = input.nextInt();

        if (numberOfDisks <= 0) {
            System.out.println("The number of disks must be positive.");
        } else {
            System.out.println("Moves required: ");
            solveHanoi(numberOfDisks, 'A', 'B', 'C', 0);
            System.out.println("Total moves: " + moveCount);
        }
        input.close();
    }
    
    public static void solveHanoi(int n, char source, char helper, char destination, int depth) {
        System.out.println(indent(depth) + "ENTER n=" + n + " [" + source + "," + helper + "," + destination + "]");

        if (n == 1) {
            moveCount++;
            System.out.println(indent(depth) + "MOVE disk 1: " + source + " -> " + destination);
            System.out.println(indent(depth) + "RETURN n=1");
            return;
        }

        solveHanoi(n - 1, source, destination, helper, depth + 1);
        moveCount++;
        System.out.println(indent(depth) + "MOVE disk 1: " + n + ": " + source + " -> " + destination);

        solveHanoi(n - 1, helper, source, destination, depth + 1);
        System.out.println(indent(depth) + "RETURN n=" + n);
    }
}