package examples.scope;

public class Scope {
	
	private static double attribute_1;
	private double attribute_2;
	
	public double testLocalVariable() {
		
		final double z = 3;
		/*Operacion op = new Operacion() {

			@Override
			public double calculateOperation(double n1, double n2) {
				return n1+n2+z;
			}
			
		};*/
		
		Operacion op = (x,y)->{
			return x+y+z;
		};
		return op.calculateOperation(1, 1);
	}
	
	public double testAttributesStaticVariable() {
		Operacion op = (x,y)->{
			attribute_1= x+y;
			attribute_2=attribute_1;
			return attribute_2;
		};
		
		return op.calculateOperation(8, 6);
	}
	public static void main(String[] args) {
		Scope s = new Scope();
		System.out.println(s.testAttributesStaticVariable());
	}

}
