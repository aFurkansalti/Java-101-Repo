import java.util.Scanner;

public class Pratik9 {
    public static void main(String[] args) {
        
        String userName, password;
        int right = 4, balance = 2000, select;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
        System.out.print("Kullanıcı adını giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifreyi giriniz: ");
        password = input.nextLine();
        
            if ((userName.equals("aFurkan")) && (password.equals("frk123"))) {
                System.out.println("-----\n" + "Sisteme giriş yaptınız!\n" + "-----");

                do {
                    System.out.println("1-Para yatırma.\n" + 
                    "2-Para çekme.\n" + 
                    "3-Bakiye sorgulama.\n" + 
                    "4-Çıkış yap");
            
                System.out.print("-----\n" + "Lütfen yapmak istediğiniz işlemi seçiniz: ");
                select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutar: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("-------");
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutar: ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println( "-----\n" + "Çekmek istediğiniz tutar için yeterli bakiye bulunmamakta!\n" + "-----");
                            } else {
                                balance -= price2;
                                System.out.println("-------");
                            }
                            break;
                        case 3:
                            System.out.println("-----\n" + "Bakiyeniz: " + balance + "TL\n" + "-----");
                            break;
                        case 4:
                            System.out.println("-----\n" + "Çıkış yapmaktasınız!\n" + "-----");
                            System.out.println("- Çıkmak için 1\n" +
                                        "- Menüye dönmek için 2");
                            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                            int forExit = input.nextInt();
                            switch (forExit) {
                                case 1:
                                    select = 4;
                                    break;
                                case 2:
                                    select = 3;
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Geçersiz tuşladınız!");
                    }
                } while(select != 4);
                    System.out.println("-----\n" + "Tekrar görüşmek dileğiyle...\n" + "-----");

            } else {
                System.out.println("-----\n" + "Girmiş olduğunuz şifre ya da kullanıcı adı hatalı. Tekrar deneyiniz.\n" + "-----");
                right--;
                System.out.println("Kalan hakkınız: " + right);
            } 

            if (right == 0) {
                System.out.println("-----\n" + "Şifreniz bloke edildi, banka ile iletişime geçininiz.\n" + "-----");
            }
        }
    }
}
