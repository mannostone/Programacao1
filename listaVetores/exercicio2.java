package listaVetores;

public class exercicio2 {
    public static void main (String [] args) {
        
    	// vetor criado e vari�veis inicializadas
        int [] dados = {1,4,9,16,25,36};
        
        // la�o que exibir� os valores descritos do vetor "dados" da linha 7
        for (int cont = 0; cont < dados.length; cont++)
           {
               System.out.println("O elemento do �ndice " + cont + " vale " + dados[cont]);
           }
     }
}
