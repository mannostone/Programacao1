package Modificadores;

public class Veiculo

{  
  String nome;
    private float velocidade;

    public void acelera() {
   
    if (velocidade<=10)
    velocidade++; 
    }

    void frea() {
    if (velocidade>0)
    velocidade--; 
    }

    void mostraVelocidade() {
    System.out.println(velocidade);
    }

}