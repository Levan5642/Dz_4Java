import java.util.*;

public class ArrayToMap {

    public static void main(String[] args) {

        String[] words = {
                "seven", "two", "five", "ока", "one",
                "two", "one", "photo", "two", "seven",
                "five", "дерево", "ока", "телефон", "photo"
        };

        System.out.println("Вывод всех слов: " + Arrays.asList(words));


        LinkedHashMap<String, Integer> repeat = new LinkedHashMap<>();

        for (String s : words) {
            repeat.put(s, repeat.getOrDefault(s, 0) + 1);
        }

        System.out.println("Слова и количество повторений: " + repeat);
    }
}