import java.util.Scanner;

public class Pratik8 {
    public static void main(String[] args) {
        
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısı giriniz: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int space = 0; space <= (n - i); space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2*i - 1); star++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        int m = n - 1;

        for (int i = 1; i <= m; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            
            for (int star = (2*n - 1); star >= (2*i + 1); star-=1) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
