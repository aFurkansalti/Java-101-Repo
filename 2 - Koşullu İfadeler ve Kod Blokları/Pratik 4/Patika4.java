import java.util.Scanner;

public class Patika4 {
    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık: ");
        heat = input.nextInt();
        System.out.println("Sıcaklık: " + heat);

        if (heat < 5) {
            System.out.println("Kayak yapmalısınız.");
        } else if (heat >= 5 && heat <= 10) {
            System.out.println("Sinemaya gitmelisiniz.");
        } else if (heat > 10 && heat < 15) {
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz.");
        } else if (heat >= 15 && heat <= 25) {
            System.out.println("Piknik için harika bir hava.");
        } else {
            System.out.println("Yüzmek için çok iyi bir gün.");
        }

    }
    
}
