package Program;

import java.util.Scanner;

public class Fibonacci {

	public void sequenciaDeFibonacci() {
		Scanner sc = new Scanner(System.in);
		int casas;
		
		System.out.println("Digite at� que casa deseja ver a sequ�ncia de Fibonacci");
		casas = sc.nextInt();
		
		sequenciaFibonacci(casas);
	}
	
	public void sequenciaFibonacci(int casas) {
		if(casas <= 2) {
			pequenaSequenciaDeFibonacci(casas);
		} else {
			int atual, anterior=1, antAnterior=1;
			System.out.println("SEQU�NCIA DE FIBONACCI: ");
			System.out.print(1 + ", " + 1 + ", ");
			for(int i = 2; i < casas; i++) {
				atual = anterior + antAnterior;
				antAnterior = anterior;
				anterior = atual;
				System.out.print(atual + ", ");
				
			}
		}
		System.out.println(" ");
		
	}
	
	public void pequenaSequenciaDeFibonacci(int casas) {
		if(casas <= 0) {
			System.out.println("SEM SEQU�NCIA DE FIBONACCI, DIGITE UM N�MERO IGUAL OU MAIOR QUE 1");
		}
		
		if(casas == 1) {
			System.out.println("SEQU�NCIA DE FIBONACCI: ");
			System.out.print("1");
		}
		
		if(casas == 2) {
			System.out.println("SEQU�NCIA DE FIBONACCI: ");
			System.out.print("1, 1");
		}
	}
}
