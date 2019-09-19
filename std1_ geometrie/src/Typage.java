import java.util.Scanner;

public class Typage {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

                // Variables

        int var1 = 1;
        double var2 = 1;
        char var3 = 1;

        // Calcul

        Integer.toString(var1);

        // le domaine des boolean qui ne comporte en fait que deux valeurs : vrai ou faux n'est pas compatible avec
        // les int qui sont des entiers

        double data = var2;
        int value = (int)data;

        String.valueOf(var2);
        Math.round(var2);

        Integer.parseInt(String.valueOf(var3));

        sc.close();






        // Operation

        System.out.println("Operation#1 : " + var1 + var2);
        System.out.println("Operation#2 : " + (var1 + var2));
        System.out.println("Operation#3 : " + var1 + var2 + var3);
        System.out.println("Operation#4 : " + (var1 + var2 + var3));

        sc.close();

    }
}
