package lista2;

import java.util.Scanner; // Biblioteca responsável pela inserção de valores

public class exercicio3 {
	 public static void main (String [] args) {
	        Scanner sc = new Scanner (System.in); // Entrada do Scanner responsável pela inserção de valores
	        
	        // Variáveis declaradas 
	        double m, Kg; 
	        
	        // receberá a altura digitada
	        System.out.println("Digite a sua altura");
	        m = sc.nextDouble(); 
	        
	        // receberá o peso digitado
	        System.out.println("Digite o seu peso");
	        Kg = sc.nextDouble(); 
	        
	        // Término do Scanner responsável pela inserção de valores
	        sc.close();
	        
	        /* Nessa linha estou dizendo que o valor que irá retornar do método "obtemIMC" será armazenado na 
	        variável "imc". Atenção! Para atribuir um valor a variável é necessário que o método TENHA retorno, ou seja, não seja void. */
	        double imc = obtemIMC(m, Kg);
	        
	        /* Linha que está chamando o método da linha 41 que fará o comparativo e exibirá a mensagem de 
	        acordo com o comparativo "IMC" */
	        comparaIMC(imc);
	        
	        // Desconsidere essa linha, adicionei apenas para informar o valor calculado pelo "obtemIMC"
	        System.out.printf("%.2f", imc);
	        
	    }
	    
	    public static double obtemIMC (double m, double Kg) {
	        double a , p , IMC; // variáveis declaradas 
	        
	        // receberá altura
	        a = m; 
	        
	        // receberá peso
	        p = Kg; 
	        
	        // fará o calculo para obter o IMC
	        IMC = p / (a * a); 
	        
	        // O valor calculado irá retornar para a linha 25 e atribuido
	        return IMC; 
	    }
	    
	    public static void comparaIMC(double imc) { // Esse módulo tem como função exibir a mensagem de acordo com o armazenado em "imc"
	        
	        if ( imc <= 18.5) 
	            System.out.println("Você esta abaixo do peso normal");
	        
	        else if ( imc >= 18.5 && imc <= 25.0)
	            System.out.println("O seu peso esta na faixa da normalidade");
	        
	        else if ( imc >= 25.0 && imc <= 30.0)
	            System.out.println("Você esta acima do peso normal");
	        
	        else 
	            System.out.println("Você esta acima do peso");
	    }
	}