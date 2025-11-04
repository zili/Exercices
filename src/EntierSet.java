import java.util.*;

public class EntierSet {

    // Fonction pour effectuer la saisie des valeurs, sortie sur valeurs négatives ou 0
    public static Set<Integer> saisie() {
        Scanner scan = new Scanner(System.in);
        Set<Integer> nombres =  new HashSet<>();

        System.out.println("Entrez des entiers strictement positifs. "
                + "Pour terminer, entrez un nombre négatif ou 0.");

        while (true) {
            System.out.print("Un entier : ");
            int entree = scan.nextInt();

            // Condition de sortie : si on entre un nombre négatif ou 0
            if (entree <= 0) {
                break;
            }

            nombres.add(entree);
        }

        scan.close();
        return nombres;
    }

    // Fonction pour effectuer les calculs (somme, moyenne, max, min)
    // en utilisant le Set de nombres qu'on a saisi.
    public static void calculer(Set<Integer> liste) {
        // Afficher le Set "tel quel"
        System.out.println("Set de nombres saisi : " + liste);
        // Éviter division par 0 en cas de Set vide
        if (liste ==null || liste.isEmpty()) {
            System.out.println("Le Set est vide. Aucun calcul possible.");
            return;
        }

        int somme = liste.stream().mapToInt(x -> x).sum();
        double moyenne = liste.stream().mapToDouble(x -> x).average().getAsDouble();
        int maxVal = liste.stream().mapToInt(x -> x).max().getAsInt();
        int minVal =  liste.stream().mapToInt(x -> x).min().getAsInt();

        // Affichage des résultats
        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Max : " + maxVal);
        System.out.println("Min : " + minVal);
    }

    // Programme principal
    //https://github.com/zili/Exercices.git
    public static void main(String[] args) {
        // Saisie des valeurs
        Set<Integer> nombres = saisie();
        // Calcul et affichage des statistiques
        calculer(nombres);
    }
}