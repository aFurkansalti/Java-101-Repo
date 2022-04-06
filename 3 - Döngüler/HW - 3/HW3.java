import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Değer giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < i + 1; space++) {
                System.out.print(" ");
            }

            for (int star = (2*n - 1); star >= (2*i - 1); star--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
