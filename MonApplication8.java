
import java.util.Scanner;

public class MonApplication8
{

public static void main (String arg[])
{
 System.out.println("demo do..while"); 
String prenom = new String();
char reponse = '3';

Scanner sc = new Scanner(System.in);

do{ 
	System.out.println("Donnez un prenom: ");
    prenom = sc.nextLine();
    System.out.println("Bonjour" +prenom+", Comment vas tu ?");
    do
	    {
		    System.out.println("Voulez vous reessayer ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
 
        }while(reponse != 'o') ;
	
	
   } while (reponse == 'o');
    System.out.println("Au revoir");
}
}

