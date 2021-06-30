package listaVetores;

public class exercicio1 {
    public static void main (String[] args) {
        
           // contador que serve para o laço for da linha 20
           int cont;
           
           /* Atenção! a forma de declarar o vetor é diferente do C++
           Os colchetes vão antes do nome do vetor (array), e depois do sinal de igualdade informamos o tipo de dados que queremos guardar
           nesse vetor, seguido do tamanho dele (entre colchetes) */
           int [] dados = new int [6]; 
           
           // dados.length nada mais é que o nome do vetor seguido do tamanho dele, descrito por ".length"
           System.out.println("O número de elementos do array dados é: " + dados.length);
           
           /* Aqui dizemos que o contador declarado na linha 7 está em zero conforme a primeira posição do vetor
            "cont < dados.length" significa que enquanto o contador for menor que o tamanho total desse vetor 
            ele seguirá repetindo esse laço for, deste modo todas as posições do vetor "dados" serão acessadas */
           for (cont = 0; cont < dados.length; cont++)
           {
        	   /* dados[cont] - "cont" é usado para acessar determinada posição dentro do vetor dados. 
        	   O EXERCÍCIO 2 É UM EXEMPLO PRÁTICO DESDE EXERCICIO! */
               System.out.println("O elemento do índice " + cont + " vale " + dados[cont]);
           }
    }
}

// 1- a) Todo vetor criado tem suas variáveis inicializadas com "0"
// 1- b) O comando "length" nos dá o tamanho do vetor informado, como exemplificado na linha 14 e 15