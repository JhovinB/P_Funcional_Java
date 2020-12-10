package examples.foreach_removeif_sort;

import java.util.ArrayList;
import java.util.List;

public class ColeccionApp {
	
	private List<String> lista;
	
	public ColeccionApp() {
		lista = new ArrayList<>();
		lista.add("jbac");
		lista.add("bonifacio");
		lista.add("lozano");
	}
	//Recorrer la lista 
	public void usarForEach() {


		/*for (String e : lista) {
			System.out.println(e);
		}*/
		//lambda
		//lista.forEach(x->System.out.println(x));
		
		//ReferenciaMetodos
		lista.forEach(System.out::println);
	}
	//Remover un elemento de la lista
	public void usarRemoveIf() {
		lista.removeIf(x->x.equalsIgnoreCase("jbac"));
	}
	//Ordenar listan ascendente
	public void usarSort() {
		
		lista.sort((x,y)->x.compareTo(y));
		lista.forEach(System.out::println);
		
	}
	public static void main(String[] args) {
		
		ColeccionApp app= new ColeccionApp();
		//app.usarForEach();
		//app.usarRemoveIf();
		app.usarSort();
	}

}
