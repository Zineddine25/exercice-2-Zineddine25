package exercice2B;

import java.util.ArrayList;
import java.util.Scanner;

public class utilisateur {

	public static void main(String[] args) {
			ArrayList<connectable> listeConnectables = new ArrayList<connectable>();
			System.out.println("saisir radio ou cafetiere");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
		
			while(!(input.isEmpty())) {
				 
				  try {
					listeConnectables.add(catFactory.createCategorie(Class.forName(input)));
				} catch (ClassNotFoundException e) {
 					e.printStackTrace();
				}
			 
				System.out.println("saisir radio ou cafetiere");
				sc = new Scanner(System.in);
				input =sc.nextLine();
			}
		//Affichage de la liste 
			for(int i=0;i<listeConnectables.size();i++) {
				System.out.println(listeConnectables.get(i).getClass().getName());
			}
	}

}
