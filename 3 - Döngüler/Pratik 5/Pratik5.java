import java.util.Scanner;

public class Pratik5 {
    public static void main(String[] args) {
        
        int n, ex, result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();

        System.out.print("Sayının kuveti: ");
        ex = input.nextInt();

        for (int i = 1; i <= ex; i++) {
            result *= n;
        }

        System.out.println("Sonuç: " + result);


    }
}
