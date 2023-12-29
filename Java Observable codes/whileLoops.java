import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args){
        // While Loops = executes a block of code as long as a it's condition remains true
        Scanner writer = new Scanner(System.in);
        String name = "";
        while (name.isBlank()){
            System.out.print("Enter the name: ");
            name = writer.nextLine();
        }
        System.out.println("Hello "+name);
        );
    }
}
