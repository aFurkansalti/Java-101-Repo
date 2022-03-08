import java.util.Scanner;

/*
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı
yazınız. "Ben dik üçgen ile çözdüm"
 */

public class Pratik3 {
    public static void main(String[] args) {

        double a, b, c, x;
        Scanner input = new Scanner(System.in);

        System.out.print("a kenarına uzunluk giriniz: ");
        a = input.nextInt();

        System.out.print("b kenarına uzunluk giriniz: ");
        b = input.nextInt();

        x = a * a + b * b;
        c = Math.sqrt(x);

        System.out.println("Hipotenüs uzunluğu: " + c);

        double perimeter, area, u;

        u = (a + b + c) / 2;

        perimeter = 2 * u;
        System.out.println("Üçgenin çevresi: " + perimeter);

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.print("Üçgenin alanı: " + area);
    }
}
