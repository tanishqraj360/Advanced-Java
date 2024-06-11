import java.util.Collections;
import java.util.ArrayList;

public class AJ_3_4 {
  public static void main(String[] args) {
    ArrayList<String> a1 = new ArrayList<String>();
    System.out.println("Initial size of a1: " + a1.size());
    a1.add("W");
    a1.add("E");
    a1.add("L");
    a1.add("C");
    a1.add(2, "ome");
    System.out.println("Size of a1 after additions: " + a1.size());

    System.out.println("The contents of list: " + a1);
    Collections.sort(a1);
    System.out.println("Contents of list after sorting: " + a1);
    a1.remove("C");
    a1.remove(2);
    System.out.println("Size of arraylist after deletions: " + a1.size());
    System.out.println("The contents of list: " + a1);
  }
}
