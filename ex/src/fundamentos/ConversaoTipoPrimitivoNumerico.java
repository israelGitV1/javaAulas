package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1.455555555555555555555; // implícita
		System.out.println(a);
		
		float b=(float) 1.11555555555555555555;// explícita (CAST)
		System.out.println(b);
		
		int c =129;
		byte d =(byte)c;// explícita (CAST)
		System.out.println(d);
		
		double e = 1;  // implícita
		int f =(int) e;// explícita (CAST)
		System.out.println(f);
		
	}
}
