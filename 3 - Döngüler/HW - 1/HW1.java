import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        int howMany, number, min = 0, max = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        howMany = input.nextInt();

        for (int i = 0; i < howMany; i++) {

            System.out.print("Sayı giriniz: ");
            number = input.nextInt();


            if (min == 0) {
                min = number;
            } else if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }

        }

        System.out.println("max: " + max + "\nmin: " + min);

    }
}
