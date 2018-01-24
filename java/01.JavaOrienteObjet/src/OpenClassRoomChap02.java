// HERITAGE
// Une classe h�rite d'une autre signifie qu'elle "�tend" une classe m�re
// Elle dispose des m�mes variables mais aussi de variables propres
// Elle dispose aussi des m�mes m�thodes qui peuvent toutefois �tre adapt�es (=> polymorphe)

// POLYMORPHISME
// A ne pas confondre avec la surcharge
// => La surcharge correspond � la red�finition d'une m�thode dans un m�me classe
// avec un nombre ou un typage de param�tre diff�rent
// => Une m�tohde polymorphe dispose de formes diff�rentes dans des classes et par extension
// dans des instances distinctes. Son squelette est identique mais elle traite les choses diff�remment

public class OpenClassRoomChap02 {

	public static void main(String[] args) {
		
		Capital cap1 = new Capital();
		System.out.println(cap1.cityDescription());
	
		Capital cap2 = new Capital("Berlin","Allemagne",2408764,"Brandbourg");
		System.out.println(cap2.cityDescription());
		
		City [] cityTable = new City[6];
		String [] cityNameTable = {"Djakarta","Bordeaux","Poitiers","Londres","New Deli","Washington"};
		String [] cityCountryTable = {"Indon�sie","France","France","Angleterre","Inde","Etats-Unis"};
		int [] cityPopulationTable = {1234234,298362,33465,3987678,5987234,3874698};
		String [] cityMonumentTable = {"","","","Big Ben","Punara Qila","Statue de Lincoln"};
		
		for (int i = 0 ; i < 6; i++) {
			if (i<3) cityTable[i] = new City(cityNameTable[i],cityCountryTable[i],cityPopulationTable[i]);
			else cityTable[i] = new Capital(cityNameTable[i],cityCountryTable[i],cityPopulationTable[i],cityMonumentTable[i]);
		}
		
		System.out.println("");
		System.out.println("En utilisant la m�thode polymorphe d�velopp�e en ad hoc :");
		System.out.println("---------------------------------------------------------");
		for (City C : cityTable) System.out.println(C.cityDescription());
		
		System.out.println("");
		System.out.println("En utilisant une mthode polymorphe de classe Object :");
		System.out.println("-----------------------------------------------------");
		for (City C : cityTable) System.out.println(C.toString());

		System.out.println("");
		System.out.println("En utilisant un raccourci (� �viter pour la lisibilit�) :");
		System.out.println("---------------------------------------------------------");
		for (City C : cityTable) System.out.println(C);
		
		System.out.println("");
		System.out.println("En utilisant la classe Object et la m�thode polymorphe toString(), d�finie par nos objets City et Capital :");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		for (Object C : cityTable) System.out.println(C.toString());

	}

}
