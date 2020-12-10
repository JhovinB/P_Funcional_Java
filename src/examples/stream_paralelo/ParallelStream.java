package examples.stream_paralelo;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	private List<Integer> numeros;
	
	public ParallelStream() {
		numeros = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numeros.add(i);
		}
	}
	
	public void probarStream() {
		
		numeros.stream().forEach(System.out::println);
	}
	//Crea un procedimiento asincrono con hilos
	//No utilizar en JAVAEE
	//Puede mejorar el rendimiento - pero no utilizar mucho
	public void probarParalelo() {
		numeros.parallelStream().forEach(System.out::println);

	}
	public static void main(String[] args) {
		
		ParallelStream app = new ParallelStream();
		//app.probarStream();
		app.probarParalelo();
	}

}
