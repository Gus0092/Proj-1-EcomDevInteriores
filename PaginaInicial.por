programa {
	
	funcao inicio(){
		caracter resposta
				
		nome()
		linha()
		slogan()
		linha()	
				
		escreva("Olá, deseja comprar algo? ")
		pular()
		pular()
		escreva("S/N? : ")
		leia(resposta)
		pular()

		se (resposta == 'S' ou resposta == 's'){
			limpa()
			nome()
			linha()
			slogan()
			pular()
			escreva("Iremos te apresentar agora os nossos produtos!\n")
			linha()
		} senao se (resposta == 'N' ou resposta == 'n'){
			limpa()
			despede()
			linha()
			slogan()
			pular()
			escreva("Até breve!!\n")
			linha()
		}
	}
	funcao nome(){
		escreva("Bem-vinde à Devs de int[e]=riores\n")
	}
	funcao agradece(){
		escreva("Obrigada por comprar com a Devs de int[e]=riores\n")
	}
	funcao despede(){
		escreva("Obrigada por vir à Devs de int[e]=riores\n")
	}
	funcao slogan(){
		escreva("Programando o seu conforto!\n\n")
	}
	funcao linha(){
		escreva("----------------------------------------\n")
	}
	funcao pular(){
		escreva("\n")
	}	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 338; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */