package lista1;

// Importação da biblioteca responsável pela inserção de valores no programa
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
    // Definição do nome "sc" (que pode ser qualquer nome) e a indicação da entrada do Scanner no programa
      Scanner sc = new Scanner (System.in);
      
      //Indicação de uma mensagem ao usuário seguida do comando para a entrada de dados via Teclado
      System.out.println("Digite o valor de fábrica"); 
      double precoFabrica = sc.nextDouble();
      
      System.out.println("Digite o percentual do distribuidor"); 
      double percentualDistribuidor = sc.nextDouble();
      
      System.out.println("Digite o percentual do imposto"); 
      double percentualImposto = sc.nextDouble();
      
      double lucroDistribuidor = precoFabrica * percentualDistribuidor/100;
      double valorImposto =   precoFabrica * percentualImposto / 100;
      double precoFinal = precoFabrica + lucroDistribuidor + valorImposto;
      
      
      System.out.println("Preço Final: " + precoFinal);  
      
      sc.close();
    }
    
}
