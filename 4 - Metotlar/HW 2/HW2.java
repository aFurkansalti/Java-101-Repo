import java.util.Scanner;

public class HW2 {

    static boolean prime(int n, int i) {
        if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i*i > n) {
            return true;
        }

        return prime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Değer giriniz: ");
        num = input.nextInt();

        if (prime(num, 2)) {
            System.out.println(num + " bir asal sayıdır.");
        } else {
            System.out.println(num + " asal sayı değildir.");
        }
    }

}
