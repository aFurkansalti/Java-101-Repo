import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        int num, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }

        if (total == num) {
            System.out.println(num + " sayısı bir mükemmel sayısır.");
        } else {
            System.out.println(num + " sayısı bir mükemmel sayı değildir!");
        }
    }
}
