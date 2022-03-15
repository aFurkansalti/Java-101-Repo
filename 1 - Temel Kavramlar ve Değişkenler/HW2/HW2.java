import java.util.Scanner;

/*
Kullanıcıların manavdan almış oldukları ürünlerin kilogram
değerlerine göre toplam tutarını ekrana yazdıran bir program.
 */

public class HW2 {
    public static void main(String[] args) {

        float pear, apple, tomato, banana, eggplant, total;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        pear = input.nextFloat();

        System.out.print("Elma kaç kilo? : ");
        apple = input.nextFloat();

        System.out.print("Domates kaç kilo? :");
        tomato = input.nextFloat();

        System.out.print("Muz kaç kilo? :");
        banana = input.nextFloat();

        System.out.print("Patlıcan kaç kilo? :");
        eggplant = input.nextFloat();

        float pearPrice = pear * 2.14f;
        float applePrice = apple * 3.67f;
        float tomatoPrice = tomato * 1.11f;
        float bananaPrice = banana * 0.95f;
        float eggplantPrice = eggplant * 5.0f;

        total = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;
        System.out.println("Toplam tutar: " + total + " TL");

    }
}
