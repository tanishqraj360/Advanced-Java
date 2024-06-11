public class AJ_1_3 {
  public static void bubbleSort(String[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
          String temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    String[] arr = { "banana", "apple", "cherry", "date", "fig" };
    System.out.println("Original Array: ");
    for (String s : arr) {
      System.out.println(s + " ");
    }

    System.out.println();

    System.out.println("Sorted Array: ");
    bubbleSort(arr);
    for (String s : arr) {
      System.out.println(s + " ");
    }
  }
}
