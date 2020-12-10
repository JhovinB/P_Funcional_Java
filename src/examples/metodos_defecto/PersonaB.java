package examples.metodos_defecto;

public interface PersonaB {
	
	default public void hablar() {
		System.out.println("saludos B");
	}
}
