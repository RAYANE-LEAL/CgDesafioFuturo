/* 
 * Autora: Rayane Leal 
 */

package questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		List<String> resultado = new ArrayList<>();

		/* Conforme informado na quest�o o n ser� o valor da entrada */
		System.out.printf("Digite o valor da entrada: ");

		try {
			int n = entrada.nextInt();

			for (int i = 0; i < n; i++) {
				resultado.add(" ".repeat(n - i) + "*".repeat(i + 1));
			}

			for (String r : resultado) {
				System.out.println(r);

			}
		}

		/* Valida��o para entrada n�o n�merica */
		catch (Exception e) {
			System.out.printf("Ocorreu um erro: Informe um valor num�rico");
		}

	}
}