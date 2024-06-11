import java.util.*;

public class AJ_3_3 {
  public static void main(String[] args) {
    List<Integer> numbers = new LinkedList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);

    numbers.add(1, 4);
    numbers.forEach(System.out::println);

    int number = numbers.get(0);
    System.out.println(number);

    boolean found = numbers.contains(4);
    System.out.println(found);

    int index = numbers.indexOf(3);
    numbers.remove(index);

    numbers.forEach(System.out::println);
  }
}
