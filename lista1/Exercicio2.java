package lista1;

public class Exercicio2 {

    public static void main(String[] args) {
        
    	// Atribui��o de valores na declara��o das vari�veis
        double salarioBase = 1500;
        double gratificacao = 0; // salarioBase * 5/100; // para a exibi��o do exercicio1, troque 0 pelo calculo a esquerda
        double imposto = 0; // salarioBase * 7/100; // para a exibi��o do exercicio1, troque 0 pelo calculo a esquerda
        double salarioReceber = 0; // salarioBase + gratificacao - imposto; // para a exibi��o do exercicio1, troque 0 pelo calculo a esquerda
        
        // Esta linha deve ser comentada para a exibi��o das altera��es utilizando os m�todos
        // System.out.println("Novo salario: " + salarioReceber);
        
        gratificacao = calcularGratificacao(salarioBase);
        imposto = calcularImposto(salarioBase);
        salarioReceber = calcularSalarioReceber(salarioBase, gratificacao, imposto);
        
        // Para a exibi��o do primeiro exercicio sem a utiliza��o dos m�todos, essas 3 linhas devem ser comentadas
        System.out.println("Gratifica��o: " + gratificacao);
        System.out.println("Imposto: " + imposto);
        System.out.println("Salario a receber: " + salarioReceber);
    }
    
    public static double calcularGratificacao (double salarioBase){
    	return salarioBase * 5/100;
    }
    
    public static double calcularImposto (double salarioBase){
    	return  salarioBase * 7/100;
    }
    
    public static double calcularSalarioReceber (double salarioBase, double gratificacao, double imposto){
    	return salarioBase + gratificacao - imposto;
    }
    
}
