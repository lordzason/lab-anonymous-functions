package taojava.filters;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Vector;
import java.util.function.Predicate;

public class Main
{
  public static void main(String[] args)
  {
    PrintWriter pen = new PrintWriter(System.out, true);

    Vector<Integer> ints = Utils.iota(50);
    String[] tmp =
        new String[] { "alpha", "bravo", "charlie", "delta", "echo", "foxtrot",
                      "golf", "hotel", "india", "juliett", "kilo", "lima",
                      "mike", "november", "oscar", "papa", "quebec", "romeo",
                      "sierra", "tango", "uniform", "victor", "whiskey",
                      "xray", "yankee", "zulu" };
    Vector<String> strings = new Vector<String>(Arrays.asList(tmp));

    Utils.printSelectedIntegers(pen, ints, new Even());

    pen.println();

    Utils.printSelectedIntegers(pen, ints, (new Even()).negate());

    pen.println();

    Utils.printSelectedIntegers(pen, ints, (i) -> {
                                  if (i % 5 == 0)
                                    return true;
                                  else
                                    return false;
                                });

    pen.close();
  }
}
