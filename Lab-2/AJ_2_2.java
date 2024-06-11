public class AJ_2_2 {
  public static void main(String[] args) {
    String s = "Java is java again java again";
    int count = s.length() - s.replace("a", "").length();
    System.out.println(s.length());
    System.out.println(s.replace("a", ""));
    System.out.println(s.replace("a", "").length());
    System.out.println("Number of occurances of 'a' in " + s + " = " + count);
  }
}
