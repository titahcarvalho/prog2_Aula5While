package prog2_aula5;

import java.util.Scanner;

	public class Aula5_While {
		public static void main(String[] args) {
				int i; int maior=0; int menor=0; int media=0; int soma=0; int contador=0;
				Scanner s = new Scanner(System.in);
				System.out.println("Digite um número: ");
					i = s.nextInt();
					if ((i >=0) && (i<=100)) {
						maior = i; menor = i;}
					while ((i >= 0) && (i <= 100)) {
						if (i > maior) {maior = i;}
						if (i < menor) {menor = i;
						}
						soma += i;
						contador++;
						System.out.println("Número = " + i);
						System.out.println("Digite um número: ");
						i = s.nextInt(); 
						} 
						if (contador > 0) {
							media = soma/contador;
						}
						
						System.out.println("Número " + i + " fora da faixa de 0 a 100.");
					    System.out.println("Maior: " + maior + " Menor: " + menor);
					    System.out.println("A média é:" + media);
					s.close();


	}

}
