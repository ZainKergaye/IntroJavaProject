package newPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class newPackage {

  public static void main(String[] args) {
    // int integer = 3;
    // double doubl = 3.5;
    // System.out.println(integer + doubl);
    // for(int i = 10; i >= 0; i--){
    //   System.out.println(i);
    // }
    // int[] arr = new int[1000];
    //

    for(int i = 20; i < 0; i -= 5){
      System.out.print(i);
    }

    Scanner input = new Scanner(System.in);
    try{
    int points = input.nextInt();
    }
    catch(InputMismatchException err){
      int points = 0;
    }
    System.out.println(points + " points");
    // This code is wrong because try catch variable initialization is only within that scope. Like initializing a variable inside an if loop.
    if(true){
      int pointss = 0;
    }
    System.out.println(pointss);
  }
}
