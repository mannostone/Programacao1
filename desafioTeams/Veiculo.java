package desafioTeams;

public class Veiculo

{  
	String nome;
    private float velocidade;
    
    // O incremento na variável privada "velocidade" só é feita chamando o método abaixo
    public void acelera() {
   
    if (velocidade <= 10)
    velocidade++; 
    }

    // O decremento na variável privada "velocidade" só é feita chamando o método abaixo
    void frea() {
    if (velocidade>0)
    velocidade--; 
    }
    
    // método que irá mostrar o valor atual da variável velocidade
    void mostraVelocidade() {
    System.out.println(velocidade);
    }

}