class AJ_1_2a {
  public static void main(String[] args) {
    String str = "Hello";
    char ch = str.charAt(2);
    System.out.println(ch);

    String strr = "Good Luck dear students";
    String substr1 = strr.substring(5);
    System.out.println(substr1);

    String substr2 = strr.substring(4, 11);
    System.out.println(substr2);

    String str2 = "Welcome to Mysuru";
    char[] charArray = str2.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      System.out.println(charArray[i]);
    }

    String s3 = "We cannot solve problems with this kind of thinking";
    char[] dst = new char[6];
    s3.getChars(3, 9, dst, 0);
    System.out.println(dst);
  }
}
