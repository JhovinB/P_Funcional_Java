package examples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapApp {
	
	private Map<Integer,String> map;
	
	public MapApp() {
		map = new HashMap<>();
		map.put(1, "jbac");
		map.put(2, "lozano");
		map.put(3, "bonifacio");
		map.put(4, "jhovin");
	}
	public void imprimir_v8() {
		//Lambda
		//map.forEach((k,v)->System.out.println("Llave: "+k+" Valor: "+v));
		//entrySet->lista de valores q tiene el map
		//Stream
		map.entrySet().stream().forEach(System.out::println);
	}

	public void insertarSiAusente() {
		//putIfAbsent->Agregar un valor si no se encuentra
		map.putIfAbsent(5, "maho");
	}
	public void operarSiPresente() {
		map.computeIfPresent(3, (k,v)->k+v);
		System.out.println(map.get(3));
	}
	public void obtenerOrPredeterminado() {
		//getOrDefault->indicar valor por defecto
		String valor =map.getOrDefault(2,"valor por defecto");
		System.out.println(valor);
	}
	public void recolectar() {
		
		//Collect y collectors ->para convertir al tipo Map.
		//con toMap.
		Map<Integer,String> mapRecolectado= map.entrySet().stream()
								.filter(e->e.getValue().contains("j"))
								.collect(Collectors.toMap(p->p.getKey()
										,p->p.getValue()));
		mapRecolectado.forEach((k,v)->System.out.println("Llave: "+k+" Valor: "+v));
	}
	public static void main(String[] args) {
		MapApp app = new MapApp();
		//app.imprimir_v8();
		//app.insertarSiAusente();
		//app.imprimir_v8();
		//app.operarSiPresente();
		//app.obtenerOrPredeterminado();
		app.recolectar();
	}

}
