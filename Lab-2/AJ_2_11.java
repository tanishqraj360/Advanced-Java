public class AJ_2_11 {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());
    sb.append("Hello");
    System.out.println(sb.capacity());
    sb.append("Java is my favourite language");
    System.out.println(sb.capacity());
  }
}
