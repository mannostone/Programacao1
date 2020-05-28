package lista1;
public class Exercicio1 {
    
    public static void main(String[]args) {
        
        float salario = 2500; // atribui��o de um valor direto na vari�vel 
        float novoSalario;
        float aumento;
        int percentual = 10;// atribui��o de um valor direto na vari�vel 
        
        // As 3 linhas a seguir devem ser comentadas para exibir as altera��es feitas com m�todos (Linha 17)
        aumento = salario * percentual / 100;
        novoSalario = salario + aumento;
        System.out.printf("O novo sal�rio �: %.2f", novoSalario);
        
        
        // Linha 18 em diante. Edi��es referentes ao que foi solicitado ap�s o Exercicio 8 - Lista1 
        aumento = calcularAumento(salario, percentual);
        novoSalario = calcularNovoSalario(salario, aumento);
        
        System.out.println("\nAumento: " + aumento + "\nNovo Salario: " + novoSalario);
    }
        
    public static float calcularAumento (float salario, int percentual) {
    	// O m�todo ir� retornar o c�lculo descrito na linha abaixo
    	return salario * percentual / 100;
    }
   
    public static float calcularNovoSalario (float salario, float aumento) {
    	// O m�todo ir� retornar o c�lculo descrito na linha abaixo
    	return salario + aumento;
    }
}