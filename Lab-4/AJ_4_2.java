import java.util.Scanner;

public class AJ_4_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of String: ");
    int n = sc.nextInt();
    String arr[] = new String[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.next();
    }

    System.out.println("Original strings are: ");
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          String temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println("Sorted strings: ");
    for (String s : arr) {
      System.out.println("\n" + s + " ");
    }
    System.out.println();

    sc.close();
  }
}
