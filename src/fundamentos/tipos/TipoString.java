package fundamentos.tipos;

public class TipoString {

	public static void main(String[] args) {
		//Testando métodos
		System.out.println("Bom dia".charAt(0));
		
		String bd = "Bom dia";
		bd = bd.toUpperCase();
		System.out.println(bd.concat("!"));
		System.out.println(bd.toLowerCase().startsWith("bom"));
		System.out.println(bd.toLowerCase().endsWith("dia"));

		System.out.println(bd.equals("odjafsop"));
		System.out.println(bd.length());
		
		System.out.println("O");
		
		String nome = "Pedro";
		
		//Testando printf e import da classe TiposPrimitivos
		TiposPrimitivos t = new TiposPrimitivos();		
		System.out.printf("Nome: %s \nSalário: %f \nClientes atendidos: %d %nAnos na empresa: %d\n", 
				nome, t.salario, t.clientesAtendidos, t.anosDeEmpresa);
		
		String dados = String.format("Nome: %s \nSalário: %f \nClientes atendidos: %d %nAnos na empresa: %d", 
				nome, t.salario, t.clientesAtendidos, t.anosDeEmpresa);
		System.out.println(dados);
		
		
		String frase = "Seja bem-vindo";
		System.out.println(frase.indexOf("e"));
		System.out.println(frase.substring(2, 6));
		
	}
}
