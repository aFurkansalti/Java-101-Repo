import java.util.Scanner;

/*
Kullanıcıdan boy ve kilo değerlerini alıp "Vücut Kitle İndeks" değerini
hesaplayıp ekrana yazdıran bir program.
 */

public class HW1 {
    public static void main(String[] args) {

        double bmIndex, height, weight;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bouyunuzu (metre cinsinden) giriniz: ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = input.nextDouble();

        bmIndex = weight / (height * height);
        System.out.println("Vücut kitle indeksiniz: " + bmIndex);
    }
}
