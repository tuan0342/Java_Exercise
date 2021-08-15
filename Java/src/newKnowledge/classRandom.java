package newKnowledge;

import java.util.Random;

public class classRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(100);
            System.out.println("X = "  + x);
        }
    }
}
