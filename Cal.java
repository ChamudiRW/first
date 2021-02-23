import java.util.Scanner;

public class Cal {

  public static void main(String[] args) {

    @SuppressWarnings("resource")
    
	Scanner reader = new Scanner(System.in);
    System.out.println("Input numbers to calculate ");

    
    double num1 = reader.nextDouble();
    double num2 = reader.nextDouble();

    System.out.print("Enter an operator (+, -, *, / ): ");
    char operator = reader.next().charAt(0);

    double result;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;

      case '-':
        result = num1 - num2;
        break;

      case '*':
        result = num1 * num2;
        break;

      case '/':
        result = num1 / num2;
        break;


      default:
        System.out.printf("Error!");
        return;
    }

    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}