import javax.swing.JOptionPane;

public class Testes {

	

	public static void main(String[] args) {
		
		// inteiros
		int matricula;
		short anoAtual;
		long codigo;
		byte digito;
		
		//reais
		float nota;
		double salario;
		
		
		char sexo;
		
		//lógicos
		boolean confirmar;
		
		//caracteres
		String nome;
		
		nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
		sexo = JOptionPane.showInputDialog("Digite o sexo do usuário:[M/F]").charAt(0); 
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da matrícula do usuário:"));
		anoAtual = Short.parseShort(JOptionPane.showInputDialog("Digite o ano atual:"));
		codigo = Long.parseLong(JOptionPane.showInputDialog("Digite o código:"));
		digito = Byte.parseByte (JOptionPane.showInputDialog("Digite o dígito:"));
		nota =  Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do usuário:"));
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do usuário:"));		
		JOptionPane.showMessageDialog(null, nome + ": a sua nota foi " + nota);
		
		System.out.println("Exemplos de comandos if-else");
		System.out.println("");
		int idade =16;
		if(idade < 18) {
			System.out.println("VOTO FACULTATIVO");
		}else if(idade>=18 && idade <=70) {
			System.out.println("VOTO OBRIGATÓRIO");
		}else {
			System.out.println("VOTO INVÁLIDO");
		}
		
		
	
	}

}
