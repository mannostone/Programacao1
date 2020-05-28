package Modificadores;

public class AppAcesso {

	public static void main(String[] args) {
		
		Acesso a1 = new Acesso();
		// para a inserção de valores via Scanner, ele deve ser colocado entre parenteses, no lugar de "123456789"
		a1.setCpf(123456789);
		
		// comando para exibir o valor contido em CPF
		System.out.println(a1.getCpf());
		
	
	}
}
