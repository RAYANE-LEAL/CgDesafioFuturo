/* 
 * Autora: Rayane Leal 
 */

package questoes;

import java.util.Scanner;

public class SegundaQuestao {
	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite sua senha: ");

		String senha;
		int comprimentoSenha;

		boolean letraMaiuscula = false;
		boolean letraMinuscula = false;
		boolean numero = false;
		boolean letraEspecial = false;

		String simbolos = "!@#$%&*()";

		try {

			senha = entrada.nextLine();

			System.out.printf("\n");

			if (senha.length() < 6) {
				System.out.printf("\n");
				System.out.printf("É necessário que a senha tenha no mínimo 6 caracteres.");
			} else {

				System.out.printf("\n");

				for (char position : senha.toCharArray()) {

					if (position >= '0' && position <= '9') {
						numero = true;
					}

					if (position >= 'A' && position <= 'Z') {
						letraMinuscula = true;
					}

					if (position >= 'a' && position <= 'z') {
						letraMaiuscula = true;
					}

					for (char itemSpecial : simbolos.toCharArray()) {
						if (itemSpecial == position) {
							letraEspecial = true;
						}

						if (validaSenha(letraMaiuscula, letraMinuscula, numero, letraEspecial) == true) {
							break;
						}
					}

					if (validaSenha(letraMaiuscula, letraMinuscula, numero, letraEspecial) == true) {
						break;
					}
				}

				if (letraMaiuscula == true && letraMinuscula == true && numero == true && letraEspecial == true) {
					System.out.printf("\n");
					System.out.printf("Senha criada com sucesso");
				} else {
					System.out.printf("\n");
					System.out.printf("\n");
					System.out.printf(
							"É necessário que a senha contenha no mínimo uma letra miníscula, uma maiúscula, um número e um caracter especial!");
				}

			}

		} catch (Exception error) {
			System.out.printf("Ocorreu um erro ao validar os dados da senha.: ");
		}
	}

	public static boolean validaSenha(boolean letraMaiuscula, boolean letraMinuscula, boolean numero,
			boolean letraEspecial) {

		boolean status = false;

		if (letraMaiuscula == true && letraMinuscula == true && numero == true && letraEspecial == true) {
			status = true;
		}

		return status;
	}
}