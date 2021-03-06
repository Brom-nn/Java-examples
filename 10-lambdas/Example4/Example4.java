import java.util.*;

public class Example4
{
  public static void main(String[] args) {
  	  List<String> colors =
      Arrays.asList("Red", "Orange", "Blue", "White", "Black", "Yellow");
      List<String> uppercaseColors = new ArrayList<String>();

      colors.stream() 
            .map(String::toUpperCase)
            .forEach(color -> System.out.println(color));
      System.out.println();
  }
}