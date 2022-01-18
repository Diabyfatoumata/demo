/*
public class MonApplication7
{

    public static void main(String arg[]){
	System.out.println("Bienvenue dans mon application de gestion humaines");
	
	String employe1;
	
	int salaire1;
	
    Strig employe1 = "Yves" ;
	
	int salaire = 450000 ;
	
	System.out.println(employe1 + " a un salaire de " + salaire1);
	
	}

}
*/

// Boucle While (Tant que) instruction a repeter

import java.util.Scanner;

public class MonApplication7
{

public static void main (String arg[])
{
 System.out.println("demo boucle while"); 

String prenom;
char reponse = '0';
Scanner sc = new Scanner(System.in);
//Tant que la reponse deonnée est egale a oui
while (reponse == '0') 
{
    //On affiche une instruction
	System.out.println("Donnez un prenom: ");
    //On recupere le prenom saisi
    prenom = sc.nextLine();
    //on affiche notre phrase avec le prenom
    System.out.println("Bonjour" +prenom+", Comment vas tu ?");	
	// On demande si la personne veux faire un essai
	System.out.println("Voulez vous reessayer ? (O/N)");
	// O n recupere la reponse de l'utilisateur
	reponse = sc.nextLine().charAt(0);
	
}
    System.out.println(" Au revoir");

}
}

