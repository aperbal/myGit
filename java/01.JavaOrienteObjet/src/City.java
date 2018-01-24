import java.util.Objects;

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
	
	
	// Constructeur par d�fault
	
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

	public char getCityNbInhabitantsCat () {
		return cityNbInhabitantsCat;
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
	
	// Exemples de m�thode d'instance
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
	
	
	// Polymorphisme d'une m�thode Object (d�finie pour tout objet Java), ici toString();
	public String toString(){
		return "Je suis la ville de " + this.cityCountry + " appel�e " + this.cityName + ". J'ai " + this.cityNbInhabitants + " habitants, donc de cat�gorie " + this.cityNbInhabitantsCat +".";
	}

	// 2 m�thodes tr�s souvent red�finie : hashCode() et equals()
	// Ici hashCode2 qui est une version red�finit compl�tement par dev...
	public int hashCode2() {
		//On d�finit un multiplication impair, de pr�f�rence un nombre premier
		//Ceci afin de garantir l'unicit� du r�sultat final
		final int prime = 31;
		int result = 1;
		result = prime * result + cityNbInhabitantsCat;
		result = prime * result + cityNbInhabitants;
		result = prime * result + ((cityCountry == null) ? 0 : cityCountry.hashCode());
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		return result;
	}


	// Red�finition avec la classe Objects
	public int hashCode() {
		return Objects.hash(this.cityNbInhabitantsCat, this.cityNbInhabitants, this.cityCountry, this.cityName);
	}

	
	public boolean equals2(Object obj) {
		// V�rification de base : les r�f�rences d'objets sont identique
		if(this == obj) return true;
		// V�rification de base : l'objet � comparer n'est pas null
		if (obj == null) return false;
		// V�rification de base : les objets sont du m�me type... Voir dans les prochains chapitres
		if(this.getClass() != obj.getClass()) return false;
		
		// Maintenant ont compare les valeurs des attributs des 2 instances
		City D = (City) obj;
		if(D.cityNbInhabitantsCat != this.cityNbInhabitantsCat) return false;
		if(D.cityNbInhabitants != this.cityNbInhabitants) return false;
		
		if(this.cityCountry == null) if(D.cityCountry != null) return false;
		else if (!this.cityCountry.equals(D.cityCountry)) return false;
		
		if(this.cityName == null) if(D.cityName != null) return false;
		else if (!this.cityName.equals(D.cityName)) return false;
		
		return true;

	}
	
	// Red�finition avec la classe Objects
	public boolean equals(Object obj) {
		
		// V�rification de base : les r�f�rences d'objets sont identique
		if(this == obj) return true;
		// V�rification de base : l'objet � comparer n'est pas null
		if (obj == null) return false;
		// V�rification de base : les objets sont du m�me type... Voir dans les prochains chapitres
		if(this.getClass() != obj.getClass()) return false;
		
		City C = (City) obj;
		
		return
			   Objects.equals(C.getCityNbInhabitantsCat(), this.cityNbInhabitantsCat)
			&& Objects.equals(C.getCityNbInhabitants(), this.cityNbInhabitants)
			&& Objects.equals(C.getCityName(), this.cityName)
			&& Objects.equals(C.getCityCountry(), this.cityCountry);
		
	}

}

// D�claration d'une sousclasse de City (on dit que City est la superclasse de Capital)
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
	
	// D�claration d'une fonction polymorphe : elle � la m�me squelette
	// que la m�thode de la superclasse mais ne renvoit pas le m�me r�sultat (mais il a le m�me typage)
	public String cityDescription () {
		return super.cityDescription() + " Je suis la Capitale et j'ai un monument : " + this.monument;
	}
	
	// Polymorphisme d'une m�thode Object (d�finie pour tout objet Java), ici toString();
	public String toString () {
		return super.toString() + " Je suis la Capitale et j'ai un monument : " + this.monument;
	}

	
}