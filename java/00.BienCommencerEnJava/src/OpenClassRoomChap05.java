import java.util.*;

public class OpenClassRoomChap05 {

	public static void main(String[] args) {
		// LES BOUCLES
		
		// WHILE
		
		Scanner sc = new Scanner(System.in);
		
		char reponse = 'O';
		
		String prenom;
		
		while (reponse == 'O')
		{
			System.out.println("Saisissez un prénom : ");
			prenom = sc.nextLine();
			
			reponse = ' ';
			while (reponse != 'O' && reponse !='N') {
				System.out.println("Voulez-vous continuer ? (O/N) : ");
				reponse = sc.nextLine().charAt(0);
			}
		}
		System.out.println("Au revoir !");
		
		
		int a = 1, b = 15;
		while (a++ < b) System.out.println("Coucou " + a + " fois !");
		
		a= 1;
		while (++a < b) System.out.println("Coucou " + a + " fois !");
		
		// DO...WHILE
		// la boucle s'exécute aumoins 1 fois puisuqe la condition est évaluée à la fin !!!
		
		// FOR

		for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){
			  System.out.println("i = " + i + ", j = " + j);
		}
		
	}

}
