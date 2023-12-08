import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        boolean check = true;
        while(check){
            int number = sc.nextInt();
            if (number == -1){
                break;
            } else if((number % 2) == 0){
                even += 1;
            } else if((number % 2) == 1){
                odd += 1;
            }
        }System.out.println("Odd number = " + odd + " and Even number = " + even);
    }
}
