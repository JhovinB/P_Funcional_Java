package examples.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {
	
	private List<String> lista;
	private List<String> numero;
	public StreamApp() {
		lista = new ArrayList<>();
		lista.add("jbac");
		lista.add("bonifacio");
		lista.add("lozano");
		lista.add("jhovin");
		
		numero = new ArrayList<>();
		numero.add("1");
		numero.add("2");
	}
	
	public void filtrar() {
		
		lista.stream().filter(x->x.startsWith("j"))
					.forEach(System.out::println);;
	}
	public void ordenar() {
		//Ordenar de forma ascendente
		//lista.stream().sorted().forEach(System.out::println);
		//Ordenar de formar inversa
		lista.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
	}
	public void transformar() {
		//map->elemento de transformacion
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
		numero.stream().map(x->Integer.parseInt(x)+1).forEach(System.out::println);
	}
	public void limitar() {
		
		lista.stream().limit(2).forEach(System.out::println);
	}
	public void contar() {
		
		long x =lista.stream().count();
		System.out.println(x);
	}
	public static void main(String[] args) {
		StreamApp app = new StreamApp();
		//app.filtrar();
		// app.ordenar();
		//app.transformar();
		//app.limitar();
		app.contar();
	
	}
	

}
