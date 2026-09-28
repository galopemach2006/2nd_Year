package data_Structure_codes;
public class fibonacci_iteration {
    public static void main(String[] args) {
        int a = 0; int b = 1;
        
        for(int i = 0; i < 7; i++) {
            System.out.println(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
