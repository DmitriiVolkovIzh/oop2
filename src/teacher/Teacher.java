package teacher;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Teacher {
    public static void main(String[] args) {
        Set<MultiplicationVariables> multiplicationVariables = new HashSet<>();
        Random random = new Random();
        while (multiplicationVariables.size() < 15) {
            MultiplicationVariables multiplicationVariables1 = new MultiplicationVariables(random.nextInt(9) + 2, random.nextInt(9)+2 );
            multiplicationVariables.add(multiplicationVariables1);
            System.out.println(multiplicationVariables1);
        }
    }
}

