import java.util.Scanner;
import javax.swing.JOptionPane;

public class main{
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("I like pizza!");
        //printed numbers
        System.out.println(3);
        System.out.println(7+7);
        System.out.println(7*7);
        System.out.println(7/2);

        String name = "GammaHiko";
        System.out.println("Hello "+name);

        //integers | stores whole numbers
        int x = 9;
        int y = 9;
        int sum = x+y;
        System.out.println("The result is: "+sum);

        //double | stores decimal portion and will digit up to 15
        double pi = 3.14159;
        double radius = 10;
        double circumference = 2*pi*radius;
        System.out.println(circumference);

        //float numbers, also equal to double but there have 6 to 7 digits only
        float speed = 200;
        float exchange = 6;
        float balance = 3*speed/exchange;
        System.out.println(balance);

        //char, stores single characters
        char grade = 'A';
        char initialation = 'B';
        char symbol = '@';
        System.out.println(symbol+"gregorian");

        //booleans
        boolean dead = false;
        boolean alive = true;
        System.out.println("Is he still alive? "+alive);

        //switching variables
        String yForStr = "HO2";
        String xForStr ="Acid";

        String temp;
        temp = yForStr;
        yForStr=xForStr;
        xForStr= temp;

        System.out.println("dangerous: "+xForStr);
        System.out.println("Safe: "+yForStr);

        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String inputname = scanner.nextLine();
        System.out.println("What's your age?");
        int inputage = scanner.nextInt();

        System.out.println("Hello "+inputname);
        System.out.println("You're "+inputage+" years old");

        //GUI intro msgs
        //See on other file

    }
}

//Tutorials
/*
* Every line of code that runs in Java must be inside a class. In our example, we named the class Main.
* A class should always start with an uppercase first letter.

Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

* The name of the java file must match the class name. When saving the file,
* save it using the class name and add ".java" to the end of the filename.
* To run the example above on your computer, make sure that Java is properly installed:
* Go to the Get Started Chapter for how to install Java. The output should be: Hello World!
*
* The main() method is required and it always in every java program
*
* Any code inside the main() method will be executed. Don't worry about the keywords before and after main.
* You will get to know them bit by bit while reading this tutorial.

For now, just remember that every Java program has a class name which must match the filename,
* and that every program must contain the main() method.
*
* Note: The curly braces {} marks the beginning and the end of a block of code.

System is a built-in Java class that contains useful members, such as out, which is short for "output".
* The println() method, short for "print line", is used to print a value to the screen (or a file).

Don't worry too much about System, out and println(). Just know that you need them together to print stuff to the screen.

You should also note that each code statement must end with a semicolon (;).
*
* println() methods as you want. Note that it will add a new line for each method
*/

//Variables
/*
* Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
* */

//Syntax > type variableName = value;
//Where type is one of Java's types (such as int or String),
//and variableName is the name of the variable (such as x or name).
// The equal sign is used to assign values to the variable.
