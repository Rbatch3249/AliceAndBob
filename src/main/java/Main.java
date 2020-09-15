import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();


        boolean isNameAliceOrBob = true;
        while(isNameAliceOrBob )
        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            isNameAliceOrBob = false;
            System.out.println("Greetings");
            break;
            }else{
                System.out.println("Invalid Name");
                name = scanner.next();

        }

            }
    }

