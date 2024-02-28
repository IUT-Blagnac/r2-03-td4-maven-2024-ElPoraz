import java.util.Scanner;

public class AlgosTableaux {

    /**
     * Demande à l'utilisateur de saisir un entier, jusqu'à ce que
     * l'entier saisi soit entre les deux bornes en paramètres.
     *
     * @param pfBorneInf IN : borne inférieure
     * @param pfBorneSup IN : borne supérieure
     *
     * @return un entier entre pfBorneInf et pfBorneSup, compris
     */
    public static int saisieIntC (int pfBorneInf, int pfBorneSup){
        int valeur;
        Scanner clavier = new Scanner(System.in) ;
        System.out.println("Donnez une valeur comprise entre "+pfBorneInf+" et "+pfBorneSup+ "?");
        valeur = clavier.nextInt();
        while (valeur<pfBorneInf || valeur>pfBorneSup){
            System.out.println("Erreur ! Donnez une valeur comprise entre "+pfBorneInf+" et "+pfBorneSup+ "?");
            valeur = clavier.nextInt();
        }
        return valeur;
    }

    /**
     * Demande à l'utilisateur :
     *   1. de saisir le nombre de cases qu'il souhaite remplir, et
     *      répète l'opération, jusqu'à ce que ce nombre soit
     *      acceptable
     *   2. de remplir les cases une à une.
     *
     * @param pfTab OUT : tableau à remplir
     *
     * @return le nombre de cases remplies dans le tableau
     */
    public static int saisirTableau (int[] pfTab){
        int nbEl = 0 ;
        nbEl=saisieIntC(1,100);
        Scanner clavier = new Scanner(System.in);
        for (int i=0;i<nbEl;i++){
            System.out.println("Saisir la " + (i+1) + " valeur");
            pfTab[i]=clavier.nextInt();
        }

        System.out.println("J'avais " + pfTab.length
            + " cases disponibles, et j'en ai rempli "
            + nbEl);
        return nbEl ;
    }

    /**
     * Affiche le tableau en paramètre.
     *
     * @param pfTab IN : tableau
     * @param pfNbEl IN : nombre de cases remplies dans le tableau
     *
     */
    public static void afficherTableau(int[] pfTab, int pfNbEl) {
        for (int i=0; i<pfNbEl; i++){
            System.out.println(pfTab[i]);
        }
    }

    /**
     * Inverse le tableau.
     *
     * @param pfTab OUT : tableau inverser
     * @param pfNbEl IN : nombre de cases remplies dans le tableau
     *
     */
    public static void inverserTableau(int[] pfTab, int pfNbEl) {
        for (int i=0; i<(pfNbEl/2); i++){
            int pivot=pfTab[i];
            pfTab[i]=pfTab[pfNbEl-i-1];
            pfTab[pfNbEl-i-1]=pivot;
        }
    }    

    /**
     * Supprime les doublons du tableau
     *
     * @param pfTabS OUT : tableau sans doublons
     * @param pfNbEl IN : nombre de cases remplies dans le tableau
     * @param pfTab IN : tableau remplis avec potentiel doublons
     *
     */
    public static void eliminerDoublons(int[] pfTab, int[] pfTabS, int pfNbEl) {
        for (int i=0; i<pfNbEl; i++){
            for (int j=1; j<=pfNbEl; j++){
                if (pfTab[i]!=pfTab[j]){
                    pfTabS[i]=pfTab[i];
                }
            }
        } 
    }

    public static void main(String [] args){
        /* Declaration des variables */
        int nbVal ; //nombre de valeurs a traiter
        int tab[]  ; // tableau permettant de stocker les valeurs
        int tabSansDoublon[]  ; // tableau permettant de stocker les valeurs

        tab = new int[100] ;
        tabSansDoublon = new int[100] ;

        // Ajouter les appels aux algorithmes :
        nbVal= saisirTableau(tab);
        afficherTableau(tab,nbVal);
        inverserTableau(tab,nbVal);
        afficherTableau(tab,nbVal);
        //eliminerDoublons(tab,tabSansDoublon,nbVal);
        //afficherTableau(tabSansDoublon, nbVal);

    }

}