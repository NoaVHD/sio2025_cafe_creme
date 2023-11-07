package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Saisir le nombre de piece 1 cent : ");
        int nb1Cent = clavier.nextInt();
        System.out.println("Saisir le nombre de piece 5 cents : ");
        int nb5Cent = clavier.nextInt();
        System.out.println("Saisir le nombre de piece 10 cents : ");
        int nb10Cent = clavier.nextInt();
        System.out.println("Saisir le nombre de piece 20 cents : ");
        int nb20Cent = clavier.nextInt();
        System.out.println("Saisir le nombre de piece 50 cents : ");
        int nb50Cent = clavier.nextInt();
        clavier.close();
        int prixCafe = 1 ;
        double nbCentTotal = nb1Cent*0.01+nb5Cent*0.05+nb10Cent*0.10+nb20Cent*0.20+nb50Cent*0.50 ;
        if (nbCentTotal < prixCafe){
            double reste = nbCentTotal - prixCafe;
            System.out.println("Vous avez pas asser pour payer votre café-crème, il vous manque "+ reste +" $");
        }
        
        else if (nbCentTotal == prixCafe) {
            System.out.println("Vous avez exactement de quoi vous payer un café-crème");
        }

        else {
            double reste = nbCentTotal - prixCafe;
            System.out.println("Vous avez de quoi vous payer un café-crème.");
            System.out.println("Il vous restera "+ reste + " cents après avoir pris votre café.");
        }
    }
    
}
