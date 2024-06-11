import java.util.Scanner;
import java.util.LinkedHashSet;

public class AJ_4_1b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String result = removeDuplicates(input);
    System.out.println("Resultant string after removing duplicates: " + result);
    sc.close();
  }

  public static String removeDuplicates(String input) {
    LinkedHashSet<Character> set = new LinkedHashSet<Character>();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      set.add(c);
    }
    StringBuffer sb = new StringBuffer();
    for (char c : set) {
      sb.append(c);
    }
    return sb.toString();
  }
}
