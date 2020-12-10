package examples.metodos_defecto;

public interface Persona {

	public void caminar();
	
	//metodo por defecto
	default public void hablar() {
		System.out.println("Saludos");
	}
}
