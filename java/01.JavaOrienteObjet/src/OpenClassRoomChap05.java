// CLASSES ABSTRAITES
// Les classes abstraites ne peuvent être instanciées
// Elles permettent de créer des superclasses génériques
// Leurs sousclasses peuvent être instanciées et sont les seules significatives
// d'une point de vue "foncitonnel"


// INTERFACE
// Les interfaces permettent de continuer de développer la généricité
// ainsi que l'interopérabilité des objets
// Une interface en 100% abstraite :
// elle ne peut être instanciée // toutes ces méthodes et variables sont abstraites
// et cela même si nous n'utilisons pas le mot clé "abstract"
// Une interface est une classe 100 % abstraite.
// EN RESUME :
//		Aucune méthode d'une interface n'a de corps.
//		Une interface sert à définir un supertype et à utiliser le polymorphisme.
//		Une interface s'implémente dans une classe en utilisant le mot clé implements.
//		Vous pouvez implémenter autant d'interfaces que vous voulez dans vos classes.
// 		Vous devez redéfinir toutes les méthodes de l'interface (ou des interfaces) dans votre classe.
//		Le pattern strategy vous permet de rendre une hiérarchie de classes plus souple.
//		Préférez encapsuler des comportements plutôt que de les mettre d'office dans l'objet concerné.



import com.oc.test.*;
import com.oc.rpg.*;

public class OpenClassRoomChap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------");
		System.out.println("Utilisation des classes qui étendent Animal");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
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
		
		System.out.println("----------------------------------------------------");
		System.out.println("Utilisation de l'interface " + ((Chien)c1).getClass());
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		
		((Chien)c1).sitUpAndBeg();
		((Chien)c1).hug();
		((Chien)c1).lick();
		
		System.out.println("----------------------------------------------------");
		System.out.println("Voici un Chien qui implémente l'interface Rintintin");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		Rintintin r1 = new Chien("Rintintin", "brun", 34);
		r1.sitUpAndBeg();
		r1.hug();
		r1.lick();

		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println(" Utilisation du Pakage RPG");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");
		System.out.println("----------------------------------------------------");

		System.out.println("----------------------------------------------------");
		System.out.println("---- Guerrier 'Thor' : Compotenemt par défaut : ");
		Warrior w1 = new Warrior();
		w1.setCharacterName("Thor");
		System.out.println(w1.toString());
		w1.Move();
		w1.Fight();
		System.out.println("----------------------------------------------------");
		System.out.println("---- Et si on apprend à Thor à marcher : ");
		w1.LearnMovingStyle(new Walk());
		w1.Move();
		System.out.println("----------------------------------------------------");
		System.out.println("---- Et si Thor joue maintenant de la rocket : ");
		w1.LearnFightingStyle(new RocketFight());
		w1.Fight();
		
		System.out.println("----------------------------------------------------");
		System.out.println("---- Doc sana nom : Compotenemt par défaut : ");
		Doctor d1 = new Doctor();
		System.out.println(d1.toString());
		d1.Move();
		d1.Fight();
		System.out.println("---- On apprend au Doctor à Courrir : ");
		System.out.println("----------------------------------------------------");
		d1.LearnMovingStyle(new Run());
		d1.Move();
		d1.Fight();
		System.out.println("---- Le doc se sert à présent d'un couteau : ");
		System.out.println("----------------------------------------------------");
		d1.LearnFightingStyle(new KnifeFight());
		d1.Fight();
		

	}

}
