import java.util.Scanner;
public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int floor = sc.nextInt();
        for (int i = 1; i > floor; i++){
            System.out.println("#-#-#-#-#");
        }
    }
}
