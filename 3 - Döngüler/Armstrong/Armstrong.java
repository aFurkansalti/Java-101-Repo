import java.util.Scanner;

/*
rmstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
*/

public class Armstrong {
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Başlangıç değeri giriniz: ");
        num1 = input.nextInt();

        System.out.print("Bitiş değeri giriniz: ");
        num2 = input.nextInt();

        while (num1 <= num2) {
            int numofDigit = 0, valueofDig, tempNum1 = num1, result = 0;

            while (tempNum1 != 0) {
                tempNum1 /= 10;
                numofDigit++;
            }

            tempNum1 = num1;
            while (tempNum1 != 0) {
                valueofDig = tempNum1 % 10;
                int numofPow = 1;
                for (int i = 1; i <= numofDigit; i++) {
                    numofPow *= valueofDig;
                }
                result += numofPow;
                tempNum1 /= 10;
            }

            if (num1 == result) {
                System.out.println(num1 + " sayısı bir armstrong sayısıdır.");
            }
            
            num1++;
        }
            
    }
    
}
