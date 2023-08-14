package classe;

public class AreaCircMain {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(5.6);
		AreaCirc a2 = new AreaCirc(5.6);
//		AreaCirc.PI = 3.1415;  erro não pode mudar variável final 
		
		System.out.println(AreaCirc.area(5.6)); // método static 
		System.out.println(a1.area());
		System.out.println(a2.area());
	}
}
