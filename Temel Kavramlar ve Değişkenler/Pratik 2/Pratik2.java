import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {

        float fiyat, kdv, kdvliFiyat, kdvTutari;

        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat bilgisi giriniz: ");
        fiyat = input.nextFloat();
        System.out.println("KDV'siz Fiyat: " + fiyat);

        kdv = 0 < fiyat && fiyat < 1000 ? 0.18f : 0.08f;
        System.out.println("KDV: " + kdv + " TL");

        kdvTutari = fiyat * kdv;
        System.out.println("KDV Tutarı: " + kdvTutari);

        kdvliFiyat = fiyat + kdvTutari;
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");

    }
}
