package lista1;
import java.util.Scanner; //  Biblioteca respons�vel pela entrada de dados no programa
public class Exercicio5 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in); // Scanner "entrada" nome definido pelo usu�rio
       
       double salario, novoSalario, percentual, aumento;
       
       System.out.println("Digite o salario");       
       salario = entrada.nextDouble();
       
       System.out.println("Digite o percentual de aumento");
       percentual = entrada.nextDouble();
       
       novoSalario = salario * percentual/100;
       aumento = salario - (salario - novoSalario);
    
               
       System.out.println("Novo salário: " + (salario+novoSalario));
       System.out.println("Aumento: " + aumento);
       
        entrada.close(); // Finaliza��o da entrada de dados no programa
    }
    
}
