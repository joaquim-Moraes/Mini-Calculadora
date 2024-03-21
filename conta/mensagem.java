package conta;

import javax.swing.JOptionPane;

public class mensagem {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Olá bem vindo, eu sou a Helisa e farei o seu calculo ");
        String n1s = JOptionPane.showInputDialog(null,"Digite o primeiro numero");
        double n1 = Double.parseDouble(n1s);
        String n2s = JOptionPane.showInputDialog(null,"Digite o segundo numero ");
        double n2 = Double.parseDouble(n2s);
        double soma = n1 + n2;
        double multi = n1 * n2;
        double div = n1/n2;
        double menos = n1 - n2;
        JOptionPane.showMessageDialog(null,"Soma : " + soma );
        JOptionPane.showMessageDialog(null,"Menos : " + menos);
        JOptionPane.showMessageDialog(null,"Multiplicação : " + multi);
        JOptionPane.showMessageDialog(null,"Divisão : " + div);
}
}