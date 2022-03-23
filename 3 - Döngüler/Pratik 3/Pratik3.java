import java.net.Socket;
import java.util.Scanner;

public class Pratik3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır değeri giriniz: ");
        int n = input.nextInt();

        System.out.println("Girdiğiniz değere kadar 4'ün kuvvetleri; ");
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Girdiğiniz değere kadar 5'in kuvvetleri; ");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }

    }
}
