package lista1;
public class Exercicio3 {
    public static void main(String[] args) {
        
        double deposito = 500;
        double taxaJuros = 3;
        double rendimento = deposito * taxaJuros/100;
        double valorTotal = deposito + rendimento;
        
        System.out.println("Valor do rendimento: " + rendimento);
        System.out.println("Valor do valorTotal: " + valorTotal);
        
    }
    
}
