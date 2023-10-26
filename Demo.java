import java.util.*;

class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value of a:");
    int a = sc.nextInt();
    System.out.print("enter the value of b:");
    int b = sc.nextInt();
    System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    sc.close();
  }
}
