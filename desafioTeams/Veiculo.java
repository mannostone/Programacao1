package desafioTeams;

public class Veiculo

{  
	String nome;
    private float velocidade;
    
    // O incremento na vari�vel privada "velocidade" s� � feita chamando o m�todo abaixo
    public void acelera() {
   
    if (velocidade <= 10)
    velocidade++; 
    }

    // O decremento na vari�vel privada "velocidade" s� � feita chamando o m�todo abaixo
    void frea() {
    if (velocidade>0)
    velocidade--; 
    }
    
    // m�todo que ir� mostrar o valor atual da vari�vel velocidade
    void mostraVelocidade() {
    System.out.println(velocidade);
    }

}