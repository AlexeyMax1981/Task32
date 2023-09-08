public class Main {
    public static void main(String[] args) {
        int score = 3340;
        int firstBalans = 200;
        int bonus = 0;
        int balans;
        if (score > 1000) {
            bonus = score / 100;
        }
        balans = firstBalans + bonus + score;
        System.out.println(balans);
    }
}
