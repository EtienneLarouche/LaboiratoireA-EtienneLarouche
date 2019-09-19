import java.util.Scanner;

public class Covertisseur2 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        // Variables

        double rad;
        int deg;

        // Question

        System.out.print("Quel est l'angle en degré?");
        deg = sc.nextInt();

        rad = Math.toRadians(deg);

        // Reponse

        System.out.println();

        System.out.print("la valeur en rad" + rad);

        sc.close();

    }
}
