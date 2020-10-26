package utilidades;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteJFrame {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
//		JFrame meuFrame = new JFrame();
//		meuFrame.setTitle("Frame em branco");
//		meuFrame.setSize(300, 200);
//		meuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		meuFrame.setVisible(true);
//		
//		JOptionPane.showMessageDialog(null, "Voce está conectado");
		
		String nome = JOptionPane.showInputDialog("Nome de usuário: ");

		JOptionPane.showMessageDialog(null,"Olá "+nome+ "! Bom dia!Que você seja muito feliz hoje! :)");
		
	}

}
