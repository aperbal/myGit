public class City {
	// D�claration de variable d'instance : par d�fault, sans autres pr�cisions,
	// ces variables sont publiques et donc accessibles depuis l'ext�rieur de la classe.
	// Elle permette de d�terminer les caract�ristiques propres d'une instance
	protected String cityName;
	protected String cityCountry;
	protected int cityNbInhabitants;
	protected char cityNbInhabitantsCat;
	
	// D�claration de variables de classe. Elles sont utiles pour toutes les instances
	// d'une classe (Exemple le taux de TVA pour une classe qui calcule un prix ttc).
	
	// variable de classe public
	public static int cityCounter;
	
	// variable de classe priv�e (l'accesseur est d�clar� plus loin)
	protected static int innerCityCounter;
	
	
	public static int getInnerCityCounter() {
		return innerCityCounter;
	}
	
	
	//Constructeur par d�fault
	public City() {
		System.out.println("Ceci est un constructeur par d�faut... Aucun param�tre pass� � cette m�thode, mais instanciation d'un objet par d�faut...");
		cityName = "Inconnu";
		cityCountry = "Inconnu";
		cityNbInhabitants = 0;
		this.cityNbInhabitantsCat();
		cityCounter++;
		innerCityCounter++;
	}

	// Construteur avec param�tres
	public City(String cName, String cCountry, int cInhabitants) {
		cityName = cName;
		cityCountry = cCountry;
		cityNbInhabitants = cInhabitants;
		this.cityNbInhabitantsCat();
		cityCounter++;
		innerCityCounter++;
	}
	
	
	// Accesseurs
	
	public String getCityName() {
		return cityName;
	}
	
	public String getCityCountry() {
		return cityCountry;
	}
	
	public int getCityNbInhabitants () {
		return cityNbInhabitants;
	}

	// Mutateurs
	
	public void setCityName(String cName) {
		cityName = cName;
	}
	
	public void setCityCountry(String cCountry) {
		cityCountry = cCountry;
	}
	
	public void setCityNbInhabitants(int cNbInhabitants) {
		cityNbInhabitants = cNbInhabitants;
		this.cityNbInhabitantsCat();
	}
	

	// Exemple de m�thode d'instance
	private void cityNbInhabitantsCat (){
		if 
			(this.cityNbInhabitants <     1000) cityNbInhabitantsCat = 'A';
		else if
			(this.cityNbInhabitants <    10000) cityNbInhabitantsCat = 'B';
		else if
			(this.cityNbInhabitants <   100000) cityNbInhabitantsCat = 'C';
		else if
			(this.cityNbInhabitants >= 1000000) cityNbInhabitantsCat = 'D';			
	}
	
	
	public String cityDescription () {
		return "Je suis la ville de " + this.cityCountry + " appel�e " + this.cityName + ". J'ai " + this.cityNbInhabitants + " habitants, donc de cat�gorie " + this.cityNbInhabitantsCat +".";
	}
	
	public String cityCompareNbInhabitants (City cityComp) {
		if (this.cityNbInhabitants > cityComp.getCityNbInhabitants()) return this.cityName + " est plus peupl� que " + cityComp.getCityName() + ".";
		else if (this.cityNbInhabitants < cityComp.getCityNbInhabitants()) return cityComp.getCityName() + " est plus peupl� que " + this.cityName + ".";
		else return this.cityName + " et " + cityComp.getCityName() + " ont le m�me nombre d'habitants.";
	}

}

class Capital extends City {
	
	protected String monument;
	
	public Capital() {
		// Ce qui suit n'est possible que si les variables d'instance de la classe m�re
		// sont protected ou pubic (donc en g�n�ral protected pour conserver l'encapsulation)
		// this.cityName = "H�h�h�";
		super();
		this.monument = "aucun";
	}
	
	public Capital(String capitalName, String capitalCountryName, int capitalNbInhabitants, String capitalMonument) {
		super(capitalName, capitalCountryName, capitalNbInhabitants);
		this.monument = capitalMonument;
	}

	public void setCapitalMonument (String monumentName) {
		this.monument = monumentName;
	}
	
	public String cityDescription () {
		return super.cityDescription() + " Je suis la Capitale et j'ai un monument : " + this.monument;
	}
	
}