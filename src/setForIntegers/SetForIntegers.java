package setForIntegers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetForIntegers {
    private Iterator<Integer> numbers;
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size()<20){
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(integer -> integer % 2 != 0);
        System.out.println(numbers);
    }

}
