public class AJ_1_2b {
  public static void main(String[] args) {
    String s1 = "Sachin";
    String s2 = "Sachin";
    String s3 = new String("Sachin");
    String s4 = "Saurav";
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));
    System.out.println(s1.equalsIgnoreCase(s2));

    String sc1 = new String("This is an example");
    String sc2 = new String("isan");
    System.out.println("Result of comparing sc1 and sc2: ");
    System.out.println(sc1.regionMatches(true, 2, sc2, 0, 2));
    System.out.println(sc1.regionMatches(true, 5, sc2, 0, 2));
    System.out.println(sc1.regionMatches(true, 15, sc2, 0, 2));

    System.out.println(sc1.startsWith("This"));
    System.out.println(sc1.startsWith("his", 1));
    System.out.println(sc1.startsWith("is", 1));
    System.out.println(sc1.endsWith("example"));
    System.out.println(sc1.endsWith("is"));

    String ss1 = "Sachin";
    String ss2 = "Mithun";
    String ss3 = "Ratan";
    System.out.println(s1.compareTo(s2));
    System.out.println(ss3.compareTo(ss2));
    System.out.println(ss3.compareTo(ss1));
  }
}
