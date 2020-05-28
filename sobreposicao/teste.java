package sobreposicao;

// Exercicio 5
import java.util.Scanner;
public class teste {

	public static void main(String[] args) {
		// teste5A();
		// teste5B();
		// teste5C();
		 teste5D();
		// teste5E();
	}
	
	public static void teste5A() {
	// Administrativo
		Administrativo a = new Administrativo();
		a.setMatricula("2019007");
		a.setNome("Alguem");
		System.out.println(a.getNome());
		System.out.println(a.getMatricula() + "\n");
	
	// Técnico
		Tecnico t = new Tecnico ();
		t.setMatricula("2020014");
		t.setNome("Ninguém");
		System.out.println(t.getNome());
		System.out.println(t.getMatricula() + "\n");
		}
	
	public static void teste5B () {
		Cachorro c = new Cachorro ();
		System.out.println(c.late());
		Gato g = new Gato ();
		System.out.println(g.mia());
		
		System.out.println(c.caminha());
		System.out.println(g.caminha());
	}
	
	public static void teste5C () {
		// preguiça, pulei
	}
	
	public static void teste5D () {
		Scanner sc = new Scanner (System.in);
		int ingresso;
		Ingresso i = new Ingresso ();
		System.out.println("Digite [1] para ingresso normal e [2] para ingresso VIP");
		ingresso = sc.nextInt();
		if (ingresso == 1) {
			Normal iN = new Normal ();
			iN.ingressoNormal();
		}
		else if (ingresso == 2) {
			System.out.println("Digite [1] para Camarote inferior ou [2] para Camarote superior");
			ingresso = sc.nextInt();
			
			if (ingresso == 1) {
				CamaroteInferior cI = new CamaroteInferior();
				cI.ingressoVip();
				cI.localizacao();
			}
			
			else if (ingresso == 2) {
				CamaroteSuperior cS = new CamaroteSuperior();
				cS.ingressoVip();
			}
			
		}
		sc.close();
	}

	public static void teste5E () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite [1] para imóvel antigo ou [2] para imóvel novo");
		int imovel = sc.nextInt();
		
		if (imovel == 1) {
			Velho v = new Velho ();
			v.valorTotal();
		}
		
		else if (imovel == 2) {
			Novo n = new Novo();
			n.valorAdicional();
			n.valorTotal();
		}
	}
}
