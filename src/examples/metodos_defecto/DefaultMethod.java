package examples.metodos_defecto;

public class DefaultMethod implements Persona, PersonaB{

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.hablar();
	}

	@Override
	public void caminar() {
		System.out.println("hola");
	}
	//Cual interface quiero implementar
	//para utilizar el metodo default
	@Override
	public void hablar() {
		PersonaB.super.hablar();
		//Podemos sobrescribir el otra vez el metodo
		System.out.println("Saludos de Java");
	}

}
