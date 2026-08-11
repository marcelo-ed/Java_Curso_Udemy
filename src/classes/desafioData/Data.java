package classes.desafioData;

public class Data {
	// Atributos com valores padrão
	public int dia = 1;
	public int mes = 1;
	public int ano = 1970;
	
	// Construtor padrão explícito
	public Data() {
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String dataCompleta() {
		String data = String.format("%d/%d/%d", dia, mes, ano);
		return data;
	}
}
