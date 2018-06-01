
public class OpenClassRoomChap06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i = 20 , j = 0;	
	System.out.println("Résultat de la division "+i+"/"+j+" :\n");			
		try {
			System.out.println(i/j);			
		}
		catch (ArithmeticException e) {
			System.out.println("Division par 0 impossible...\nJava nous dit : '"+e.getMessage()+"'\n");
		}
		finally {
			System.out.println("Echec de la division de "+i+" par "+j+".\n");
		}
	System.out.println("Mais le programme continue :) !");
	}

}
