import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.print("Şifre: ");
        password = input.nextLine();

        if (userName.equals("aFurkansalti")) {
            if (password.equals("salti34")) {
                System.out.println("Giriş yaptınız!");
            } else {
                System.out.println("Kullanıcı adı veya şifre yanlış!");
                System.out.println("şifreyi yenilemek isterseniz 1\nşifreyi yenilemek istemezseniz 0");
                System.out.print("Seçiminiz: ");
                int rePassword = input.nextInt();
                switch (rePassword) {
                    case 1:
                        System.out.print("Yeni şifreniz: " + input.nextLine());
                        String newPassword = input.nextLine();

                        if (newPassword.equals("salti34")) {
                            System.out.println("Önceki şifrelerinizi tekrar kullanamazsınız.");
                    } else {
                            System.out.println("Yeni şifreniz tanımlandı!");
                    }
                        break;

                    case 0:

                        System.out.print("Kullanıcı adınız: " + input.nextLine());
                        String userName1 = input.nextLine();

                        System.out.print("Şifre: ");
                        String password1 = input.nextLine();

                        if (userName1.equals("aFurkansalti") && password1.equals("salti34")) {
                            System.out.println("Giriş yaptınız!");
                        } else {
                            System.out.println("Kullanıcı adı veya şifre yanlış!");
                        }
                        break;

                }

            }
        } else {
            System.out.print("Kullanıcı adı veya şifreniz hatalı!");
        }
    }
}
