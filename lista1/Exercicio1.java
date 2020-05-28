package lista1;
public class Exercicio1 {
    
    public static void main(String[]args) {
        
        float salario = 2500; // atribuição de um valor direto na variável 
        float novoSalario;
        float aumento;
        int percentual = 10;// atribuição de um valor direto na variável 
        
        // As 3 linhas a seguir devem ser comentadas para exibir as alterações feitas com métodos (Linha 17)
        aumento = salario * percentual / 100;
        novoSalario = salario + aumento;
        System.out.printf("O novo salário é: %.2f", novoSalario);
        
        
        // Linha 18 em diante. Edições referentes ao que foi solicitado após o Exercicio 8 - Lista1 
        aumento = calcularAumento(salario, percentual);
        novoSalario = calcularNovoSalario(salario, aumento);
        
        System.out.println("\nAumento: " + aumento + "\nNovo Salario: " + novoSalario);
    }
        
    public static float calcularAumento (float salario, int percentual) {
    	// O método irá retornar o cálculo descrito na linha abaixo
    	return salario * percentual / 100;
    }
   
    public static float calcularNovoSalario (float salario, float aumento) {
    	// O método irá retornar o cálculo descrito na linha abaixo
    	return salario + aumento;
    }
}