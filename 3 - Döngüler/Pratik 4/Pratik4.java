import java.net.Socket;
import java.util.Scanner;

public class Pratik4 {
    public static void main(String[] args) {
        
        int n, r, nF = 1, rF = 1, nSubrF = 1, cnr;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Kümenizin eleman sayısını giriniz: ");
        n = input.nextInt();

        System.out.print("Oluşturmak istediğiniz farklı grupların eleman sayısını giriniz: ");
        r = input.nextInt();

        int nSubr = (n - r);

        //C(n,r) = n! / (r! * (n-r)!)
        
        for (int i = 1; i <= n; i++) {
            nF *= i;
        }

        for (int i = 1; i <= r; i++) {
            rF *= i;
        }

        for (int i = 1; i <= nSubr; i++) {
            nSubrF *= i;
        }

        cnr = nF / (rF * nSubrF);

        System.out.println("C(" + n + "," + r + "): " + cnr);

    }
}
