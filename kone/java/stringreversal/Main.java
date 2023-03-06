package kone.java.stringreversal;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter the string you want to reverse or type 'exit' " +
                       "to quit the program: ");
      String input = scanner.nextLine();
      if (input.equals("exit")) {
        System.out.println("Thanks for trying this out! :)");
        break;
      } else {
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.print("Your Reversed String is: " + reversed + "\n");
      }
    }
  }
}
