import java.util.Scanner;

public class Pratik6 {
    public static void main(String[] args) {
        
        int number, numofValue, result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("-> Bu program gitdiğiniz sayının basamak sayılarını toplamaktadır.");

        System.out.print("Değer giriniz: ");
        number = input.nextInt();

        if (number > 0) {
            while (number != 0) {
                numofValue = number % 10;
            
                result += numofValue;

                number /= 10;
            }

            System.out.println("Girmiş olduğunuz sayının basamakları toplamı: " + result);

        } else {
            System.out.println("Girdiğiniz sayı negatif olmamalı.");
        }
 
    }
}
