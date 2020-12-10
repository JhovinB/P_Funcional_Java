package examples.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaApp {
	
	public void order() {
		List<String> list = new ArrayList<>();
		list.add("Jhovin");
		list.add("Lozano");
		list.add("Bonifacio");
		
		/*Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		
		});*/
		
		Collections.sort(list,(String p1,String p2)->p1.compareTo(p2));
		for (String elem : list) {
			System.out.println(elem);
		}
	}
	
	public void calculate() {
		/*Operacion op = new Operacion() {
			
			@Override
			public double calculateOperation(double n1, double n2) {
				return (n1+n2)/2;
			}
		};
		
		System.out.println(op.calculateOperation(20, 10));
		*/
		Operacion op = (double x , double y)->(x+y)/2;
		System.out.println(op.calculateOperation(20, 30));
				
	}
	public static void main(String[] args) {
		
		LambdaApp l = new LambdaApp();
		l.calculate();
	}
}
