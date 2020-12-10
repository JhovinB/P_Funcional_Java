package examples.referencia_metodos;

import java.util.Arrays;


public class MeRefApp {

	public static void main(String[] args) {
		MeRefApp app = new MeRefApp();
		app.referenciaConstructor();
		}
	public static void referenciaMetodoStatic() {
		System.out.println("Método Referido static");
	}
	public void operar() {
		/*Operacion op = ()->MeRefApp.referenciaMetodoStatic();
		op.saludar();*/
		//
		Operacion op = MeRefApp::referenciaMetodoStatic;
		op.saludar();
	}
	public void referenciaMetodoInstanciaObjetoArbitrario() {

		String [] name = {"jhovin","jbac","code"};
		//java jdk 1.7
		/*Arrays.sort(name , new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});*/
		//Lambda
		/*Arrays.sort(name ,(s1,s2)->s1.compareToIgnoreCase(s2));
		for (String a : name) {
			System.out.println(a);
		}*/
		//Referencia de Metodos
		Arrays.sort(name ,String::compareToIgnoreCase);
		System.out.println(Arrays.toString(name));
	}
	
	public void referenciaConstructor() {
		
		/*IPersona per = new IPersona() {

			@Override
			public Persona crear(int id, String nombre) {
				return new Persona(id,nombre);
			}
			
		};
		Persona p =per.crear(1, "jhovin");
		System.out.println(p.getId()+"."+p.getNombre().toUpperCase());*/
		//Lambda
		/*IPersona pe = (x,y)->(new Persona(x,y));
		Persona p = pe.crear(1, "jbac");
		System.out.println(p.getId()+"."+p.getNombre().toUpperCase());*/
		//Referencia de Métodos
		IPersona iper = Persona::new;
		Persona per1 =iper.crear(3, "lozano");
		System.out.println(per1.getId()+"."+per1.getNombre().toUpperCase());
	
	}
			

}
