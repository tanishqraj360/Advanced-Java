import java.util.*;

public class AJ_4_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String: ");
    String input = sc.nextLine();
    String result = removeDuplicates(input);
    System.out.println("Resultant string after removing duplicates: " + result);
    sc.close();
  }

  public static String removeDuplicates(String input) {
    StringBuffer result = new StringBuffer();
    System.out.println(result);

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      if (result.indexOf(String.valueOf(currentChar)) == -1) {
        result.append(currentChar);
      }
    }
    return result.toString();
  }
}
