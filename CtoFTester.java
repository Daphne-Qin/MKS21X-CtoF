/*
  Daphne Qin
  AP Computer Science
  Homework 6 -- Github
  2021-08-22
*/

/*
  Parameters: Celsius (for C to F), Fahrenheit (for F to C)
  Type: int (or double)
  Return: double

  UNSOVLED MYSTERIES (GitForWindows)
  - $ atom CtoFTester.java
    /c/Users/somet/AppData/Local/atom/bin/../app-1.58.0/resources/cli/atom.sh: line 23: cmd.exe: command not found
  - $ javac CtoFTester.java
    bash: javac: command not found
  - $ java CtoFTester
    bash: java: command not found
*/

public class CtoFTester {
  // degrees C to degrees F
  public static double celsiusToFahrenheit(double c) {
    return (9.0/5.0 * c + 32.0);
  }

  // degrees F to degrees C
  public static double fahrenheitToCelsius(double f) {
    return ((f-32.0) * 5.0/9.0);
  }

  //test cases
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(20.0));
    System.out.println(celsiusToFahrenheit(25.0));
    System.out.println(celsiusToFahrenheit(30.0));
    System.out.println(fahrenheitToCelsius(68.0));
    System.out.println(fahrenheitToCelsius(77.0));
    System.out.println(fahrenheitToCelsius(86.0));
  }
}
