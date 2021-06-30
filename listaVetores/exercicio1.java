package listaVetores;

public class exercicio1 {
    public static void main (String[] args) {
        
           // contador que serve para o la�o for da linha 20
           int cont;
           
           /* Aten��o! a forma de declarar o vetor � diferente do C++
           Os colchetes v�o antes do nome do vetor (array), e depois do sinal de igualdade informamos o tipo de dados que queremos guardar
           nesse vetor, seguido do tamanho dele (entre colchetes) */
           int [] dados = new int [6]; 
           
           // dados.length nada mais � que o nome do vetor seguido do tamanho dele, descrito por ".length"
           System.out.println("O n�mero de elementos do array dados �: " + dados.length);
           
           /* Aqui dizemos que o contador declarado na linha 7 est� em zero conforme a primeira posi��o do vetor
            "cont < dados.length" significa que enquanto o contador for menor que o tamanho total desse vetor 
            ele seguir� repetindo esse la�o for, deste modo todas as posi��es do vetor "dados" ser�o acessadas */
           for (cont = 0; cont < dados.length; cont++)
           {
        	   /* dados[cont] - "cont" � usado para acessar determinada posi��o dentro do vetor dados. 
        	   O EXERC�CIO 2 � UM EXEMPLO PR�TICO DESDE EXERCICIO! */
               System.out.println("O elemento do �ndice " + cont + " vale " + dados[cont]);
           }
    }
}

// 1- a) Todo vetor criado tem suas vari�veis inicializadas com "0"
// 1- b) O comando "length" nos d� o tamanho do vetor informado, como exemplificado na linha 14 e 15