package br.com.ana.cast.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxDifference {
	public static void main(String[] args) {
		validateDiff();
	}

	/*
	 * (non-Java-doc)
	 * 
	 * @see java.lang.Object#Object()
	 */
	public MaxDifference() {

		super();
	}

	public static void validateDiff() {
		Integer maxDiff = null;

		System.out.println(" Insira a quantidade de numeros deverá conter o Array : ");
		Scanner cursor = new Scanner(System.in);

		ArrayList<Integer> listacompare = new ArrayList<Integer>();

		String qtd = cursor.next();

		System.out.println(" Insira os valores seguidos de enter : ");

		for (int i = 0; i < Integer.parseInt(qtd); i++) {
			String valueInput = cursor.next();

			listacompare.add(Integer.parseInt(valueInput));

		}

		cursor.close();

		for (int j = 1; j < listacompare.size(); j++) {
			int compareNumber1 = listacompare.get(j);

			for (int k = (j - 1); k >= 0; k--) {

				int compareNumber2 = listacompare.get(k);

				if (compareNumber1 > compareNumber2) {
					int diff = compareNumber1 - compareNumber2;
					if (maxDiff == null || diff > maxDiff) {
						maxDiff = diff;
					}
				}
			}

		}

		System.out.println(" Máxima diferença do Array é " + maxDiff);

	}
}
