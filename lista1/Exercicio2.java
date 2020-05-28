package lista1;

public class Exercicio2 {

    public static void main(String[] args) {
        
    	// Atribuição de valores na declaração das variáveis
        double salarioBase = 1500;
        double gratificacao = 0; // salarioBase * 5/100; // para a exibição do exercicio1, troque 0 pelo calculo a esquerda
        double imposto = 0; // salarioBase * 7/100; // para a exibição do exercicio1, troque 0 pelo calculo a esquerda
        double salarioReceber = 0; // salarioBase + gratificacao - imposto; // para a exibição do exercicio1, troque 0 pelo calculo a esquerda
        
        // Esta linha deve ser comentada para a exibição das alterações utilizando os métodos
        // System.out.println("Novo salario: " + salarioReceber);
        
        gratificacao = calcularGratificacao(salarioBase);
        imposto = calcularImposto(salarioBase);
        salarioReceber = calcularSalarioReceber(salarioBase, gratificacao, imposto);
        
        // Para a exibição do primeiro exercicio sem a utilização dos métodos, essas 3 linhas devem ser comentadas
        System.out.println("Gratificação: " + gratificacao);
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
