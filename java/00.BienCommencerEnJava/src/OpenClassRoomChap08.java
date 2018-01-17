import java.util.*;

public class OpenClassRoomChap08 {

	public static void main(String[] args) {
		// Les m�thodes de Classes
		String 
				  upperChaine = new String("Yo, une Cha�ne avec Plein de MAJ partouT !")
				, lowerChaine = new String()
				, subChaine = new String()
				, givenChaine1 = new String()
				, givenChaine2 = new String()
				, mot = new String("anticonstitutionnellement");
		Scanner scan = new Scanner(System.in);
		lowerChaine = upperChaine.toLowerCase();
		System.out.println("La cha�ne initiale : \n" + upperChaine);
		System.out.println("La cha�ne sans ses MAJ : \n" + lowerChaine);
		System.out.println("La cha�ne a une taille de : \n" + upperChaine.length());
		System.out.println("");
		
		subChaine = upperChaine.substring(4, 10);
		System.out.println("Extraction de la cha�ne du caract�re " + 5 + " au caract�re " + 10 + " :");
		System.out.println("'" + subChaine + "', soit " + subChaine.length() + " caract�res extraits.");
		System.out.println("");
		
		System.out.println("Premi�re occurence de 't' dans " + mot + " : " + mot.indexOf("t"));
		System.out.println("Derni�re occurence de 't' dans " + mot + " : " + mot.lastIndexOf("t"));
		System.out.println("Premi�re occurence de 'ti' dans " + mot + " : " + mot.indexOf("ti"));
		System.out.println("Derni�re occurence de 'ti' dans " + mot + " : " + mot.lastIndexOf("ti"));
		System.out.println("Premi�re occurence de 'x' dans " + mot + " : " + mot.lastIndexOf("x"));
		System.out.println("");		

		System.out.println("Saisissez une 1�re cha�ne de caract�re :");
		givenChaine1 = scan.nextLine();
		System.out.println("Saisissez une 2nd  cha�ne de caract�re :");
		givenChaine2 = scan.nextLine();
		
		if (givenChaine1.equals(givenChaine2))
			 System.out.println("Vos 2 cha�nes sont les m�mes.");
		else System.out.println("Vos 2 cha�nes ne sont pas les m�mes.");
		System.out.println("");
		
		double X = 0.0;
		X = Math.random();
		System.out.println("Un nombre random X = " + X);
		System.out.println("Sinus de 120� = " + Math.sin(120));
		System.out.println("Cosinus de 120� = " + Math.cos(120));
		System.out.println("Tangente de 120� = " + Math.tan(120));
		System.out.println("Valeur Absolue de -9873.02 = " + Math.abs(-9873.02));
		
		
		System.out.println("2 puissance 8 = " + Math.pow(2, 8));
		System.out.println("");
		
		System.out.println("Utilisation de myPow pour calculer 2^8 : " + myPow(2,8));
		System.out.println("");
		
		String [] tab1 = {"check", "this", "out"};
		parcourirTableauString(tab1);
		System.out.println("");		
		
		int [] tab2 = {1, 4, 38};
		parcourirTableauInt(tab2);
		System.out.println("");		

		parcourirTableau(tab1);
		System.out.println("");		
		
		parcourirTableau(tab2);
		System.out.println("");		
				
		String [][] tab3={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
		int [][] tab4 = {{0,2,4,6},{1,3,5,7}};
		
		parcourirTableau(tab3);
		System.out.println("");		
		
		parcourirTableau(tab4);
		System.out.println("");		
	}
	
	public static double myPow (double a, int b) {
		double res = 0;
		for (int i=1 ; i<=b ; i++) { if (i==1) res = a; else res *= a; }
		return res;
	}
	
	public static void parcourirTableauString (String[] tableau) {
		System.out.print("Contenu du tableau : ");
		for(String valeurTab : tableau) System.out.print(valeurTab + " ");
	}	
	
	public static void parcourirTableauInt (int [] tableau) {
		System.out.print("Contenu du tableau : ");
		for(int i : tableau) System.out.print(i + " ");
	}
	
	// Principe de surcharge : on d�clare plusieurs fois la m�thode
	// avec des param�tres de types diff�rents

	public static void parcourirTableau (String[] tableau) {
		System.out.print("Contenu du tableau : ");
		for(String valeurTab : tableau) System.out.print(valeurTab + " ");
	}	
	
	public static void parcourirTableau (int [] tableau) {
		System.out.print("Contenu du tableau : ");
		for(int i : tableau) System.out.print(i + " ");
	}
	
	public static void parcourirTableau (String[][] tab2) {
		System.out.print("Contenu du tableau : \n");
		for(String [] tab : tab2) {
			for (String val: tab) System.out.print(val + " ");
			System.out.println(" ");
		}
	}
	
	public static void parcourirTableau (int[][] tab2) {
		System.out.print("Contenu du tableau : \n");
		for(int [] tab : tab2) {
			for (int val: tab) System.out.print(val + " ");
			System.out.println(" ");
		}
	}

	
	
}
