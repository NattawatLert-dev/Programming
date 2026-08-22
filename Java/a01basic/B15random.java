package a01basic;

import java.util.Random;

public class B15random {
    public static void main(String[] args) {
        Random random = new Random();
        
        int number;

        number = random.nextInt(1, 6);

        System.out.println(number);
    }
}
