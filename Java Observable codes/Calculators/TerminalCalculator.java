import java.util.Scanner;

public class TerminalCalculator {
    public static void main(String[] args){
        //Task> Creating a terminal calculator
        Scanner writer = new Scanner(System.in);
        String op;
        double num1;
        double num2;
        double result;
        System.out.println("-------------- Calculator ---------------");

        System.out.print("Enter either (+ - * /): ");
        op = writer.next();
        System.out.print("Enter #1: ");
        num1 = writer.nextDouble();
        System.out.print("Enter #2: ");
        num2 = writer.nextDouble();

        switch (op){
            case "+":
                result = num1 + num2;
                System.out.println("result: "+result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("result: "+result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("result: "+result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("result: "+result);
                break;
            default:
                System.out.println("Try again, maybe the data or syntax is incorrect");
                break;
        }
        System.out.println("----------------------------------");

    }
}
