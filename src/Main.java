import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreAleatoire = random.nextInt(100) + 1; // 1 à 100
        int essaisRestants = 10;
        boolean gagne = false;

        System.out.println("Bienvenue dans le jeu de devinettes !");
        System.out.println("Devinez le nombre entre 1 et 100. Vous avez 10 essais.");

        while (essaisRestants > 0) {
            System.out.print("Entrez un nombre : ");
            int tentative = scanner.nextInt();
            essaisRestants--;

            if (tentative == nombreAleatoire) {
                System.out.println("Bravo ! Vous avez deviné le bon nombre !");
                gagne = true;
                break;
            } else if (tentative < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("Trop grand !");
            }

            System.out.println("Il vous reste " + essaisRestants + " essai(s).");
        }

        if (!gagne) {
            System.out.println("Désolé, vous avez perdu. Le nombre était : " + nombreAleatoire);
        }

        scanner.close();
    }
}