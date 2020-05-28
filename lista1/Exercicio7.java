package lista1;
import java.util.Scanner; // importa��o que permite a inser��o de dados via teclado
public class Exercicio7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* indica��o de entrada do Scanner no m�todo principal para 
        inser��o de dados */
        
        /* Comando que exibir� uma mensagem solicitando ao usu�rio para entrar com um valor e declarado a 
        vari�vel que ir� receber esse valor logo em seguida */
        System.out.println("Digite o valor do deposito"); 
        double deposito = sc.nextDouble(); 
        
        System.out.println("Digite a taxa"); 
        double taxaJuros = sc.nextDouble();
        
        // C�lculos solicitados no exerc�cio
        double rendimento = deposito * taxaJuros/100;
        double valorTotal = deposito + rendimento;
        
        // Exibi��o dos valores calculados
        System.out.println("Valor do rendimento: " + rendimento);
        System.out.println("Valor do valorTotal: " + valorTotal);
            
        sc.close(); 
    }
    
}
