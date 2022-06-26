public class Pratik2 {
    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    static boolean isPalindrome2(String word) {
        String reverse = "";
        for (int index = word.length() - 1; index >= 0; index--) {
            reverse += word.charAt(index);
        }

        if (word.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome2("asa"));
        System.out.println(isPalindrome("kavak"));
        System.out.println(isPalindrome2("kaya"));
    }
}


