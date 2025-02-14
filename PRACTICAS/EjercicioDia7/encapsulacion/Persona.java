package encapsulacion;

public class Persona {
	
	private String nombre;
	private int edad;
	
	void saludo() {
		System.out.println("Hola mi nombre es Sara");
	}
	
	//getters y setters//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//constructores//
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	

}
