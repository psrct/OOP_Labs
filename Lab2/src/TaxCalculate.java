import java.util.*;
public class TaxCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextInt();
        double tax;
        if (salary > 50000.00) {
            tax = ((salary * 10) / 100);
        } else {
            tax = ((salary * 5) / 100);
        }
        System.out.print(tax);
    }
}
