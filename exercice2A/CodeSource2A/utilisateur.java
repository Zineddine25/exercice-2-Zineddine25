package exercice2A;

import java.util.ArrayList;
import java.util.Scanner;

public class utilisateur {

	public static void main(String[] args) {
			ArrayList<connectable> listeConnectables = new ArrayList<connectable>();
			System.out.println("saisir un entier, 1 pour \r\n" + 
					"connecter une radio, 2 pour une cafetière et 0 pour\r\n" + 
					" finir. ");
			Scanner sc = new Scanner(System.in);
			int x =sc.nextInt();
			while(x!=0) {
				if(x==1) {
					listeConnectables.add(new radio());
				}else if(x==2) {
					listeConnectables.add(new cafetiere());
				}
				System.out.println("saisir un entier, 1 pour \r\n" + 
						"connecter une radio, 2 pour une cafetière et 0 pour\r\n" + 
						" finir. ");
			  sc = new Scanner(System.in);
			  x =sc.nextInt();
			}
		
			for(int i=0;i<listeConnectables.size();i++) {
				System.out.println(listeConnectables.get(i).getClass().getName());
			}
	}

}
