	import java.util.*;

public class OpenClassRoomChap04 {

	public static void main(String[] args) {
		
		// Les conditions
		
		// IF ELSE / ELSE IF
		System.out.println("Saisir un entier : ");
		
		Scanner sc = new Scanner(System.in);
		int inttest = sc.nextInt();
		
		if (inttest > 0)
		{
			System.out.println("L'entier " + inttest + " est positif.");
		} else if (inttest < 0) {
			System.out.println("L'entier " + inttest + " est négatif.");			
		} else {
			System.out.println("L'entier " + inttest + " est nul.");
		}
		System.out.println("\n");
		
		// SWITCH
		
		switch (inttest)
		{
			case 0:
				System.out.println("Vraiment pas terrible...");
			break;
			case 100:
				System.out.println("Ouahou !!!");
			break;
			case -100:
				System.out.println("Ouf, c'est chaud...");
			break;
			default:
				System.out.println("OK, ça passe.");
			break;
		}
		
		// CONDITION TERNAIRE
		
		int x = 20, y = 30;
		int max = (x > y) ? x : y;
		System.out.println("Le maximum entre x = " + x + " et y = " + y + " est : max = " + max);

	}

}
