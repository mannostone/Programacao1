package desafioTeams;
// Scanner para a inserção de valores via teclado
import java.util.Scanner;

public class AppMotor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); // Entrada do Scanner no Programa
		
		// Forma de criar um vetor de objetos de uma mesma classe.
		Motor [] motor = new Motor [3];
		
		for (int i = 0; i < motor.length; i++)
		{
		// "motor[i] = new Motor();" estou indicando o método Construtor o qual esse objeto faz referência
		// "[i]" é a posição do objeto no *Vetor de Objetos*, assim, o laço de repetição irá criar os objetos de acordo com o limite estipulado acima
		motor[i] = new Motor();
		
		System.out.println("Digite o nome do fabricante: ");
		motor[i].fabr = sc.next();
		
		System.out.println("Insira a voltagem: ");
		motor[i].voltagem = sc.nextInt();
		
		System.out.println("Digite o valor RPM: ");
		motor[i].setVelocidade(sc.nextInt()); // A inserção de dados privados em outra classe deve ser inserida da forma descrita nessa linha
		
		System.out.println("O motor está ligado? (S / N)");
		motor[i].motorStatus = sc.next();
		
		System.out.println(); // Quebra de linha
		}
		sc.close();
		
		for (int i = 0; i < motor.length; i++)
		{
		System.out.println((i+1) + "° motor inserido:");
		System.out.println("Valor da voltagem: " + motor[i].voltagem);
		System.out.println("Rotações por Minuto: " + motor[i].verificaVelocidade());
		System.out.println("Fabricante: " + motor[i].fabr);
		
		// condição montada para sinalizar qual método será mostrado (não é 100% certo de funcionar, foi a forma que encontrei para testar motorStatus)
		if (motor[i].motorStatus == "s" || motor[i].motorStatus == "S")
			{
				motor[i].liga();
			}
		else 
				motor[i].desliga();
		}
	}

}