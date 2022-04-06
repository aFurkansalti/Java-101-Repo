import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        int n, total, num1 = 0, num2 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Karakter sayısı giriniz: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            total = num1 + num2;

            System.out.println(num1 + "+" + num2 + "=" + total);

            num1 = num2;
            num2 = total;
        }

    }
}
