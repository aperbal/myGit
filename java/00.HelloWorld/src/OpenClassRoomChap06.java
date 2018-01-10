import java.util.*;

public class OpenClassRoomChap06 {

	public static void main(String[] args) {
		
		char selectMode = ' ';
		char selectContinue = 'O';
		double temp;
		double tempArrondi;
		
		Scanner scanMode = new Scanner(System.in);
		Scanner scanTemp = new Scanner(System.in);
		
		System.out.println("Convertisseur degré CELSUIS <> FARENHEIT");
		System.out.println("----------------------------------------");
		
		while (selectContinue == 'O')
		{
			while (selectMode != '1' && selectMode != '2')
			{				
				System.out.println("Choississez le mode de convertion :");
				System.out.println("1 - Degré Celsuis => Farenheit");
				System.out.println("2 - Degré Farenheit => Celsuis");

				selectMode = scanMode.nextLine().charAt(0);
				
				if (selectMode == '1' || selectMode == '2')
				{
					System.out.println("Saisissez la température à convertir (double) :");
					temp = scanTemp.nextDouble();
					scanTemp.nextLine();
					if (selectMode == '1')
					{
						tempArrondi = arrondi(temp * 9 / 5 + 32 ,1);
						System.out.println(temp + "°C vaut " + tempArrondi + "°F.");
					}
					else {
						tempArrondi = arrondi((temp - 32) * 5 / 9 ,1);
						System.out.println(temp + "°F vaut " + tempArrondi + "°C.");
					}
					
				}
				else
				{
					System.out.println("Veuillez saisir un entier parmis 1 et 2...\n");
				}
			}
			System.out.println("Voulez-vous faire une autre convertion ? (O/N)");
			selectContinue = scanMode.nextLine().charAt(0);
			selectMode = ' ';
		}
		System.out.println("Merci ! Au revoir...");		
		
	}
	
	public static double arrondi(double a, int b) {
		return (double) ((int) (a * Math.pow(10, b) + .5)) / Math.pow(10, b);
	}

}
