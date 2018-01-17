// CLASSES
// Variables de classe et d'instance
// Méthodes de classe : constructeurs, accesseurs, mutateurs
// Méthodes d'instances


public class OpenClassRoomChap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City city1 = new City();
		
		City city2 = new City("Marseille","France", 123456789);
		
		City city3 = new City("Lille","France",12345);		
		
		System.out.println(city2.getCityName());
		
		city2.setCityName("It's a shame MF !!!");
		System.out.println(city2.getCityName());

		City city4 = new City("Lyon", "France", 654003);
		City city5 = new City("Lille", "France", 123454);
		 
		System.out.println(city4.cityCompareNbInhabitants(city5));
		
		System.out.println(city3.cityDescription());
		
		System.out.println("Nombre de villes (version publique) : " + City.cityCounter);
		System.out.println("Nombre de villes (version privée) : " + City.getInnerCityCounter());

		City v2 = new City("Rio", "Brésil", 321654);
		
		System.out.println("Nombre de villes (version publique) : " + City.cityCounter);
		System.out.println("Nombre de villes (version privée) : " + City.getInnerCityCounter());
		

	}

}

