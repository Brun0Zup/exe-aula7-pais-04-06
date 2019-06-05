package com.br.zup.pais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePais {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<String> vizinhos = new ArrayList<String>();

		String codIso = "";
		String nomePais = "";
		int populacao = 0;
		double dimensao = 0;

		int controle = 1;

		AppPais pais1 = new AppPais(codIso, nomePais, populacao, dimensao, vizinhos);
		AppPais pais2 = new AppPais(codIso, nomePais, populacao, dimensao, vizinhos);

		while (controle == 1) {

			System.out.println("(0) Para sair\n"
			+ "(1) Para continuar\n" 
					+ "(2) Para inserir um pais vizinho\n"
					+ "(3) Para imprimir a lsita de Paises\n");
			controle = entrada.nextInt();
			if (controle == 1) {
				System.out.println("Digite o código Iso: ");
				codIso = entrada.nextLine();

				entrada.nextLine();

				System.out.println("Digite o nome do Pais: ");
				nomePais = entrada.nextLine();

				System.out.println("Insira a qtd de população do pais: ");
				populacao = entrada.nextInt();

				System.out.println("Insira a dimensão do pais: ");
				dimensao = entrada.nextDouble();
			} else if (controle == 2) {
				System.out.println("Digite pais vizinhos ");
				vizinhos.add(entrada.nextLine());
				vizinhos.add(entrada.nextLine());

				System.out.println(pais1);
				System.out.println(pais2);

				// Verificando se os paises são iguais
				System.out.println(pais1.verificar(pais2.getIso()));
			} else if (controle == 3) {

				for (String string : vizinhos) {
				}

			}

		}
		entrada.close();
	}
}
