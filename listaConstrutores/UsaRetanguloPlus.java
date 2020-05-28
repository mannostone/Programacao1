package listaConstrutores;

public class UsaRetanguloPlus {
	public static void main (String [] args) {
			
	RetanguloPlus r1 = new RetanguloPlus();
 
	System.out.println("Base: " + r1.base + "\nAltura: " + r1.altura);
	System.out.println("Área do retângulo: " + (r1.base*r1.altura));
	System.out.println("Perímetro do retângulo: " + ((2 * r1.base) + (2 * r1.altura)));
	}
	
	
	
}
