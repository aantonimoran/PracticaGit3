import java.util.Scanner;

public class SolucioAlumnes {
    public static void main(String[] args) {

        /**
         * Declaració dels Scanners
         * Si usem un Scanner per a enters i després l'usem per rebre text usant nextLine(), falla.
         * Per aquest motiu, s'usen dos Scanners: un per a enters i un altre per Strings. 
         * Això ja funciona com s'espera!
         */
        Scanner sc = new Scanner(System.in); // Declarem l'Scanner per a enters

        // Declaració de variables
        System.out.println("Número d'alumnes: ");
        int n = sc.nextInt(); // número d'alumnes
        System.out.println("Número d'UF: ");
        int ufs = sc.nextInt(); // número d'UF
        int ufsaprovades = 0;
        int aprovatot = 0;
        int totalnotes = 0;
        double millorPromig = 0;
        String millorAlumne = "";
        int i = 0; // comptador
        int j = 0; // segon comptador
	int u = 0;
        String name = ""; // nom de l'alumne

        // Per cada alumne
        while (n > i) {
            // Demanem el nom
            // Al usar sc.next(), demanem un String, ja que sc.nextLine() fa coses rares
            System.out.println("Noms dels alumnes: ");
            name = sc.next(); //scanner per escriure el nom dels alumnes
            j = 0;
            ufsaprovades = 0;
            totalnotes = 0;
            while (ufs > j) {
                int notes = sc.nextInt(); //scanner de les notes dels almnes
                if (notes>=5) ufsaprovades++;
                totalnotes = totalnotes + notes;
                j++;
            }
            if (ufsaprovades == ufs) {
                //ha aprovat tot
                aprovatot++;
            }
                //Calcul del promig
                double promig = (double) totalnotes/ufs;
                //Millor promig
                if (promig>millorPromig) {
                    millorPromig = promig;
                    millorAlumne = name;
                }
            i++;
        }
        System.out.println("Han aprovat tot: " + aprovatot);
        System.out.println("El millor alumne es: " + millorAlumne + " amb un promitg de: " + millorPromig);
    }
    
}
