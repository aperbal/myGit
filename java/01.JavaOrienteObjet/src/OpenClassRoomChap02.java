// HERITAGE
// Une classe hérite d'une autre signifie qu'elle "étend" une classe mère
// Elle dispose des mêmes variables mais aussi de variables propres
// Elle dispose aussi des mêmes méthodes qui peuvent toutefois être adaptées (=> polymorphe)

// POLYMORPHISME
// 

public class OpenClassRoomChap02 {

	public static void main(String[] args) {
		
		Capital cap1 = new Capital();
		System.out.println(cap1.cityDescription());
	
		Capital cap2 = new Capital("Berlin","Allemagne",2408764,"Brandbourg");
		System.out.println(cap2.cityDescription());
		


	}

}
