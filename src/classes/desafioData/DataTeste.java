package classes.desafioData;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 1;
		d1.mes = 12;
		d1.ano = 2026;
		
		System.out.println(d1.dataCompleta());
	}
}
