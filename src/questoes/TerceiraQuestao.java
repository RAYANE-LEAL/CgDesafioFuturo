/* 
 * Autora: Rayane Leal 
 */

package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerceiraQuestao {
	public static void main(String[] args) {

		String palavra;
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> anagramas = new ArrayList<String>();
		System.out.printf("Digite a palavra: ");
		palavra = entrada.nextLine();

		try {
			for (int i = 0; i < palavra.length(); i++) {
				for (int j = 1; j < palavra.length(); j++) {
					if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
						if (palavra.charAt(i) == palavra.charAt(i + 1)) {
							String x = palavra.substring(i, i + 1);

							anagramas.add(x);

						} else {
							String y = palavra.substring(i, j);
							String z = palavra.substring(i + 1, j + 1);
							String h = palavra.substring(i, i + 1);
							anagramas.add(h);
							anagramas.add(y);
							anagramas.add(z);
						}
					}
				}
			}

		}

		catch (Exception e) {
			System.out.printf("Ocorreu um erro: Informe um valor numérico");
		}

		System.out.println(anagramas);
		String str = String.join(",", anagramas);

	}

}
