import java.util.*;

public class AJ_3_2 {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(1);
    a.add(3);
    a.add(5);
    a.add(7);
    a.add(9);

    System.out.println("The contents of a is: " + a);

    Integer inarr[] = new Integer[a.size()];
    inarr = a.toArray(inarr);
    int sum = 0;
    for (int i : inarr) {
      sum += i;
    }
    System.out.println("The sum is: " + sum);
  }
}
