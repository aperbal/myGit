import java.util.Objects;

public class City {

	// Déclaration de variable d'instance : par défault, sans autres précisions,
	// ces variables sont publiques et donc accessibles depuis l'extérieur de la classe.
	// Elle permette de déterminer les caractéristiques propres d'une instance
	protected String cityName;
	protected String cityCountry;
	protected int cityNbInhabitants;
	protected char cityNbInhabitantsCat;
	
	// Déclaration de variables de classe. Elles sont utiles pour toutes les instances
	// d'une classe (Exemple le taux de TVA pour une classe qui calcule un prix ttc).
	
	// variable de classe public
	public static int cityCounter;
	
	// variable de classe privée (l'accesseur est déclaré plus loin)
	protected static int innerCityCounter;
	
	
	public static int getInnerCityCounter() {
		return innerCityCounter;
	}
	
	
	// Constructeur par défault
	
	public City() {
		System.out.println("Ceci est un constructeur par défaut... Aucun paramètre passé à cette méthode, mais instanciation d'un objet par défaut...");
		cityName = "Inconnu";
		cityCountry = "Inconnu";
		cityNbInhabitants = 0;
		this.cityNbInhabitantsCat();
		cityCounter++;
		innerCityCounter++;
	}

	// Construteur avec paramètres
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
	
	// Exemples de méthode d'instance
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
		return "Je suis la ville de " + this.cityCountry + " appelée " + this.cityName + ". J'ai " + this.cityNbInhabitants + " habitants, donc de catégorie " + this.cityNbInhabitantsCat +".";
	}
	
	public String cityCompareNbInhabitants (City cityComp) {
		if (this.cityNbInhabitants > cityComp.getCityNbInhabitants()) return this.cityName + " est plus peuplé que " + cityComp.getCityName() + ".";
		else if (this.cityNbInhabitants < cityComp.getCityNbInhabitants()) return cityComp.getCityName() + " est plus peuplé que " + this.cityName + ".";
		else return this.cityName + " et " + cityComp.getCityName() + " ont le même nombre d'habitants.";
	}
	
	
	// Polymorphisme d'une méthode Object (définie pour tout objet Java), ici toString();
	public String toString(){
		return "Je suis la ville de " + this.cityCountry + " appelée " + this.cityName + ". J'ai " + this.cityNbInhabitants + " habitants, donc de catégorie " + this.cityNbInhabitantsCat +".";
	}

	// 2 méthodes très souvent redéfinie : hashCode() et equals()
	// Ici hashCode2 qui est une version redéfinit complètement par dev...
	public int hashCode2() {
		//On définit un multiplication impair, de préférence un nombre premier
		//Ceci afin de garantir l'unicité du résultat final
		final int prime = 31;
		int result = 1;
		result = prime * result + cityNbInhabitantsCat;
		result = prime * result + cityNbInhabitants;
		result = prime * result + ((cityCountry == null) ? 0 : cityCountry.hashCode());
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		return result;
	}


	// Redéfinition avec la classe Objects
	public int hashCode() {
		return Objects.hash(this.cityNbInhabitantsCat, this.cityNbInhabitants, this.cityCountry, this.cityName);
	}

	
	public boolean equals2(Object obj) {
		// Vérification de base : les références d'objets sont identique
		if(this == obj) return true;
		// Vérification de base : l'objet à comparer n'est pas null
		if (obj == null) return false;
		// Vérification de base : les objets sont du même type... Voir dans les prochains chapitres
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
	
	// Redéfinition avec la classe Objects
	public boolean equals(Object obj) {
		
		// Vérification de base : les références d'objets sont identique
		if(this == obj) return true;
		// Vérification de base : l'objet à comparer n'est pas null
		if (obj == null) return false;
		// Vérification de base : les objets sont du même type... Voir dans les prochains chapitres
		if(this.getClass() != obj.getClass()) return false;
		
		City C = (City) obj;
		
		return
			   Objects.equals(C.getCityNbInhabitantsCat(), this.cityNbInhabitantsCat)
			&& Objects.equals(C.getCityNbInhabitants(), this.cityNbInhabitants)
			&& Objects.equals(C.getCityName(), this.cityName)
			&& Objects.equals(C.getCityCountry(), this.cityCountry);
		
	}

}

// Déclaration d'une sousclasse de City (on dit que City est la superclasse de Capital)
class Capital extends City {
	
	protected String monument;
	
	public Capital() {
		// Ce qui suit n'est possible que si les variables d'instance de la classe mère
		// sont protected ou pubic (donc en général protected pour conserver l'encapsulation)
		// this.cityName = "Héhéhé";
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
	
	// Déclaration d'une fonction polymorphe : elle à la même squelette
	// que la méthode de la superclasse mais ne renvoit pas le même résultat (mais il a le même typage)
	public String cityDescription () {
		return super.cityDescription() + " Je suis la Capitale et j'ai un monument : " + this.monument;
	}
	
	// Polymorphisme d'une méthode Object (définie pour tout objet Java), ici toString();
	public String toString () {
		return super.toString() + " Je suis la Capitale et j'ai un monument : " + this.monument;
	}

	
}