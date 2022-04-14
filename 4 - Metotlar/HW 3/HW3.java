import java.util.Scanner;

public class HW3 {

    static void pattern(int n, int t, boolean isitDown) {
        System.out.print(" " + t);

        if (t <= 0) {
            isitDown = false;
        }

        int condition = isitDown ? (t - 5) : (t + 5);

        if (condition <= n) {
            pattern(n, condition, isitDown);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Başlangıç değeri giriniz: ");
        int num = input.nextInt();

        pattern(num, num, true);
    }

}
