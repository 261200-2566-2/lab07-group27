public class lab07 {
    public static void main(String[] arg){
        HashSetUsingHashmap<String> fruit = new HashSetUsingHashmap<>();
        fruit.add("apple");
        fruit.add("banana");
        System.out.println("Size: " + fruit.size());
        System.out.println("Contains 'banana': " + fruit.contains("banana"));
        fruit.remove("banana");
        System.out.println("Contains 'banana': " + fruit.contains("banana"));
        System.out.println("Size: " + fruit.size());
        HashSetUsingHashmap<String> food = new HashSetUsingHashmap<>();
        food.add("Phat kaphrao");
        food.add("noodle");
        fruit.addAll(food);
        System.out.println("Size: " + fruit.size());
        System.out.println("Contains 'Phat kaphrao': " + fruit.contains("Phat kaphrao"));
        System.out.println("Is fruit contains all food: " + fruit.containsAll(food));
        System.out.println(" ");
        System.out.println("Before Applying retainAll()");
        System.out.println("fruit Contains :" + fruit);
        System.out.println("Contains 'apple': " + fruit.contains("apple"));
        System.out.println("Size: " + fruit.size());
        fruit.retainAll(food);
        System.out.println("After Applying retainAll()");
        System.out.println("Contains 'apple': " + fruit.contains("apple"));
        System.out.println("Size: " + fruit.size());
        fruit.removeAll(food);
        System.out.println("Size: " + fruit.size());
        System.out.println("Is fruit empty: " + fruit.isEmpty());
    }
}
