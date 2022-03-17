import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        
        int bYear, zod;
        Scanner input = new Scanner(System.in);
         
        System.out.println("4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. ");
        System.out.println("Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.");
        System.out.println("Hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.")

        System.out.print("Doğum tarihiniz: ");
        bYear = input.nextInt();

        zod = bYear % 12;

        switch (zod) {
            case 0:
                System.out.println("Burcunuz: Maymun.");
                break;
            case 1:
                System.out.println("Burcunuz: Horoz.");
                break;
            case 2:
                System.out.println("Burcunuz: Köpek.");
                break;
            case 3:
                System.out.println("Burcunuz: Domuz.");
                break;
            case 4:
                System.out.println("Burcunuz: Fare.");
                break;
            case 5:
                System.out.println("Burcunuz: Öküz.");
                break;
            case 6:
                System.out.println("Burcunuz: Kaplan.");
                break;
            case 7:
                System.out.println("Burcunuz: Tavşan.");
                break;
            case 8:
                System.out.println("Burcunuz: Ejderha.");
                break;
            case 9:
                System.out.println("Burcunuz: Yılan.");
                break;
            case 10:
                System.out.println("Burcunuz: At.");
                break;
            default:
                System.out.println("Burcunuz: Koyun.");
                break;
            
        } 
    }
}
