package data_Structure_codes;
public class largest_number { 
    public static void main(String[] args) {
        int [] num = new int[]{45, 12, 89, 34, 67, 23, 91, 8, 56, 73};
        int comparisons = 0;
        int maximum = num[0];


        for (int i = 0; i < num.length; i++) {
            comparisons++;

            System.out.println(num[i] + " compared with " + maximum);

            if(num[i] > maximum) {
                maximum = num[i];
            } 
            
        } 
        System.out.println("Largest Value == " + maximum);
        System.out.println(comparisons);
    }
}


