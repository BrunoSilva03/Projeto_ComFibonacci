package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class exchangeItens {

	public void exchangeItensLista(ArrayList<String> lista) {
	
		if(lista.isEmpty()) {
			
			System.out.println("A lista encontra-se vazia no momento, nenhujm item a ser trocado na lista.");
			
		} else {
			
			seListaNaoEstiverVazia(lista);
		}
	}
	//fim do método
	
	
	public void seListaNaoEstiverVazia(ArrayList<String> lista) {
		String item1, item2 = "Testezinho do Programa em java e em eclipse 09/11/2022 - 20:09 da night......";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o item a ser trocado de lugar na lista:");
		item1 = sc.nextLine();
		
		if(lista.contains(item1)) {
			
			seListaContemItem1(lista, item1, item2, sc);
			
		} else {
			
			seListaNaoContemItem1(lista, item1, sc);
		}
	}
	//fim do método
	
	
	public void seListaContemItem1(ArrayList<String> lista, String item1, String item2, Scanner sc) {
		System.out.println("Digite outro número para ser trocado de lugar com " + item1 +  " na lista");
		item2 = sc.next();
		
		if(lista.contains(item2)) {
			
			seListaContemItem2(lista, item1, item2, sc);
			
		} else {
		
			
			seListaNaoContemItem2(lista, item1, item2, sc);
		}
		
	}
	
	
	
	
	
	 
	
	public void seListaNaoContemItem1(ArrayList<String> lista, String item1, Scanner sc) {
		int option1;
		System.out.println(item1 + " não existe na lista, Digite outro item ou retorne ao menu inicial.");
		System.out.println("1 - Digitar outro item");
		System.out.println("2 - Retornar ao menu inicial");
		option1 = sc.nextInt();
		
		switch(option1) {
		
		
		case 1: {
			
			seListaNaoEstiverVazia(lista);
			
		}break;
		
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			System.out.println("Opção Inválida. Retornando ao menu inicial...");
			
		}break;
		
		
		}
		//fim do switch option1
		
	}
	//fim do método
	
	
	
	public void seListaContemItem2(ArrayList<String> lista, String item1, String item2, Scanner sc) {

		String aux1=null, aux2=null;
		int indiceAux1=0, indiceAux2=0;
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).equals(item1)) {
				aux1 = lista.get(i);
				indiceAux1 = i;
			}
			
			if(lista.get(i).equals(item2)) {
				aux2 = lista.get(i);
				indiceAux2 = i;
			}
		}
		
		lista.set(indiceAux1, aux2);
		lista.set(indiceAux2, aux1);
		System.out.println(item1 + " trocado de lugar no lista com " + item2 + " Com Sucesso!!!");
		
		//Continuar daqui em diante...
	}
	
	
	
	public void seListaNaoContemItem2(ArrayList<String> lista, String item1, String item2, Scanner sc) {
		int option2;
		System.out.println(item2 + " não existe na lista, digite outro item ou retorne ao menu inicial" );
		System.out.println("1 - Digite outro item");
		System.out.println("2 - Retornar ao menu inicial");
		option2 = sc.nextInt();
		
		switch(option2) {
		
		
		case 1: {
			
			seListaContemItem1(lista, item1, item2, sc);
			
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Retornaremos ao menu inicial...");
			
		}break;
		
		}
		//fim do switch do option2
		
	}
	//fim do método
	
	
	
	
				
	}//fim da classe exchangeItens na lista

