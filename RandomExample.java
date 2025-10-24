import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(17) + 1; // 1–17
        System.out.println(num);
    }
}
