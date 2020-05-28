package listaConstrutores;
import java.util.Scanner;
public class UsaRetangulo {
	
	// Este exercício pode ser feito usando um vetor de Objetos, veja -> desafioTeams<AppMotor
    
    public static void main (String [] args) {
        
    	// Novo Objeto referente a Classe Retangulo criado
        Retangulo R1 = new Retangulo();
        
        // Exibição dos valores iniciais do objeto R1
        System.out.println("Base: " + R1.base + "\nAltura: " + R1.altura); 
        
        // Entrada de dados via Scanner
        Scanner sc = new Scanner (System.in); 
        
        // Atribuição de instâncias no Objeto R1
        System.out.println("\nDigite um valor para base e outro para altura: ");
        R1.base = sc.nextInt();
        R1.altura = sc.nextInt();
        
        // Criação e atribuição de instâncias no Objeto R2
        Retangulo R2 = new Retangulo();
        System.out.println("Digite um valor para base e outro para altura: ");
        R2.base = sc.nextInt();
        R2.altura = sc.nextInt();
        
        // Criação e atribuição de instâncias no Objeto R3
        Retangulo R3 = new Retangulo();
        System.out.println("Digite um valor para base e outro para altura: ");
        R3.base = sc.nextInt();
        R3.altura = sc.nextInt();
        
        // Término da entrada de dados via Scanner
        sc.close();
        
        // Valores atribuídos a cada um dos objetos
        System.out.println("Primeiro Objeto:\nBase: " + R1.base + "\nAltura: " + R1.altura);
        System.out.println("Segundo Objeto:\nBase: " + R2.base + "\nAltura: " + R2.altura);
        System.out.println("Terceiro Objeto:\nBase: " + R3.base + "\nAltura: " + R3.altura);
    }
}
