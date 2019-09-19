import java.util.Scanner;

public class Convertissseur1 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        // Variables

        double rad;
                int deg;

                        // Questions

        System.out.print("Quel est l,angle en radian?");
                rad = sc.nextDouble();
                System.out.println();

                // Reponse

        deg = (int) (180 * rad / Math.PI);
        System.out.println();

        System.out.println("La valeur en degre" + deg);

        sc.close();


    }
}
