import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static int age(Scanner scan) 
    {
        
        while (true){
            System.out.println("How old are you?");
            try {
                return scan.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid Input, Try Again");
                scan.next();
            }
        }
    }
    public static void main (String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
        int age = age(scan);

        String year;

        if (age == 1) year = "year";
        else year = "years";

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age + " " + year + " old");

    }
}