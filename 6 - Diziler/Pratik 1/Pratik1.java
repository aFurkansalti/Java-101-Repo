import java.util.Arrays;

public class Pratik1 {
    public static void main(String[] args) {
        double[] list = {1, 3, 5, 7, 9};

        double total = 0;
        double harmonic = 0;
        for (int i = 0; i < list.length; i++) {
            total += 1 / list[i];
        }

        harmonic = list.length / total;

        System.out.println(Arrays.toString(list) + " dizisinin harmonik toplamı: " + total);
        System.out.println(Arrays.toString(list) + " dizisinin harmonik ortalaması: " + harmonic);
    }
}
