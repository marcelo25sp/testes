import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		
		byte digito;
		char sexo;
		boolean confirmar;
		String nome;
		
		digito = 2;
		sexo = 'M';
		confirmar = true;
		nome = "Marcelo";
		
		System.out.println("Digite o nome do usuário:");
		Scanner teclado = new Scanner(System.in);
		nome = teclado.next();
		System.out.println("Bem vindo(a)" + nome);
	}

}
