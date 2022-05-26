public class Main {
    public static void main(String[] args) {
        Fighter mike = new Fighter("Mike", 50, 200, 80, 30, 90);
        Fighter muhammed = new Fighter("Muhammed", 25,130,75,85,30);

        Match m = new Match(mike, muhammed, 75, 80);
        m.run();
    }
}
