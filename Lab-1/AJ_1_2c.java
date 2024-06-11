public class AJ_1_2c {
  public static void main(String[] args) {
    String text = "Advanced java concepts are used for developing websites and software solutions";
    String pattern = "websites";
    stringMatch(text, pattern);
  }

  public static void stringMatch(String text, String pattern) {
    int k = 0, i = 0, j = 0;
    int len_t = text.length();
    int len_p = pattern.length();
    for (i = 0; i <= (len_t - len_p); i++) {
      for (j = 0; j < len_p; j++) {
        if (text.charAt(i + j) != pattern.charAt(j)) {
          break;
        }
      }
      if (j == len_p) {
        k++;
        System.out.println("Pattern found at: " + i);
      }
    }
    if (k == 0) {
      System.out.println("No match found");
    } else {
      System.out.println("Total Instances Found: " + k);
    }
  }
}
