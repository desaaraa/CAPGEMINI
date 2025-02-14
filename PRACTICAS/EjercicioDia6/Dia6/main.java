package Dia6;

public class main {

	public static void main(String[] args) {

		Persona persona = new Persona();
		persona.edad=21;
		persona.nombre= "Sara";
		
		System.out.println("Mi nombre es "+ persona.nombre + " y tengo " + persona.edad + " anios");
		
		persona.saludo();
	}

}
