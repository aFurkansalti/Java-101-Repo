import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Pratik1 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int select;
        int[] wrongNumber = new int[5];
        boolean isWrong = false;
        boolean isWin = false;

        while (right < 5) {
            select = input.nextInt();

            if ((select < 0) || (select > 99)) {
                if (!isWrong) {
                    System.out.println("Lütfen geçerli bir sayı giriniz! " +
                            "0 ile 100 aralığında olmalı.");
                    System.out.println("Bir sonraki hatalı girişiniz yanlış" +
                            " olarak sayılacaktır!");
                    isWrong = true;
                } else {
                    System.out.println("Lütfen geçerli bir sayı giriniz! " +
                            "0 ile 100 aralığında olmalı.");
                    System.out.println("Fazladan hatalı giriş!");
                    right++;
                }
                System.out.println("Kalan hakkı: " + (5 - right));
                continue;
            }

            if (select == number) {
                System.out.println("Tebrikler! Gizli sayı: " + number);
                isWin = true;
                break;
            } else {
                if (select < number) {
                    System.out.println("Gizli sayıdan küçük bir değer girdiniz.");
                } else if (select > number) {
                    System.out.println("Gizli sayıdan büyük bir değer girdiniz.");
                }

                wrongNumber[right++] = select;
                System.out.println("Kalan hakkı: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Gizli sayı: " + number);
        }

        if (true) {
            System.out.println("Tahminleriniz: " + Arrays.toString(wrongNumber));
        }
    }
}
