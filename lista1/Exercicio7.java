package lista1;
import java.util.Scanner; // importação que permite a inserção de dados via teclado
public class Exercicio7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* indicação de entrada do Scanner no método principal para 
        inserção de dados */
        
        /* Comando que exibirá uma mensagem solicitando ao usuário para entrar com um valor e declarado a 
        variável que irá receber esse valor logo em seguida */
        System.out.println("Digite o valor do deposito"); 
        double deposito = sc.nextDouble(); 
        
        System.out.println("Digite a taxa"); 
        double taxaJuros = sc.nextDouble();
        
        // Cálculos solicitados no exercício
        double rendimento = deposito * taxaJuros/100;
        double valorTotal = deposito + rendimento;
        
        // Exibição dos valores calculados
        System.out.println("Valor do rendimento: " + rendimento);
        System.out.println("Valor do valorTotal: " + valorTotal);
            
        sc.close(); 
    }
    
}
