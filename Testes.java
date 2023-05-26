import java.util.Scanner;

import javax.swing.JOptionPane;

public class Testes {

	

	public static void main(String[] args) {
		
		// inteiros
		int matricula;
		short AnoAtual;
		long codigo;
		byte digito;
		
		//reais
		float nota;
		double salario;
		
		//
		char sexo;
		
		//lógicos
		boolean confirmar;
		
		//caracteres
		String nome;
		
		
		sexo = JOptionPane.showInputDialog("Digite o sexo do usuário:[M/F]").charAt(0); 
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da matrícula do usuário:"));
		
	}

}
