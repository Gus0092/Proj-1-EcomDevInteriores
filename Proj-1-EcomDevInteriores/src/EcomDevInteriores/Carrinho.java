package EcomDevInteriores;

import java.util.Scanner;

public class Carrinho {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//vetores
		double carrinho[] = {0,1,0,0,0,0,0,0,0,0};
		double valor[] = {119.99,799.99,109.99,380.99,539.99,649.99,850.99,999.99,220.99,950.99};
		double estoque[] = {10,10,10,10,10,10,10,10,10,10};
		double valorTotal=0.0, valorFinal=0.0, valorImposto=0.0, imposto = 0.00,juros=0.0, taxaCartao=0.0;
		int tipoPagamento = 1;
		String produtosNome[] = {
			    "Luminária de mesa",
			    "Poltrona",
			    "Abajur",
			    "Estante",
			    "Escrivaninha",
			    "Cadeira de Escritório",
			    "Cama", "Cadeira Gamer",
			    "Mesa de centro",
			    "Sofá"};
		
			
			//itensNoCarrinho();
	
			//public itensNoCarrinho(double carrinho[],double valor[], String produtosNome[]) {
				System.out.println("CARRINHO DE COMPRAS\n");
				System.out.print("Item                    Un      VlrUn      VlrTotal\n");
				for (int i = 0; i < 10; i++) {
					if (carrinho[i] != 0) {
						System.out.print(produtosNome[i]);
						System.out.print(produtosNome[i]);
						System.out.print(carrinho[i] + "       " + valor[i] + "      "+(valor[i]*carrinho[i])+"\n");
					}
				}

				System.out.println("\n");
			
		
		//}
				
				
				//class menuCarrinho{
					
					int codigoLer = 1, quantidade = 0, unidade = 0 , x=0;
					
					
					while(codigoLer!= (-1)){
						//menu()
						System.out.print("\n");			
						//itensNoCarrinho()			
						System.out.print("Digite o código do produto a ser adicionado ao carrinho" + "\n"  + "ou aperte '0' para encerrar compra: ");
						System.out.print("G5-");			
						codigoLer = leia.nextInt();						
						codigoLer = codigoLer -1;
						
						if(codigoLer == (-1)) {
							break;
						}
						else if(codigoLer>=10 || codigoLer<0 ){
							System.out.print("Desculpe, código inválido!\n");
														
						}
						else if(codigoLer != -1 && estoque[codigoLer]<=10){
							System.out.println("Qual a quantidade?: ");
							quantidade= leia.nextInt();
		
							if(quantidade<=estoque[codigoLer]){
							unidade = (int) (estoque[codigoLer] - quantidade);
							carrinho[codigoLer] = carrinho[codigoLer] + quantidade;
							}
							else{
								System.out.println("Desculpe, mas nosso estoque não possui essa quantidade\n");
								System.out.println("Quantidade disponivel em estoque: "+ estoque[codigoLer]);
								
							}
						}
						else {
						break;
						}
					}
					//itensNoCarrinho()
					System.out.println("CARRINHO DE COMPRAS\n");
					System.out.print("Item                    Un      VlrUn      VlrTotal\n");
					for (int i = 0; i < 10; i++) {
						if (carrinho[i] != 0) {
							System.out.print(produtosNome[i]);
							System.out.print(produtosNome[i]);
							System.out.print(carrinho[i] + "       " + valor[i] + "      "+(valor[i]*carrinho[i])+"\n");
						}
					}

					System.out.println("\n");
		
				
		}

}

