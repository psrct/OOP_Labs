import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        System.out.print("Input your money : ");
        double deposit = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char choose = text.next().charAt(0);
        if (choose == 'A') {
            deposit = (deposit + ((deposit * 1.5) / 100));
        } else if(choose == 'B') {
            deposit = (deposit + ((deposit * 2.0) / 100));
        } else if(choose == 'C') {
            deposit = (deposit + ((deposit * 1.5) / 100));
        } else if(choose == 'X') {
            deposit = (deposit + ((deposit * 5.0) / 100));
        }
        System.out.print("Your total money in one year = " + deposit);
    }
}
