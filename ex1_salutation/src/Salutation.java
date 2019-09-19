import java.util.Scanner;

public class Salutation {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        String nom;

        // Question à l'utilisateuur

        System.out.print("Quel est ton nom?");

        // Reponse

        nom = sc.next();

        // Bonjopur + nom

        System.out.print("Bonjour" + nom);

        sc.close();
    }
}
