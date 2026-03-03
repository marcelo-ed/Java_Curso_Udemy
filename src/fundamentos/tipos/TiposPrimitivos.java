package fundamentos.tipos;

public class TiposPrimitivos {
//	ATENÇÃO: Criei um objeto da própria classe dentro do main para acessar os atributos de instância, já que o método main é estático.
//	Funcionário fictício
	
//	Tipos numéricos inteiros
	public byte anosDeEmpresa = 12;
	public short clientesAtendidos = 1021;
	public int id = 73963;
	public long pontosAcumulados = 5_325_677_520L;
	
//	Tipos numéricos reais
	public float salario = 37_121.99F;
	public double dinheiroMovimentado = 6_153_543_123.12;
	
//	Tipo booleano
	public boolean estaDeFerias = false;
	
//	Tipo caractere
	public char status = 'A';
	

	public static void main(String[] args) {

		TiposPrimitivos tp = new TiposPrimitivos();
		
//		Dias de empresa
		System.out.println(tp.anosDeEmpresa * 365);
		
//		Pontos por real
		System.out.println(tp.pontosAcumulados / tp.dinheiroMovimentado);
		
//		Salário
		System.out.println(tp.id + " ganha: " + tp.salario);
		
//		Está de férias?
		System.out.println("Está de férias? " + tp.estaDeFerias);
		
//		Status
		System.out.println("Status: " + tp.status);
		
//		Média de dinheiro por venda
		System.out.println(tp.dinheiroMovimentado / tp.clientesAtendidos);
	}

 }
