package exercice2B;

public class catFactory {
	public static connectable createCategorie(Class type){
		connectable con=null;
		try {
			 con = (connectable) type.newInstance();
			 
		} catch (InstantiationException | IllegalAccessException e) {
 			e.printStackTrace();
		}
		return con;
			
		 
	}
}
