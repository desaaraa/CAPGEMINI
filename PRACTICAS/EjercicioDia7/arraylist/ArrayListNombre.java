package arraylist;

import java.util.ArrayList;

public class ArrayListNombre {

	public static void main(String[] args) {

		ArrayList <String> nombres= new ArrayList<>();
		
		nombres.add("Sara");
		nombres.add("Marta");
		nombres.add("Wanda");
		
		for (String i:nombres) {
			System.out.println(i);
		}


		
	}

}
