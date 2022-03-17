import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("Girmiş olduğunuz yıl(" + year + ") artık yıldır!");
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Girmiş olduğunuz yıl(" + year + ") artık yıldır!");
        } else {
            System.out.println("Girmiş olduğunuz yıl(" + year + ") artık yıl değildir!");
        }
    }
}
