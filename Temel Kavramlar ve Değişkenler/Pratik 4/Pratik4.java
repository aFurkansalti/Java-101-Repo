import java.util.Scanner;

/*
Taksimetre Programı
Gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran bir
program.
 */

public class Pratik4 {
    public static void main(String[] args) {

        double taximeter = 10, km, perKm = 2.2;
        Scanner inp = new Scanner(System.in);

        System.out.print("km bilgisi: ");
        km = inp.nextDouble();

        taximeter += (km * perKm);
        double condition = (taximeter < 20.0) ? 20.0 : taximeter;
        System.out.print("Taximetre bilgisi: " + condition + " TL");
    }
}
