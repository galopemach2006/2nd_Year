package data_Structure_codes;
public class nested_loops {
    public static void main(String[] args) {
        int n = 100;
        int num_of_times_executed = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + ", " + j);
                num_of_times_executed++;
            }
        }
        System.out.println(num_of_times_executed);
    }
}