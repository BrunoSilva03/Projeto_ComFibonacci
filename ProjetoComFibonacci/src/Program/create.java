package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class create {

	
	public void adicionar(ArrayList<String> lista) {
		
		create c = new create();
		Scanner sc = new Scanner(System.in);
		String newItem;
		
		System.out.println("Digite um item para ser adicionado na lista: ");
		newItem = sc.nextLine();
		
		if(lista.contains(newItem)) {
			int opc = 1;
			System.out.println(newItem + " já está presente na lista. Escolha outro item ou retorne ao menu inicial.");
			System.out.println("1 - Digitar outro item");
			System.out.println("2 - Retornar ao menu inicial");
			opc = sc.nextInt();
			
			
			switch(opc) {
			
			
			case 1: {
				
				c.adicionar(lista);
				
			}break;
			
			
			case 2: {
				opc = 0;
				System.out.println("Retornando ao menu inicial...");
				
			}break;
			
			
			default: {
				
				opc = 0;
				System.out.println("Opção Inválida, Retornaremos ao menu inicial");
				
			}break;
			
			
			}
			
			
		} else {
			
			lista.add(newItem);
			System.out.println(newItem + " adicionado a lista Com Sucesso!!!");
			
		}
		
		
	}
}
