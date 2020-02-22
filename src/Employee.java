import java.util.Random;
import java.util.Scanner;

public class Employee {
    private static String surname;
    private static String name;



    public static void print() {
        name = enterParam("Please, enter the Name of Employee: ");
        surname = enterParam("Please, enter the Surname of Employee: ");

        System.out.println("Your Employee " + surname +" " + name + " has id " + genId() );
    }
/*
    public String Employee () {
        String surn;
        String
    }*/

    public static String enterParam(String message) {

        System.out.print(message);
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static int genId(){
        Random random = new Random();
        return random.nextInt();
     }
}