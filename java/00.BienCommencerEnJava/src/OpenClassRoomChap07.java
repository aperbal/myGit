import java.util.*;

public class OpenClassRoomChap07 {

	public static void main(String[] args) {
		// Les tableaux
		char [] tableauChar = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		// Recherche dans un tableau simple entrée avec boucle for
		Scanner scan = new Scanner (System.in);
		char enteredLetter = ' ';		
		char selectTryAgain = ' ';
		int i, j;
		
		System.out.println("JEU : Devinez les lettres du tableau :) !");
		
		do {
			System.out.println("Entrez une lettre minuscule :");
			enteredLetter = scan.nextLine().charAt(0);
			
			for (i=0 , j=0; i < tableauChar.length ; i++) {
				if (tableauChar[i] == enteredLetter) j++;
			}
			if (j > 0) System.out.println("La lettre " + enteredLetter + " est bien dans le tableau ! Bravo !");
			else System.out.println("La lettre " + enteredLetter + " n'est pas dans le tableau...");
			
			do {
				System.out.println("Voulez-vous réessayer ? (O/N)");
				selectTryAgain = scan.nextLine().charAt(0);
			} while (selectTryAgain != 'O' && selectTryAgain != 'N');
			
		} while (selectTryAgain == 'O');
		
		System.out.println("OK, Bye Bye !!!!!!");
		
		
		// Recherche dans un tableau simple entrée avec boucle while
		int[][] tableauIntPow2 = {{0,2,4,6},{1,3,5,7}};
		int l = 0, m = 0;
		
		while (l < 2) {
			m = 0;
			while (m < 4) {
				System.out.print(tableauIntPow2[l][m]);
				m++;
			}
			l++;
			System.out.println("");
		}	
		
		
		// Syntaxe hyper efficace dans une boucle for
		// avec des tableaux simple et double entrée.
		// ------------------------------------------
		for(char carac : tableauChar) System.out.print(carac);
		
		System.out.println("");
		
		for (int[] tabint : tableauIntPow2) {
			for (int inint : tabint) System.out.print(inint);
		}
		
		System.out.println("");

		
		String tabStringPow2[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
		for (String[] tabString : tabStringPow2) {
			for (String inString : tabString) System.out.print(inString + " ");
			System.out.println("");
		}

	}
}
