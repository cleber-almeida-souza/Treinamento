package principal;

import javax.swing.JOptionPane;

import modelo.Empregado;

public class EmpregadoMain {

	public static void main(String[] args) {
//		String nome =JOptionPane.showInputDialog("Digite o nome do empregado?");
//		Double salb = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio empregado"));
//		Double desc = (salb*0.08);
//		Double novosal = (salb-desc);
//		JOptionPane.showMessageDialog(null, "O valor do desconto de 8% foi " + desc);
//		JOptionPane.showMessageDialog(null, "O seu novo sal�rio � " + novosal);
	
	Empregado e = new Empregado();
	e.setNome(JOptionPane.showInputDialog("Digite o nome do Recurso"));
	e.setSalario(Double.parseDouble(JOptionPane.showInputDialog("digite o sal�rio de seu recurso")));
	e.desc();
	e.novosal();
	JOptionPane.showMessageDialog(null, "Deconto de 8% : " + e.desc());
	JOptionPane.showMessageDialog(null, "O nome do recurso � " + e.getNome() + "\n O sal�rio liquido �: "  + e.novosal());
	 
	}
}
