// CLASSES ABSTRAITES
// Les classes abstraites ne peuvent �tre instanci�es
// Elles permettent de cr�er des superclasses g�n�riques
// Leurs sousclasses peuvent �tre instanci�es et sont les seules significatives
// d'une point de vue "foncitonnel"


// INTERFACE
// Les interfaces permettent de continuer de d�velopper la g�n�ricit�
// ainsi que l'interop�rabilit� des objets
// Une interface en 100% abstraite :
// elle ne peut �tre instanci�e // toutes ces m�thodes et variables sont abstraites
// et cela m�me si nous n'utilisons pas le mot cl� "abstract"
// Une interface est une classe 100 % abstraite.
// EN RESUME :
//		Aucune m�thode d'une interface n'a de corps.
//		Une interface sert � d�finir un supertype et � utiliser le polymorphisme.
//		Une interface s'impl�mente dans une classe en utilisant le mot cl� implements.
//		Vous pouvez impl�menter autant d'interfaces que vous voulez dans vos classes.
// 		Vous devez red�finir toutes les m�thodes de l'interface (ou des interfaces) dans votre classe.
//		Le pattern strategy vous permet de rendre une hi�rarchie de classes plus souple.
//		Pr�f�rez encapsuler des comportements plut�t que de les mettre d'office dans l'objet concern�.



import com.oc.test.*;
import com.oc.rpg.*;

public class OpenClassRoomChap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------------------");
		System.out.println("Utilisation des classes qui �tendent Animal");
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
		System.out.println("Voici un Chien qui impl�mente l'interface Rintintin");
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
		System.out.println("---- Guerrier 'Thor' : Compotenemt par d�faut : ");
		Warrior w1 = new Warrior();
		w1.setCharacterName("Thor");
		System.out.println(w1.toString());
		w1.Move();
		w1.Fight();
		System.out.println("----------------------------------------------------");
		System.out.println("---- Et si on apprend � Thor � marcher : ");
		w1.LearnMovingStyle(new Walk());
		w1.Move();
		System.out.println("----------------------------------------------------");
		System.out.println("---- Et si Thor joue maintenant de la rocket : ");
		w1.LearnFightingStyle(new RocketFight());
		w1.Fight();
		
		System.out.println("----------------------------------------------------");
		System.out.println("---- Doc sana nom : Compotenemt par d�faut : ");
		Doctor d1 = new Doctor();
		System.out.println(d1.toString());
		d1.Move();
		d1.Fight();
		System.out.println("---- On apprend au Doctor � Courrir : ");
		System.out.println("----------------------------------------------------");
		d1.LearnMovingStyle(new Run());
		d1.Move();
		d1.Fight();
		System.out.println("---- Le doc se sert � pr�sent d'un couteau : ");
		System.out.println("----------------------------------------------------");
		d1.LearnFightingStyle(new KnifeFight());
		d1.Fight();
		

	}

}
