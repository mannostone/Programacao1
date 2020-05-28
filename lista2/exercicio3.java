package lista2;

import java.util.Scanner; // Biblioteca respons�vel pela inser��o de valores

public class exercicio3 {
	 public static void main (String [] args) {
	        Scanner sc = new Scanner (System.in); // Entrada do Scanner respons�vel pela inser��o de valores
	        
	        // Vari�veis declaradas 
	        double m, Kg; 
	        
	        // receber� a altura digitada
	        System.out.println("Digite a sua altura");
	        m = sc.nextDouble(); 
	        
	        // receber� o peso digitado
	        System.out.println("Digite o seu peso");
	        Kg = sc.nextDouble(); 
	        
	        // T�rmino do Scanner respons�vel pela inser��o de valores
	        sc.close();
	        
	        /* Nessa linha estou dizendo que o valor que ir� retornar do m�todo "obtemIMC" ser� armazenado na 
	        vari�vel "imc". Aten��o! Para atribuir um valor a vari�vel � necess�rio que o m�todo TENHA retorno, ou seja, n�o seja void. */
	        double imc = obtemIMC(m, Kg);
	        
	        /* Linha que est� chamando o m�todo da linha 41 que far� o comparativo e exibir� a mensagem de 
	        acordo com o comparativo "IMC" */
	        comparaIMC(imc);
	        
	        // Desconsidere essa linha, adicionei apenas para informar o valor calculado pelo "obtemIMC"
	        System.out.printf("%.2f", imc);
	        
	    }
	    
	    public static double obtemIMC (double m, double Kg) {
	        double a , p , IMC; // vari�veis declaradas 
	        
	        // receber� altura
	        a = m; 
	        
	        // receber� peso
	        p = Kg; 
	        
	        // far� o calculo para obter o IMC
	        IMC = p / (a * a); 
	        
	        // O valor calculado ir� retornar para a linha 25 e atribuido
	        return IMC; 
	    }
	    
	    public static void comparaIMC(double imc) { // Esse m�dulo tem como fun��o exibir a mensagem de acordo com o armazenado em "imc"
	        
	        if ( imc <= 18.5) 
	            System.out.println("Voc� esta abaixo do peso normal");
	        
	        else if ( imc >= 18.5 && imc <= 25.0)
	            System.out.println("O seu peso esta na faixa da normalidade");
	        
	        else if ( imc >= 25.0 && imc <= 30.0)
	            System.out.println("Voc� esta acima do peso normal");
	        
	        else 
	            System.out.println("Voc� esta acima do peso");
	    }
	}