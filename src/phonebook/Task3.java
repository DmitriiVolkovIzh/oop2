package phonebook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Task3 {
    public static void addComponent(String string, Integer integer, Map<String, Integer> map) {
        try {
            if (map.containsKey(string) && Objects.equals(map.get(string), integer))
                throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Компонент с таким ключом и значением уже присутствует в коллекции");
        }
        map.put(string, integer);
    }


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        addComponent("Леша", 2, map);
        addComponent("Петя", 1, map);
        addComponent("Леша", 2, map);
        addComponent("Сережа", 5, map);
        for (Map.Entry<String, Integer> pair : map.entrySet())
            System.out.println(pair);
        System.out.println();
    }
}

