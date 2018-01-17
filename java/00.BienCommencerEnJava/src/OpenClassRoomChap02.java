
public class OpenClassRoomChap02 {

	public static void main(String[] args) {
		// Les types, le casting
		
		int nbr1 = 10, nbr2 = 3;
		double resultat = (double)(nbr1 / nbr2);
		System.out.println("Le résultat est : " + resultat);
		
		double resultat2 = (double)(nbr1 / nbr2);
		System.out.println("Le résultat2 est : " + resultat2);
		
		double nbr11 = (double)nbr1;
		double nbr21 = (double)nbr2;

		double resultat3 = (nbr11 / nbr21);
		System.out.println("Le résultat2 est : " + resultat3);
		
		int i = 12;
		String j = new String();
		j = j.valueOf(i);
		System.out.println("La String j vaut : '" + j + "'");
		
		int k = Integer.valueOf(j).intValue();
		System.out.println("Le Int k vaut lui aussi : " + j);
		
	}
}
