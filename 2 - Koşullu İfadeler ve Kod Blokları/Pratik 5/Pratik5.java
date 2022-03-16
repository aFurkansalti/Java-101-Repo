import java.util.Scanner;

public class Patika5 {
    public static void main(String[] args) {
        
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("a'ya bir doğal sayı giriniz: ");
        a = inp.nextInt();

        System.out.print("b'ye bir doğal sayı giriniz: ");
        b = inp.nextInt();

        System.out.print("c'ye bir doğal sayı giriniz: ");
        c = inp.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else if (c > a) {
                System.out.println("a > c > b");
            }
        } else if ((b > a) && (b > c)) { 
            if (a > c) {
                System.out.println("b > a > c");
            } else if (c > a) {
                System.out.println("b > c > a");
            } 
        } else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("c > a > b");
            } else if (b > a) {
                System.out.println("c > b > a");
            }
        }

        if ((a == b) && (a > c)) {
            System.out.println("a = b > c");
        } else if ((a == b) && (c > a)) {
            System.out.println("c > a = b");
        }

        if ((a == c) && (a > b)) {
            System.out.println("a = c > b");
        } else if ((a == c) && (b > a)) {
            System.out.println("b > a = c");
        }

        if ((c == b) && (c > a)) {
            System.out.println("c = b > a");
        } else if ((c == b) && (a > c)) {
            System.out.println("a > c = b");
        } 

        if ((a == b) && (a == c) && (c == b)) {
            System.out.print("a = b = c");
        }
    }
}