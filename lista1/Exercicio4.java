package lista1;
public class Exercicio4 {
    public static void main(String[] args) {
        
        double precoFabrica = 35000, percentualDistribuidor = 25, percentualImposto = 15;
        double lucroDistribuidor = precoFabrica * percentualDistribuidor/100;
        double valorImposto =   precoFabrica * percentualImposto / 100;
        double precoFinal = precoFabrica + lucroDistribuidor + valorImposto;
                
        System.out.println("Preço Final: " + precoFinal);        
        
    }
    
}
