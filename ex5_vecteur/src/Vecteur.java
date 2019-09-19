import java.util.Scanner;

public class Vecteur {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        // Variables

        double xa, xb;
        double ya, yb;
        double za, zb;
        double distance;

        // Lecture du point a

        System.out.println("Quelles sont les coordonnees du point A?");
        System.out.println("xa : ");
        xa = sc.nextDouble();

        System.out.println("ya : ");
        ya = sc.nextDouble();

        System.out.println("za : ");
        za = sc.nextDouble();

        System.out.println("Le point A (" + xa + ", " + ya + "," + za + ")");

        // Lecturer du point b

        System.out.print("xb : ");
        xb = sc.nextDouble();

        System.out.print("yb : ");
        yb = sc.nextDouble();

        System.out.print("zb : ");
        zb = sc.nextDouble();

        System.out.println("Le point A (" + xb + ", " + yb + "," + zb + ")");

        // Formule

        distance = Math.sqrt((Math.pow(xb-xa,2)) + (Math.pow(yb-ya,2)) + (Math.pow(zb-za,2)));
        System.out.println("La valeur de distance : " + distance);

        // Fermeture du Scanner

        sc.close();






    }
}
