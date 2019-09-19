import java.util.Scanner;

public class Resolution {

    public static void main(String[] args) {

        // Variables

        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double discriminant;
        double x1;
        double x2;

        // Lecture des valeurs

        System.out.println("Entrer des valeurs");

        System.out.println("a > ");
        a = sc.nextDouble();

        System.out.println("b > ");
        b = sc.nextDouble();

        System.out.println("c > ");
        c = sc.nextDouble();

        // Calcul

        discriminant = (Math.pow(b, 2)) - 4 * a * c;

        System.out.println("Discriminsant : " + discriminant);

        x1 = (b * -1 + Math.sqrt(discriminant)) / (2 * a);

        System.out.println("X1 : " + x1);

        x1 = (b * -1 - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("X2 : " + x1);

        // Fermeture du Scanner

        sc.close();
    }
}
