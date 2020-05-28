package lista1;
import java.util.Scanner;
public class Exercicio6 {
    
    public static void main(String[] args) {
        Scanner marco = new Scanner(System.in);
        
        System.out.println("Digite o salario");     
        double salarioBase = marco.nextDouble();
        double gratificacao = salarioBase * 5/100;
        double sal = salarioBase + gratificacao;        
        double imposto = sal * 7/100;
        double salarioReceber = salarioBase + gratificacao - imposto; 
        
        System.out.println("Novo salaris: " + salarioReceber);
        
        marco.close();
    }
    
}
