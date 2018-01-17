// HERITAGE
// Une classe h�rite d'une autre signifie qu'elle "�tend" une classe m�re
// Elle dispose des m�mes variables mais aussi de variables propres
// Elle dispose aussi des m�mes m�thodes qui peuvent toutefois �tre adapt�es (=> polymorphe)

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
