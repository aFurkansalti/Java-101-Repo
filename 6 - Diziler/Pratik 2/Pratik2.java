import java.util.Arrays;
import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);

        System.out.print("Değer giriniz: ");
        int num = input.nextInt();

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (list[i] > num) {
                System.out.println(num + "sayısından küçük en büyük sayı: " + list[i - 1]);
                System.out.println(num + "sayısından büyük en küçük sayı: " + list[i]);
                break;
            }
        }

    }
}
