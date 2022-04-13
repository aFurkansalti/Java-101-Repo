import java.util.Scanner;

public class Pratik2 {

    static void sum() {
        Scanner input = new Scanner(System.in);
        int num, result = 0, count;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {

            System.out.print(i + ". sayı: ");
            num = input.nextInt();

            result += num;
        }

        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int num, result = 0, count;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı");
            num = input.nextInt();

            if (i == 1) {
                result += num;
            } else {
                result -= num;
            }
        }

        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int num, result = 1, count;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı: ");
            num = input.nextInt();

            if (num == 0) {
                result = 0;
                break;
            }

            result *= num;
        }

        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        double num, result = 0.0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı: ");
            num = input.nextDouble();

            if (i != 1 && num == 0) {
                System.out.println("Tanımsız! Bölene 0 dışında bir değer giriniz.");
                continue;
            }

            if (i == 1) {
                result = num;
            } else {
                result /= num;
            }
        }

        System.out.println("Sonuç: " + result);
    }

    static void exponent() {
        int num, pow, result = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban: ");
        num = inp.nextInt();

        System.out.print("Kuvvet: ");
        pow = inp.nextInt();

        for (int i = 1; i <= pow; i++) {
            result *= num;
        }

        System.out.println(num + "^" + pow + " = " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        int num, result = 1;

        System.out.print("Faktöriyeli hesaplanacak olan sayı: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        System.out.println(num + "! = " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        int x, y, divid, mod;

        System.out.print("Bölüneni giriniz: ");
        x = input.nextInt();

        System.out.print("Böleni giriniz: ");
        y = input.nextInt();

        divid = x / y;
        mod = x % y;
        System.out.println(x + " / " + y + " = " + divid + " => kalan: " + mod);



    }

    static void rectangle() {
        Scanner inp = new Scanner(System.in);
        int a, b, area, perimeter, select;

        System.out.print("1. Kenar uzunluğu: ");
        a = inp.nextInt();

        System.out.print("2. Kenar uzunluğu: ");
        b = inp.nextInt();

        area = a * b;
        perimeter = 2*a + 2*b;

        if (a > b) {
            System.out.println("Uzun kenarı " + a + ", kısa kenarı " + b + " olan dikdörtgeninizin;");
        } else if (a < b) {
            System.out.println("Uzun kenarı " + b + ", kısa kenarı " + a + " olan dikdörtgeninizin;");
        } else {
            System.out.println("Kenar uzunluğunu girmiş olduğunuz karenizin; ");
        }

        System.out.println("Alanı: " + area + "\n" +
                "Çevresi: " + perimeter);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "Menu;\n" +
                "1 - Toplama işlemi.\n" +
                "2 - Çıkarma işlemi.\n" +
                "3 - Çarpma işlemi.\n" +
                "4 - Bölme işlemi.\n" +
                "5 - Üslü sayı hesaplama.\n" +
                "6 - Faktoriyel hesaplama.\n" +
                "7 - Mod alma.\n" +
                "8 - Dikdörtgen alan ve çevre hesaplama.\n" +
                "0 - Çıkış yap.";

        do {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = input.nextInt();

            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    exponent();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("BYE BYE..");
                    break;
                default:
                    System.out.println("Seçeneğiniz menüde bulunmamaktadır.");
            }
        } while (select != 0);
    }

}
