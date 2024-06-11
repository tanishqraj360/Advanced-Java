import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AJ_2_4 {
  public static void main(String[] args)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    System.out.println("Enter 'stop' to quit.");
    System.out.println("Enter State: ");
    do {
      str = br.readLine();
      str = str.trim();
      if (str.equals("Karnataka")) {
        System.out.println("Capital is Bangalore");
      } else if (str.equals("Kerala")) {
        System.out.println("Capital is Thiruvananthapuram");
      } else if (str.equals("Tamil Nadu")) {
        System.out.println("Capital is Chennai");
      }
    } while (!str.equals("stop"));
  }
}
