package ci.pigier;

import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {
        // TP conversion
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
        System.out.println("-------------------------------------------------");
        int mode;
        char reponse = 'O';
        Scanner sc = new Scanner(System.in);

        while (reponse == 'O') {
            System.out.println("Choississez le mode de conversion : ");
            System.out.println("1 - Conversion CELSIUS - FAHRENHEIT");
            System.out.println("2 - Conversion  FAHRENHEIT - CELSIUS");


            mode = sc.nextInt();

            if(mode == 1) {
                // conversion celsius - farh
                System.out.println("Température à convertir : ");
                int temperature;
                temperature = sc.nextInt();
                double cel_farh = (((double)(temperature) * 9/5) + 32);
                System.out.println(temperature + " C correspond à : " + cel_farh + " F");

            } else if(mode == 2) {
                // conversion farh - celsuis
                System.out.println("Température à convertir : ");
                int temperature;
                temperature = sc.nextInt();
                double fahr_cel = (((double)(temperature) - 32) * 5/9);
                System.out.println(temperature + " F correspond à : " + fahr_cel + " C");

            } else {
                System.out.println("choix invalide!");

            }
            reponse = '?';
            while (reponse != 'O' && reponse != 'N') {
                System.out.println("Souhaitez vous convertir une autre température ?(O/N)");
                String ligne = sc.nextLine().trim();
                if (!ligne.isEmpty()) {
                    reponse = ligne.charAt(0);
                }
            }

        }

        System.out.println("Au revoir !");

    }
}
