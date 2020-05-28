package Orientacao;

import java.util.Scanner; // Biblioteca responsável pela entrada de dados

// CLASSE EXTRA PARA TESTAR AS OUTRAS CLASSES

public class AppListaOrientacao {

    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in); // Entrada do Scanner no sistema
         
    	// Classe chamada / nome do objeto criado / novo Objeto
        NewRetangulo R1 = new NewRetangulo(); 
        
        // Próximo valor digitado será atribuido a "base" do novo objeto
        R1.base = sc.nextInt(); 
        
        // Próximo valor digitado será atribuido a "altura" do novo objeto
        R1.altura = sc.nextInt(); 
        
        // Término da entrada de dados via Scanner
        sc.close(); 
        
        System.out.println("Base: " + R1.base + "\nAltura: " + R1.altura);
        
        // Os valores atribuidos ao objeto criado serão calculados pelo método "exibeArea()" e exibido na tela
        R1.exibeArea(); 
        
        // Os valores atribuidos ao objeto criado serão calculados pelo método "exibePerimetro()" e exibido na tela
        R1.exibePerimetro(); 
        
    	
    	
    }
    
}
