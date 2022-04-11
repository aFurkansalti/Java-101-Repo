import java.util.Scanner;

public class Pratik1 {

    static boolean isPalindrome(int number) {

        int reverseNumber = 0, lastNumber, temp = number;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = reverseNumber*10 + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int palindrome = input.nextInt();

        if (isPalindrome(palindrome) == true)
            System.out.println(palindrome + " is palindrome");
        else
            System.out.println(palindrome + " not");


    }

}
