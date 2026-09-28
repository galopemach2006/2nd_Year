package data_Structure_codes;
import java.util.Scanner;

public class Java_Programming_Refresher {
    public static void main(String[] args) {
        System.out.println("DATA STRUCTURES AND ALGORITHMS");
        System.out.println("Java Programming Refresher");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter quiz score: ");
        float quiz_score = sc.nextFloat();

        System.out.print("Enter laboratory score: ");
        float laboratory_score = sc.nextFloat();

        System.out.print("Enter examination score: ");
        float examination_score = sc.nextFloat();

        float average = (quiz_score + laboratory_score + examination_score) / 3;

        if (average >= 75) {
            System.out.println();
            System.out.println("STUDENT PERFORMANCE SUMMARY");
            System.out.println("Student Name: " + name);
            System.out.printf("Quiz Score: %.2f \n", quiz_score);
            System.out.printf("Laboratory Score: %.2f \n", laboratory_score);
            System.out.printf("Examination Score: %.2f \n", examination_score);
            System.out.printf("Final Average: %.2f \n", average);
            System.out.println("Performance Status: PASSED");
        } else { 
            System.out.println();
            System.out.println("STUDENT PERFORMANCE SUMMARY");
            System.out.println("Student Name: " + name);
            System.out.printf("Quiz Score: %.2f \n", quiz_score);
            System.out.printf("Laboratory Score: %.2f \n", laboratory_score);
            System.out.printf("Examination Score: %.2f \n", examination_score);
            System.out.printf("Final Average: %.2f \n", average);
            System.out.println("Performance Status: FAILED");
        }
        sc.close();
    }
}
