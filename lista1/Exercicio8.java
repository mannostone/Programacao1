package lista1;

// Importa��o da biblioteca respons�vel pela inser��o de valores no programa
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
    // Defini��o do nome "sc" (que pode ser qualquer nome) e a indica��o da entrada do Scanner no programa
      Scanner sc = new Scanner (System.in);
      
      //Indica��o de uma mensagem ao usu�rio seguida do comando para a entrada de dados via Teclado
      System.out.println("Digite o valor de f�brica"); 
      double precoFabrica = sc.nextDouble();
      
      System.out.println("Digite o percentual do distribuidor"); 
      double percentualDistribuidor = sc.nextDouble();
      
      System.out.println("Digite o percentual do imposto"); 
      double percentualImposto = sc.nextDouble();
      
      double lucroDistribuidor = precoFabrica * percentualDistribuidor/100;
      double valorImposto =   precoFabrica * percentualImposto / 100;
      double precoFinal = precoFabrica + lucroDistribuidor + valorImposto;
      
      
      System.out.println("Pre�o Final: " + precoFinal);  
      
      sc.close();
    }
    
}
