package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class delete {

	
	
	public void excluir(ArrayList<String> lista) {
		
		delete d = new delete();
		if(lista.isEmpty()) {
			
			System.out.println("A lista est� vazia, n�o h� nenhum elemento para ser exclu�do.");
			
		} else {
			Scanner sc = new Scanner(System.in);
			String item;
			
			
			
			System.out.println("Digite o item que deseja excluir da lista: ");
			item = sc.nextLine();
			
			
			if(!lista.contains(item)) {
				int opc = 1;
				System.out.println(item + " n�o est� presente na lista, voc� pode digitar outro item ou retornar ao menu inicial");
				System.out.println("1 - Digitar outro item");
				System.out.println("2 - Retornar ao menu inicial");
				opc = sc.nextInt();
				
				switch(opc) {
				
				case 1: {
					opc = 0;
					d.excluir(lista);
					
				}break;
				
				
				case 2: {
					opc = 0;
					System.out.println("Retornando ao menu inicial");
					
					
				}break;
				
				
				default: {
					
					opc = 0;
					System.out.println("Op��o Inv�lida. Retornaremos ao menu inicial");
					
				}break;
				
				}
				
				
				
			} else {
				
				lista.remove(item);
				System.out.println("item " + item + " removido da lista Com Sucesso!!!");
				
			}
			
		}
		
	}
}
