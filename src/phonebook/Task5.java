package phonebook;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args){
    Map<Integer, String> integersStrings = new HashMap<>();
        integersStrings.put(1, "один");
        integersStrings.put(2,"два");
        integersStrings.put(3,"три");
        integersStrings.put(4,"четыре");
        integersStrings.put(5,"пять");
        integersStrings.put(6,"шесть");
        integersStrings.put(7,"семь");
        integersStrings.put(8,"восемь");
        integersStrings.put(9,"девять");
        integersStrings.put(10,"десять");
        for (Map.Entry<Integer,String> pair: integersStrings.entrySet())
            System.out.println(pair.getKey() +": " + pair.getValue());
}
}

