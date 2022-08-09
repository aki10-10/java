package practice;

public class Main2 {
  public static void main(String[] args) {
    int oddSum = 0;
    int evenSum = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }

    System.out.println("偶数の和は" + evenSum + "です。");
    System.out.println("奇数の和は" + oddSum + "です。");

  }
}
