package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class update {
	
	//update u = new update();
	
	public void alterar(ArrayList<String> lista) {

		if (lista.isEmpty()) {

			System.out.println("A lista encontra-se vazia no momento, nada a ser alterado na lista.");

		} else {

			seListaNaoEstiverVazia(lista);

		} 

	}// fim do método alterar

	
	
	
	public void alteraItens(ArrayList<String> lista, String item, String newItem) {

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i).equals(item)) {
				lista.set(i, newItem);

			}
		}

	}
//fim do método

	
	
	public void seListaNaoEstiverVazia(ArrayList<String> lista) {
		Scanner sc = new Scanner(System.in);
		String item;
		String newItem = "newItem de teste string inicial 09/11/2022-18:13";
		

		System.out.println("Digite o item a ser alterado: ");
		item = sc.nextLine();

		if (lista.contains(item)) {
			
			seListaContemItem(lista, item, newItem, sc);

		} else {
			
			seListaNaoContemItem(lista, item, sc);
			
		} 
	}
	//fim do método
	
	

	public void seListaContemItem(ArrayList<String> lista, String item, String newItem, Scanner sc) {
		
		
		System.out.println("Digite um item para substituir " + item + " na lista: ");
		newItem = sc.next();

		if (lista.contains(newItem)) {
			seListaContemNewItem(lista, item, newItem, sc);
			
			
		} else {

			alteraItens(lista, item, newItem);
			System.out.println(item + " substituído por " + newItem + " na lista Com Sucesso!!!");
		}

		
	}
	//fim do método
	
	
	public void seListaContemNewItem(ArrayList<String> lista, String item, String newItem, Scanner sc) {
		int option2;
		System.out.println(newItem + " já está presente na lista, Digite outro item ou retorne ao menu inicial.");
		System.out.println("1 - Digitar outro item");
		System.out.println("2 - Retornar ao menu inicial");
		option2 = sc.nextInt();

		switch (option2) {

		case 1: {

			seListaContemItem(lista, item, newItem, sc);
			
		}
			break;

		case 2: {
			
			System.out.println("Retornando ao menu inicial...");

		}

		default: {
			
			System.out.println("Opção Inválida. Retornaremos ao menu inicial");

		}

		}// fim do switch option2
		
		
	}
	//fim do método
	
	
	
	
	
	
	
	
	public void seListaNaoContemItem(ArrayList<String> lista, String item, Scanner sc) {
		
		int option1;
		System.out.println(item + " não está presente na lista. Tente digitar outro item ou retorne ao menu inicial");
		System.out.println("1 - Digite outro item");
		System.out.println("2 - Retorne ao menu inicial");
		option1 = sc.nextInt();

		switch (option1) {

		case 1: {

		seListaNaoEstiverVazia(lista);

		}
			break;

		case 2: {

			System.out.println("Retornando ao menu inicial");

		}
			break;

		case 3: {

			System.out.println("Opção Inválida. Retornaremos ao menu inicial");

		}
			break;

		}// fim do switch option1
	}
	

}
