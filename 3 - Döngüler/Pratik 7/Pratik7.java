import java.util.Scanner;

public class Pratik7 {
    public static void main(String[] args) {
        
        float number, result = 0.0f;
        Scanner input = new Scanner(System.in);

        System.out.println("-> Bu program harmonik seri hesaplamaktadır.");
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        
        for (int i = 1; i <= number; i++) {
            result += 1.0 / i;
        }

        System.out.println("Girdiğiniz sayının harmonik serisinin toplamı: " + result);
    }
}
