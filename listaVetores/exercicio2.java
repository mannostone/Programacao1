package listaVetores;

public class exercicio2 {
    public static void main (String [] args) {
        
    	// vetor criado e variáveis inicializadas
        int [] dados = {1,4,9,16,25,36};
        
        // laço que exibirá os valores descritos do vetor "dados" da linha 7
        for (int cont = 0; cont < dados.length; cont++)
           {
               System.out.println("O elemento do índice " + cont + " vale " + dados[cont]);
           }
     }
}
