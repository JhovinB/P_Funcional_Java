package examples.sintaxis;

public class Sintaxis {
	
	public double test() {
		Operacion op = (double x,double y)->{
			
			return (x+y)/2;
		};
		 double a =op.calculateOperation(20,10);
		 System.out.println(a);
		 return a;
	}

	public double test1() {
		Operacion op = (x,y)->(x+y)/2;
		double t = op.calculateOperation(12, 12);
		System.out.println(t);
		return t;
	}
	public static void main(String[] args) {
		
		Sintaxis s = new Sintaxis();
		s.test1();
	}

}
