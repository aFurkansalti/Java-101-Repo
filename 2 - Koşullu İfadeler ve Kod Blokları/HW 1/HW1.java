import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        
        double distance, age, price, discountedPrice;
        int typeOfTrip;
        Scanner input = new Scanner(System.in);

        System.out.println("Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.");
        System.out.println("Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.");
        System.out.println("Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.");
        System.out.println("Kişi \"Yolculuk Tipini\" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.");

        System.out.print("Yaşınız: ");
        age = input.nextDouble();

        System.out.print("Gideceğiniz mesafe(km): ");
        distance = input.nextDouble();

        System.out.println("Yolculuk Tipi;\n1 - Tek Yön.\n2 - Gidiş-Dönüş.");
        System.out.print("Yolculuk tipinizi seçiniz: ");
        typeOfTrip = input.nextInt();

        price = distance * 0.10;
        System.out.println("Tutar: " + price + "TL");

        switch (typeOfTrip) {
            case 1:
                if ((age >= 0) && (age < 12)) {
                    discountedPrice = price - price * 0.5;
                    System.out.println("İndirimli tutar: " + discountedPrice + "TL");
                } else if ((age >= 12) && (age <= 24)) {
                    discountedPrice = price - price * 0.1;
                    System.out.println("İndirimli tutar: " + discountedPrice + "TL");
                } else if ((age > 24) && (age < 65)) {
                    System.out.println("Tutar: " + price + "TL");
                    System.out.println("Herhangi bir indirim uygulanmadı!");
                } else if (age >= 65) {
                    discountedPrice = price - price * 0.3;
                    System.out.println("İndirimli tutar: " + discountedPrice + "TL");
                } else {
                    System.out.println("Lütfen geçerli bir yaş bilgisi giriniz!");
                }
                break;
            case 2:
                if ((age >= 0) && (age < 12)) {
                    discountedPrice = (price - price * 0.5) - ((price - price * 0.5) * 0.2);
                    System.out.println("İndirimli tutar: " + discountedPrice + "TL");
                } else if ((age >= 12) && (age <= 24)) {
                    discountedPrice = (price - price * 0.1) - ((price - price * 0.1) * 0.2);
                    System.out.println("İndirimli tutar: " + discountedPrice + "TL");
                } else if ((age > 24) && (age < 65)) {
                    discountedPrice = price - (price * 0.2);
                    System.out.println("İndirimli tutar: " + discountedPrice + "TL");
                } else if (age >= 65) {
                    discountedPrice = (price - price * 0.3) - ((price - price * 0.3) * 0.2);
                    System.out.println("İndirimli tutar: " + discountedPrice + "TL");
                } else {
                    System.out.println("Lütfen geçerli bir yaş bilgisi giriniz!");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir yol tipi giriniz.");
                break;
        }

    }
}
