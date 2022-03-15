import java.util.Scanner;

public class Pratik1 {
    public static void main(String[] args) {

        int select;
        float n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("n1: ");
        n1 = input.nextFloat();

        System.out.print("n2: ");
        n2 = input.nextFloat();

        System.out.println("1: Toplama\n2: Çıkarma\n3: Çarpma\n4: Bölme");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Tanımsız.");
                } else {
                    System.out.println("Bölme: " + (n1 / n2));
                }
                break;
            default:
                System.out.print("Yanlış seçim yaptınız, tekrar deneyin.");
                break;
        }

    }
}
