import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public static void run() {
        Scanner input = new Scanner(System.in);
        int selected, row, col;

        System.out.println("Oyun zorluk seviyesi (3 - 20)");
        System.out.print("Zorluk seviyesi için yukarıdaki aralıktan bir değer giriniz: ");

        selected = input.nextInt();
        row = selected;
        col = selected;

        if ((selected >= 3) && (selected <= 20)) {
            String[][] platform = new String[row][col];
            String[][] tempPlatform = new String[row][col];
            String[][] tempHidePlatform = createPlatform(tempPlatform);
            printPlatform(tempHidePlatform);
            String[][] hidePlatform = createPlatform(platform);
            String[][] whereIsBomb = bombCreate(row, col, hidePlatform);
            String[][] howMany = howManyBomb(whereIsBomb);
            game(tempHidePlatform, howMany, selected);
            //isWin(row, col, hidePlatform);

        }
    }

    public static String[][] createPlatform(String[][] platform) {
        for (int r = 0; r < platform.length; r++) {
            for (int c = 0; c < platform[r].length; c++) {
                platform[r][c] = "- ";
            }
        }

        return platform;
    }

    public static String[][] bombCreate(int row, int col, String[][] platform) {
        int bombCounter = (row * col) / 4;

        Random random = new Random();

        while (bombCounter > 0) {
            int line = random.nextInt(platform.length);
            int column = random.nextInt(platform[0].length);
            if (platform[line][column] == "* ") {
                continue;
            }
            platform[line][column] = "* ";
            bombCounter--;
        }

        return platform;
    }

    public static String[][] howManyBomb(String[][] platform) {
        return Condition.numberOfBombAround(platform);
    }

    public static void game(String[][] hidePlatform, String[][] howMany, int selected) {
        Scanner input = new Scanner(System.in);
        int row, column;
        int howManyLoop = (selected * selected) - (selected * selected / 4);
        int loopCounter = 0;

        while (loopCounter < howManyLoop) {
            loopCounter++;

            System.out.print("Satır giriniz: ");
            row = input.nextInt();

            System.out.print("Sütun giriniz: ");
            column = input.nextInt();

            if (row < 0 || row > hidePlatform.length - 1|| column < 0 || column > hidePlatform[row].length - 1) {
                System.out.println("Lütfen geçerli bir değer giriniz.");
                System.out.println("0 ile " + hidePlatform.length + " aralığında olmalıdır.");
                continue;
            }

            if (howMany[row][column] == "* ") {
                System.out.println("Oyunu kaybettiniz!");
                printPlatform(howMany);
                return;
            } else {
                hidePlatform[row][column] = howMany[row][column];

                for (int r = 0; r < hidePlatform.length; r++) {
                    for (int c = 0; c < hidePlatform[r].length; c++) {
                        System.out.print(hidePlatform[r][c]);
                    }
                    System.out.println();
                }
            }
        }

        System.out.println("Oyunu Kazandınız.");
    }

    public static void printPlatform(String[][] platform) {
            for (int r = 0; r < platform.length; r++) {
                for (int c = 0; c < platform[r].length; c++) {
                    System.out.print(platform[r][c]);
                }
                System.out.println();
            }
    }
}
