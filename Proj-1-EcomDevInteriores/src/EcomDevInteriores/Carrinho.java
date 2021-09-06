package EcomDevInteriores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Carrinho {

	// vetores

	static double valor[] = { 119.99, 799.99, 109.99, 380.99, 539.99, 649.99, 850.99, 999.99, 220.99, 950.99 };
	static double carrinho[] = { 0, 2, 0, 0, 0, 0, 0, 0, 0, 0 };
	static double estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	double valorTotal = 0.0, valorFinal = 0.0, valorImposto = 0.0, imposto = 0.00, juros = 0.0, taxaCartao = 0.0;
	int tipoPagamento = 1;
	static String produtosNome[] = { "Luminária de mesa", "Poltrona", "Abajur", "Estante", "Escrivaninha",
			"Cadeira de Escritório", "Cama", "Cadeira Gamer", "Mesa de centro", "Sofá" };
	static String codigo[] = { "G5-1", "G5-2", "G5-3", "G5-4", "G5-5", "G5-6", "G5-7", "G5-8", "G5-9", "G5-10" };

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		menuCarrinho();

	}

	public static void itensNoCarrinho(double carrinho[]) {
		System.out.println("CARRINHO DE COMPRAS\n");
		System.out.print("Item                    Un      VlrUn      VlrTotal\n");
		for (int i = 0; i < 10; i++) {
			if (carrinho[i] != 0) {
				System.out.print(produtosNome[i]);
				System.out.print(carrinho[i] + "       " + valor[i] + "      " + (valor[i] * carrinho[i]) + "\n");
				System.out.println("\n");
			}
		}
	}

	public static void menuCarrinho() {
		Scanner leia = new Scanner(System.in);

		int codigoLer = 1, quantidade = 0, localVetor=0;
		String codigoCompleto = "";

		while (codigoLer != (-1)) {
			int v = 1;
			// menu()
			System.out.print("\n");
			itensNoCarrinho(carrinho);
			System.out.print("Digite o código do produto a ser adicionado ao carrinho" + "\n"
					+ "ou aperte '0' para encerrar compra: ");
			codigoCompleto = leia.next();
			
			do {
				for (int x = 0; x < 10; x++) {
					
					if (codigoCompleto.intern() == codigo[x] || codigoCompleto.intern()=="0") {
						localVetor=x;
						v = 0;
					}
				}
				if (v != 0) {
					System.out.print("Código Incorreto\n");
					System.out.print("Digite o código do produto a ser adicionado ao carrinho" + "\n"
							+ "ou aperte '0' para encerrar compra: ");
					codigoCompleto = leia.next();
				}
			} while (v != 0);


			// System.out.print(codigoCompleto+"\n");
			codigoLer = localVetor;
			// System.out.print(codigoLer);

			if (codigoCompleto.intern()=="0") {
				break;

			} else if (codigoLer != -1 && estoque[codigoLer] <= 10) {
				System.out.println("Qual a quantidade?: ");
				try {
				quantidade = leia.nextInt();
				}catch (InputMismatchException erro1) {
			        System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
			        leia.nextLine();
				}
				while(quantidade<0) {
					System.out.println("Quantidade negativa, Digite novamente: ");
					quantidade = leia.nextInt();
				}

				if (quantidade <= estoque[codigoLer]) {
					carrinho[codigoLer] = carrinho[codigoLer] + quantidade;
				} else {
					System.out.println("Desculpe, mas nosso estoque não possui essa quantidade\n");
					System.out.println("Quantidade disponivel em estoque: " + estoque[codigoLer]);

				}
			} else {
				break;
			}
		
		}

	}
}
