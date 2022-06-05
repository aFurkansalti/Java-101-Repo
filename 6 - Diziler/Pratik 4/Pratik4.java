import java.util.Arrays;

public class Pratik4 {

    public static boolean isHere(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] list = {2, 3, 4, 3, 7, 3, 7};
        int[] duplicate = new int[list.length];

        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0, k = 0; j < list.length; j++, k++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isHere(duplicate,list[i]) && (list[i] % 2 == 0)) {
                        duplicate[counter++] = list[i];
                    }
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
