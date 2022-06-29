public class Condition {
    public static String[][] numberOfBombAround(String[][] platform) {
        for (int r = 0; r < platform.length; r++) {
            for (int c = 0; c < platform[r].length; c++) {
                boolean condition1 = (r > 0);
                boolean condition2 = (c > 0);
                boolean condition3 = (r < (platform.length - 1));
                boolean condition4 = (c < (platform[r].length - 1));


                if (platform[r][c] != "* ") {
                    int howManyBomb = 0;

                    if (condition1 && condition2 &&
                            condition3 && condition4) {
                        if (platform[r - 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c + 1] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r == 0) && (c == 0)) {
                        if (platform[r][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c + 1] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r == 0) && (c == platform[r].length - 1)) {
                        if (platform[r][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r == platform.length - 1) && (c == 0)) {
                        if (platform[r - 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r][c + 1] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r == platform.length - 1) && (c == platform[r].length - 1)) {
                        if (platform[r - 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r][c - 1] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r == 0) && (c > 0) && (c < platform.length - 1)) {
                        if (platform[r][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r][c + 1] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r > 0) && (r < platform[c].length - 1) && (c == 0)) {
                        if (platform[r - 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r > 0) && (r < platform[r].length - 1) && (c == platform[r].length - 1)) {
                        if (platform[r - 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r + 1][c] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }

                    if ((r == platform.length - 1) && (c > 0) && (c < platform[c].length - 1)) {
                        if (platform[r][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c - 1] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c] == "* ")
                            howManyBomb++;

                        if (platform[r - 1][c + 1] == "* ")
                            howManyBomb++;

                        if (platform[r][c + 1] == "* ")
                            howManyBomb++;

                        platform[r][c] = Integer.toString(howManyBomb) + " ";
                    }
                }
            }
        }

        return platform;
    }
}
