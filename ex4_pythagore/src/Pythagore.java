import java.util.Scanner;

public class Pythagore {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        // Variables

        int a;
        int b;
        double c;

        // Question a

        System.out.println("Quelle est la valeur de a?");
        a = sc.nextInt();

        // Question b

        System.out.println("Quelle est la valeur de b?");
        b = sc.nextInt();

        // Formule

        c = (Math.pow(a,2)) + (Math.pow(b,2));
        c = Math.sqrt(c);
        System.out.println("La valeur de pythagore : " + c);

        sc.close();




;    }
}
