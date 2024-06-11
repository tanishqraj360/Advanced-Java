import java.util.*;

public class AJ_2_1a {
  public static void main(String[] args) {
    System.out.println("Enter the String: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] words = s.trim().split(" ");
    System.out.println("Number of words in the string: " + words.length);
    sc.close();
  }
}
