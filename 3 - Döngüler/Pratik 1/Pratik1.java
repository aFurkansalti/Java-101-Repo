import java.util.Scanner;
/*
0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan bir program.
*/
public class Pratik1 {
    public static void main(String[] args) {
        
        int num, sum = 0, counter = 0, average ;
        Scanner input = new Scanner(System.in);

        
        System.out.print("Doğal sayı giriniz: ");
        num = input.nextInt();

        for (int i = 0; i <= num; i += 12 ) {
            if (i != 0) {
                sum += i;
                counter++;
                System.out.println("toplam: " + sum);
                System.out.println("12'ye bölünebilenlerin sayısı: " + counter);
            }
        }
        
        average = sum / counter;
        System.out.println("Ortalama: " + average);

    }
}
