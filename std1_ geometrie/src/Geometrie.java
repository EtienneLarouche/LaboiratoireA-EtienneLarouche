public class Geometrie {

    public static void main(String [] args) {

        // Variables

        double rayon = 10.0;
        double rayoncone = 3.0;
        double hauteurcone = 7.0;
        double longueur = 7.0;
        double hauteur = 5.0;
        double apotheme = 7.1589108;
        double surface = 0.0;
        double volume = 0.0;

        // Calcul du Cercle

        surface = Math.PI * Math.pow(rayon,2);
        System.out.println("Le Cercle\n - Rayon : " + rayon + "\n - Surface : " + surface);

        // Calcul du Cube

        surface = Math.pow(longueur,2) * 6;
        volume = Math.pow(longueur,3);
        System.out.println("\nLe Cube\n - Longueur " + longueur + "\n - Surface : " +surface + "\n - Volume : "
        + volume);

        // Calcul du Cylindre

        surface = Math.PI * Math.pow(rayon,2) * 2 + 2 * Math.PI * rayon * hauteur;
        volume = Math.PI * Math.pow(rayon,2) * hauteur;
        System.out.println("\nLe Cylindre\n - Rayon : " + rayon + "\n - Hauteur : " + hauteur + "\n - Surface : "
        + surface + "\n - Volume : " + volume);

        // Calcul du cone

        surface = Math.PI * rayoncone * apotheme + Math.PI * Math.pow(rayoncone,2);
        volume = (Math.PI * Math.pow(rayoncone,2) * hauteurcone) /3;
        System.out.println("\nLe Cone\n - Rayon : " + rayoncone + "n - Hauteur : " + hauteurcone + "\n - Apotheme : "
        + apotheme + "\n - Surface : " + surface + "\n - Volume : " + volume);






    }

}