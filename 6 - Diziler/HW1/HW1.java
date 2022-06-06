import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu: ");
        int number = input.nextInt();

        int[] list = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print((i + 1) + ". elemanı : ");
            int value = input.nextInt();
            list[i] = value;
        }

        for (int i = 0; i < list.length; i++) {
            int num = list[i];
            int temp = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < num) {
                    num = list[j];
                    temp = j;
                }
            }

            if (temp != i) {
                list[temp] = list[i];
                list[i] = num;
            }

        }

        //Arrays.sort(list);

        System.out.println(Arrays.toString(list));
    }
}
