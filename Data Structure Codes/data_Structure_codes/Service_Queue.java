package data_Structure_codes;
public class Service_Queue {
    public static void main(String[] args) {
        int[] request_numbers = new int[7];
        int even_numbers = 0;

        System.out.print("All Service Request Numbers - ");
        for (int i = 1; i <= request_numbers.length; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.print("All Even Numbers - ");
        for (int i = 1; i <= request_numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                even_numbers += 1;
            }
        }
        
        System.out.println();
        System.out.println("Number of Even Numbers: " + even_numbers);
    }
}
