package examples.interfaces_funcionales;


public class FuncInterApp {

	public static void main(String[] args) {
		
		FuncInterApp app= new FuncInterApp();
		double rpta = app.operar(20,10);
		System.out.println(rpta);
	}
	public double operar(double x ,double y) {
		Operation op = (n1,n2)->n1+n2;
		return op.calcular(x,y); 
	}

}
