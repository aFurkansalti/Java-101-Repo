import java.util.Scanner;

public class Pratik10 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num1, num2;

       System.out.print("birinci sayı: ");
       num1 = input.nextInt();

       System.out.print("ikinci sayı; ");
       num2 = input.nextInt();


       int ebob = 1;
       int i = 1;
       while (i <= num1) {
           if ((num1 % i == 0) && (num2 % i == 0)) {
               ebob = i;
           }
           i++;
       }
       System.out.println(ebob);

       int ekok = 1;
       int j = 1;
       while (j <= num1*num2) {
           if ((j % num1 == 0) && (j % num2 == 0)) {
               ekok = j;
               break;
           }
           j++;
       }
       System.out.println(ekok);

    }
}

