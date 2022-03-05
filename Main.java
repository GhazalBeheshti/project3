import java.util.Scanner;

class Calculator{
    int a, b;
    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    int addition(){return a+b;};
    int subtraction(){return a-b;};
    int multiplication(){return a*b;};
    int division(){return a/b;};
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter operation (+, -, *, /)");
        String operation = scanner.next();

        Calculator cal = new Calculator(a, b);
        int result = 0;
        switch (operation){
            case "+":
                result = cal.addition();
                break;
            case "-":
                result = cal.subtraction();
                break;
            case "*":
                result = cal.multiplication();
                break;
            case "/":
                result = cal.division();
                break;
            default:
                System.out.println("Invalid operation!");
        }
        System.out.println(a + operation + b + " = " + result);

    }
}
