public class WhileLoop3 {
    // for checking the featureA branch.
    public static void main(String[] args) {

        int num = 1;
        int product = 1;

        while (num <= 10) {
            product = product*num;
            num ++;
        }
        System.out.println(product);
    }
}