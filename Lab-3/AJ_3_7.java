import java.util.ArrayList;

public class AJ_3_7 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(111);
    list.add(222);
    list.add(333);
    list.add(444);
    System.out.println(list);

    list.set(1, 000);
    list.set(3, 000);

    System.out.println(list);
  }
}
