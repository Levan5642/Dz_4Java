import java.util.HashMap;
import java.util.HashSet;

public class Phone_book {

    private HashMap<String, HashSet<String>> Phone_Book = new HashMap<>();

    public void add(String lastName, String phone) {
        HashSet<String> telephone = Phone_Book.getOrDefault(lastName, new HashSet<>());
        telephone.add(phone);
        Phone_Book.put(lastName, telephone);
    }

    public HashSet<String> get(String lastName) {
        return Phone_Book.get(lastName);
    }
}