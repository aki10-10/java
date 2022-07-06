package MeikaiJava.chap02;

import java.util.Scanner;

class ArithInt {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("xとyを加減乗除します。");

    System.out.println("xの値");
    int x = stdIn.nextInt();

    System.out.println("yの値");
    int y = stdIn.nextInt();

    System.out.println("x+y="+(x+y));
    System.out.println("x-y="+(x-y));
    System.out.println("x*y="+(x*y));
    System.out.println("x/y="+(x/y));
    System.out.println("x%y="+(x%y));

  }
}
