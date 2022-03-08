import java.util.Scanner;

/*
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
 sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp
  ekrana bastıran programı yazın.
 */

public class Pratik1 {
    public static void main(String[] args) {

        double mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik noutunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double sum = mat + fizik + kimya + turkce + tarih + muzik;
        double average = sum / 6;

        System.out.println("Ortalamanız: " + average);

        String condition = average > 60 ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız!";
        System.out.println(condition);

    }
}

