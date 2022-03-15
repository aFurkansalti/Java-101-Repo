import java.util.Scanner;

public class Pratik3 {
    public static void main(String[] args) {

        double math, physical, turkish, chemical, music, total = 0, average, lessonCounter = 0;
        Scanner input = new Scanner(System.in);

        /*
        Not: Herhangi bir dersin yanlış girilmesi sonucu ortalamanın yanlış sonuç vermemesi için "lessonCounter"
        adında bir değişken tanımladım.
         */

        System.out.println("Derslerinize ait not bilgisini giriniz.");

        System.out.print("Matematik: ");
        math = input.nextInt();
        if (math > 100 || math < 0) {
            System.out.println("Lütfen geçerli bir not girin!");
        } else {
            total += math;
            lessonCounter++;
        }

        System.out.print("Fizik: ");
        physical = input.nextInt();
        if (physical > 100 || physical < 0) {
            System.out.println("Lütfen geçerli bir not girin!");
        } else {
            total += physical;
            lessonCounter++;
        }

        System.out.print("Türkçe: ");
        turkish = input.nextInt();
        if (turkish > 100 || turkish < 0) {
            System.out.println("Lütfen geçerli bir not girin!");
        } else {
            total += turkish;
            lessonCounter++;
        }

        System.out.print("Kimya: ");
        chemical = input.nextInt();
        if (chemical > 100 || chemical < 0) {
            System.out.println("Lütfen geçerli bir not girin!");
        } else {
            total += chemical;
            lessonCounter++;
        }

        System.out.print("Müzik: ");
        music = input.nextInt();
        if (music > 100 || music < 0) {
            System.out.println("Lütfen geçerli bir not girin!");
        } else {
            total += music;
            lessonCounter++;
        }

        average = total / lessonCounter;
        System.out.println("Ortalamanız: " + average);
        System.out.println("Girdiğiniz ders sayısı: " + lessonCounter);

        if (average < 55) {
            System.out.println("Sınıfta kaldınız.");
        } else {
            System.out.println("Sınıfı geçtiniz.");
        }

    }
}
