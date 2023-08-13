import java.util.Scanner;

public class enhancedcal {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         double num1, num2;
         char operator;
         char choice;

    do {

         System.out.println("===== Professional Calculator =====");

         System.out.print("Enter the first number: ");
        num1 = getValidNumber(scanner);

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = getValidOperator(scanner);

        System.out.print("Enter the second number: ");
        num2 = getValidNumber(scanner);


        double result = performCalculation(num1, num2, operator);

        System.out.println("Result: " + result);

        System.out.print("Do you want to perform another calculation? (Y/N): ");
        choice = scanner.next().charAt(0);

       } 

    while (Character.toUpperCase(choice) == 'Y');

        System.out.println("Calculator closed. Thank you!");

}
private static double getValidNumber(Scanner scanner) 
{

      while (!scanner.hasNextDouble()) 
      {
        System.out.print("Invalid input. Please enter a valid number: ");
        scanner.next();
      }

      return scanner.nextDouble();
}

private static char getValidOperator(Scanner scanner) 
{
char operator;

      do 
      {
        operator = scanner.next().charAt(0);
      if (operator != '+' && operator != '-' && operator != '*' && operator != '/') 
      {
        System.out.print("Invalid operator. Please enter a valid operator (+, -, *, /): ");
      }

     } 

     while (operator != '+' && operator != '-' && operator != '*' && operator != '/');

return operator;

}


private static double performCalculation(double num1, double num2, char operator) 
{

 double result;

   switch (operator) 
   {
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

        if (num2 != 0) 
        {
          result = num1 / num2;
        } 

        else 
        {
          System.out.println("Error: Division by zero is not allowed.");

          return Double.NaN;
        }
        break;
          
    default:
         System.out.println("Error: Invalid operator.");
         
         return Double.NaN;
}

    return result;

}
}