package testing;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class App
{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Please enter your name: ");
      String name = scanner.nextLine();

      if (StringUtils.isBlank(name)) {
          System.out.println("Sorry, cannot proceed without a name!");
      }else {
          System.out.println("Hello "+name);
      }

      scanner.close();
  }
}
