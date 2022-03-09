import java.util.Scanner;

/*
Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin veya dairenin alanını
veya çevresini bulan bir program.
*/

public class Pratik5 {
    public static void main(String[] args) {

        // r: Daire yarıçapı, a: Merke açısı,
        double pi = 3.14, r, a, area, perimeter;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap bilgisi giriniz: ");
        r = input.nextDouble();

        System.out.print("Merkez açısı bilgisi giriniz: ");
        a = input.nextDouble();

        area = pi * r * r * (a / 360.0);
        String condition1 = (a == 360.0) ? "Daire alanı: " : "Daire diliminin alanı: ";
        System.out.println(condition1 + area + " br^2");

        perimeter = 2 * pi * r * (a / 360);
        String condition2 = (a == 360.0) ? "Dairenin çevresi: " : "Daire diliminin çevresi: ";
        System.out.println(condition2 + perimeter + " br");

    }
}
