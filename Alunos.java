import javax.swing.JOptionPane;

public class Alunos {

	

	public static void main(String[] args) {
		
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
		String ra = JOptionPane.showInputDialog("Digite o r.a do aluno:");
		String disciplina = JOptionPane.showInputDialog("Digite a disciplina:");
		double av1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da av1 do aluno:"));
		double av2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da av2 do aluno:"));
		double av3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da av3 do aluno:"));
		double media = (av1+av2+av3)/3;
		JOptionPane.showMessageDialog(null, nome + " sua média foi " + media); 
		
		
	}

}
