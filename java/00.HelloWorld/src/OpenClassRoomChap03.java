import java.util.*;

public class OpenClassRoomChap03 {

	public static void main(String[] args) {
		// Lecture des saisie clavier
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez un mot : \n");
		String str = sc.nextLine();
		System.out.println("Votre saisie : " + str);
		

		Scanner sc1 = new Scanner(System.in);		
		System.out.println("Saisissez un int : \n");
		int intTest = sc1.nextInt();
		System.out.println("Votre saisie : " + intTest);

		Scanner sc2 = new Scanner(System.in);		
		System.out.println("Saisissez un caractère : \n");
		String caracString = sc2.nextLine();
		char carac = caracString.charAt(0);
		System.out.println("Votre saisie : " + carac);
	}
}
