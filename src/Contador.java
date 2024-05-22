import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		int parametroUm;
		int parametroDois;
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		parametroUm = terminal.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
		terminal.close();
		
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		int contagem;
		 
		// o segundo parâmetro não poderá ser maior e nem igual ao primeiro para realizar a contagem
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException();
		}

		contagem = parametroDois - parametroUm;
		
		System.out.println("\n" + "Contando do " + parametroUm + " ao " + parametroDois + ":");
		
		for (int x = 0; contagem >= x; x++) {
			
			System.out.println(parametroUm + x);
			
		}
		
	}

}
