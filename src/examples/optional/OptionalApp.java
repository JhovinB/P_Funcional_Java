package examples.optional;

import java.util.Optional;

public class OptionalApp {
	
	public void test(String valor){
		//System.out.println(valor.contains("jbac"));
		try {
			Optional<Object> op = Optional.empty();
			op.get();
		}catch(Exception e) {
			System.out.println("No hay elemento");
		}
	}
	
	public void orElse(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("predeterminado");
		System.out.println(x);
	}
	
	public void orElseThrow(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		op.orElseThrow(NumberFormatException::new);
	}
	//Verificar si el valor a sido inicializado o no
	public void isPresent(String valor) {
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}
	public static void main(String[] args) {
		
		OptionalApp app = new OptionalApp();
		//app.test("jbac");
		//app.orElse(null);
		//app.orElseThrow("jbac");
		app.isPresent("jbac");
	}

}
