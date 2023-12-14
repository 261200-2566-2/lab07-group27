import java.util.Arrays;
import java.util.List;

public class lab07 {
    public static void main(String[] args) {
        Set<String> fruit = new SetUsingHashMap<>();
        fruit.add("apple");
        fruit.add("banana");
        System.out.println("Size: " + fruit.size());
        System.out.println("Contains 'banana': " + fruit.contains("banana"));
        fruit.remove("banana");
        System.out.println("Contains 'banana': " + fruit.contains("banana"));
        List<String> fruit2 = Arrays.asList("orange", "grape", "banana", "kiwi");
        fruit.addAll(fruit2);
        System.out.println("Size: " + fruit.size());
        System.out.println("Contains 'kiwi': " + fruit.contains("kiwi"));
    }
}
