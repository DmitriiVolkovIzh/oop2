package phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String,String> phoneBook = new HashMap<>();

        phoneBook.put("Бздых Рамиль","89255456241");
        phoneBook.put("Урманов Файз","89255456241");
        phoneBook.put("Сидоров Рамиль","8925256241");
        phoneBook.put("Петров Дима","89255456241");
        phoneBook.put("Грачев Алексей","89255456241");
        phoneBook.put("Гусева Алсу","892454241");
        phoneBook.put("Волков Дмитрий","5635456241");
        phoneBook.put("Конюхов Павел","454456241");
        phoneBook.put("Гречка Рамиль","89255489641");
        phoneBook.put("Гагарин Рафис","8454456241");
        phoneBook.put("Петров Петр","8925545451");
        phoneBook.put("Шербаков Алексей","89255456241");
        phoneBook.put("Родин Александр","89255456241");
        phoneBook.put("Раков Альберт","8925145241");
        phoneBook.put("Захаров Сергей","89255456241");
        phoneBook.put("Ким Чен","89255456241");
        phoneBook.put("Чун Сын","894565656241");
        phoneBook.put("Шахов Слава","8945425456241");
        phoneBook.put("Рябчик Валера","84545456241");
        phoneBook.put("Усманов Рамиль","4454556241");


        for (Map.Entry<String,String> pair: phoneBook.entrySet())
            System.out.println(pair);
        System.out.println();
    }

}

