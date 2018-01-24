// HERITAGE
// Une classe hérite d'une autre signifie qu'elle "étend" une classe mère
// Elle dispose des mêmes variables mais aussi de variables propres
// Elle dispose aussi des mêmes méthodes qui peuvent toutefois être adaptées (=> polymorphe)

// POLYMORPHISME
// A ne pas confondre avec la surcharge
// => La surcharge correspond à la redéfinition d'une méthode dans un même classe
// avec un nombre ou un typage de paramètre différent
// => Une métohde polymorphe dispose de formes différentes dans des classes et par extension
// dans des instances distinctes. Son squelette est identique mais elle traite les choses différemment

public class OpenClassRoomChap02 {

	public static void main(String[] args) {
		
		Capital cap1 = new Capital();
		System.out.println(cap1.cityDescription());
	
		Capital cap2 = new Capital("Berlin","Allemagne",2408764,"Brandbourg");
		System.out.println(cap2.cityDescription());
		
		City [] cityTable = new City[6];
		String [] cityNameTable = {"Djakarta","Bordeaux","Poitiers","Londres","New Deli","Washington"};
		String [] cityCountryTable = {"Indonésie","France","France","Angleterre","Inde","Etats-Unis"};
		int [] cityPopulationTable = {1234234,298362,33465,3987678,5987234,3874698};
		String [] cityMonumentTable = {"","","","Big Ben","Punara Qila","Statue de Lincoln"};
		
		for (int i = 0 ; i < 6; i++) {
			if (i<3) cityTable[i] = new City(cityNameTable[i],cityCountryTable[i],cityPopulationTable[i]);
			else cityTable[i] = new Capital(cityNameTable[i],cityCountryTable[i],cityPopulationTable[i],cityMonumentTable[i]);
		}
		
		System.out.println("");
		System.out.println("En utilisant la méthode polymorphe développée en ad hoc :");
		System.out.println("---------------------------------------------------------");
		for (City C : cityTable) System.out.println(C.cityDescription());
		
		System.out.println("");
		System.out.println("En utilisant une mthode polymorphe de classe Object :");
		System.out.println("-----------------------------------------------------");
		for (City C : cityTable) System.out.println(C.toString());

		System.out.println("");
		System.out.println("En utilisant un raccourci (à éviter pour la lisibilité) :");
		System.out.println("---------------------------------------------------------");
		for (City C : cityTable) System.out.println(C);
		
		System.out.println("");
		System.out.println("En utilisant la classe Object et la méthode polymorphe toString(), définie par nos objets City et Capital :");
		System.out.println("-----------------------------------------------------------------------------------------------------------");
		for (Object C : cityTable) System.out.println(C.toString());

	}

}
