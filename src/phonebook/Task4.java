package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    public static Map<String, Integer>
    getAnotherMap(Map<String, List<Integer>> allLists) {
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> pair : allLists.entrySet()) {
            int sum = 0;
            for (int i = 0; i < pair.getValue().size(); i++) {
                sum = pair.getValue().get(i) + sum;
                newMap.put(pair.getKey(), sum);
            }
        }
        return newMap;
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> allLists = new HashMap<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(5, 3, 9));
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(3, 7, 15));
        ArrayList<Integer> arrayList3 = new ArrayList<>(List.of(45, 2,15));
        allLists.put("первая", arrayList1);
        allLists.put("вторая", arrayList2);
        allLists.put("третья", arrayList3);
        for (Map.Entry<String, Integer> pair : getAnotherMap(allLists).entrySet())
            System.out.println(pair);
        System.out.println();
    }
}
