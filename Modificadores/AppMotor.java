package Modificadores;

import java.util.Scanner;

public class AppMotor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Forma de declarar um vetor de objetos!!!
		Motor [] motor = new Motor [3];
		
		for (int i = 0; i < motor.length; i++)
		{
		motor[i] = new Motor();
		
		System.out.println("Insira a voltagem: ");
		motor[i].voltagem = sc.nextInt();
		
		System.out.println("Digite o valor RPM: ");
		motor[i].setVelocidade(sc.nextInt());
		
		System.out.println("Digite o nome do fabricante: ");
		motor[i].fabr = sc.next();
		System.out.println(); // Quebra de linha
		}
		sc.close();
		
		for (int i = 0; i < motor.length; i++)
		{
		System.out.println((i) + "° motor inserido:");
		System.out.println("Valor da voltagem: " + motor[i].voltagem);
		System.out.println("Rotações por Minuto: " + motor[i].verificaVelocidade());
		System.out.println("Fabricante: " + motor[i].fabr + "\n");
		}
	}

}