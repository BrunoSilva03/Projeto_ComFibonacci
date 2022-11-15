package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class ConfereItem {

	public void confereItemNaLista(ArrayList<String> lista) {

		if (lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia atualmente. Nenhum item na lista.");
		} else {
			String item;
			Scanner sc = new Scanner(System.in);
			System.out.println("digite o item que deseja procurar na lista: ");
			item = sc.nextLine();
			
			if(lista.contains(item)) {
				System.out.println(item + " ESTÁ presente na lista.");
			} else {
				System.out.println(item + " NÃO está presente na lista atualmente.");
			}
		}

	}
}
