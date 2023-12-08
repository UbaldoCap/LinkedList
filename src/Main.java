import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = new Fruit("pera");
        Fruit fruit2 = new Fruit("mela");
        Fruit fruit3 = new Fruit("banana");
        Fruit fruit4 = new Fruit("uva");
        List<Fruit> fruits = new LinkedList<>(Arrays.asList(fruit1, fruit2));
        System.out.println(fruits);
        fruits.addFirst(fruit3);
        fruits.addLast(fruit4);
        System.out.println(fruits);
    }
}
