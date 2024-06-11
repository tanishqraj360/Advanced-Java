public class AJ_2_3a {
  public static void main(String[] args) {
    String str = "Advanced Java";
    char[] strArray = str.toCharArray();

    for (int i = strArray.length - 1; i >= 0; i--) {
      System.out.println(strArray[i]);
    }
  }
}
