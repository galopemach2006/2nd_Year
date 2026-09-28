package data_Structure_codes;
public class comparison {
    public static void main(String[] args) {
        int [] num = new int[]{12, 25, 7, 18, 30, 42, 9, 15};
        int target = 100;
        int comparisons = 0;
        boolean condition = true;

        for (int i = 0; i < num.length; i++) {
            comparisons++;

            if(num[i] == target) {
                System.out.println(target + " has been found " + condition);
                System.out.println(comparisons);
                break;
            } else {
                 System.out.println("Comparing " + target + " with " + num[i] + " == "  + !condition);
            }
        } 
    }
}
