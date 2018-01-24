// CLASSES ABSTRAITES
// Les classes abstraites ne peuvent être instanciées
// Elles permettent de créer des superclasses génériques
// Leurs sousclasses peuvent être instanciées et sont les seules significatives
// d'une point de vue "foncitonnel"


// INTERFACE

import com.oc.test.*;

public class OpenClassRoomChap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loup l1 = new Loup("Croc Blanc", "blanc", 67);
		Object c1 = new Chien("Rudy", "brown", 23);
		
		System.out.println(((Chien)c1).toString());
		System.out.println(l1.toString());
		
		l1.eat();
		((Chien)c1).eat();
		
		l1.drink();
		((Chien)c1).drink();
		
		System.out.println(((Chien)c1).shout());
		System.out.println(l1.shout());
		
		System.out.println(((Chien)c1).move("the store"));
		System.out.println(l1.move("the forest"));
		
	}

}
