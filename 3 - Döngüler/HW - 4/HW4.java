public class HW4 {
    public static void main(String[] args) {

        System.out.println("1 - 100 arası asal sayılar; ");

        for (int n = 2; n < 100; n++) {
            int counter = 0;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    counter++;
                }
            }

            if (counter == 0) {
                System.out.println(n);
            }
        }
    }
}
