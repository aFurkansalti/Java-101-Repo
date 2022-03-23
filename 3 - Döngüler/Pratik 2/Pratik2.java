import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        
        int n, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Tam sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);

        System.out.println("Girmiş olduğunuz sayılardan 4'ün katları olanların toplamı: " + total);
    
    }    
}
