package fundamentos.conversoes;

public class ConversaoTiposNumericos {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a + "\n"); //Conversão implícita
		
		float b = 1.123123123123F; //Conversão explícita (CAST)
		System.out.println(b + "\n");
		
		int c = 340;
		byte d = (byte) c; //Conversão explícita (CAST)
		System.out.println(d + "\n");
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f + "\n");
	}
}
