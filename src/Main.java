import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in hur många minuter per månad användaren ringer
        //   Kontant --> 33 minuter eller mindre
        //   Normal  --> Mellan 33 och 66 (inklusive) minuter
        //   Plus    --> Mer än 66 minuter

        Scanner input = new Scanner(System.in);
        System.out.print("Hur många minuter uppskattar du att du kommer ringa per månad? ");
        int minutes = input.nextInt();

        if (minutes <= 33) {
            System.out.println("Välj Kontant");
        } else if (minutes <= 66) {
            System.out.println("Välj Normal");
        } else {
            System.out.println("Välj Plus");
        }
    }
}