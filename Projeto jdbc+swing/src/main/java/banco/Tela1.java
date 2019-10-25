package banco;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Tela1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Tela1(String title) {
		super(title);
		setLayout(new FloatLayout());

		JPanel jpnTitular = new JPanel();
		add(jpnTitular);
		
		JPanel jpnNumConta = new JPanel();
		add(jpnNumConta);
		
		JPanel jpnTipoConta = new JPanel();
		add(jpnTipoConta);
		
		JPanel jpnButtons = new JPanel();
		add(jpnButtons);
				
		jpnTitular.add(new JLabel("Digite Seu Nome "));
		JTextField titular = new JTextField(15);
		jpnTitular.add(titular);
		
		jpnNumConta.add(new JLabel("Digite o numero da sua conta "));
		JTextField numConta = new JTextField(15);
		jpnNumConta.add(numConta);
		
		jpnTipoConta.add(new JLabel("Digite O tipo da sua conta "));
		JTextField tipoConta = new JTextField(15);
		jpnTipoConta.add(tipoConta);

		JButton btnConfirm = new JButton("Salvar");
		jpnButtons.add(btnConfirm);
		JButton btnClean = new JButton("Limpar");
		jpnButtons.add(btnClean);

		btnConfirm.addActionListener((event) -> {
			ContaDAO dao = new ContaDAO("root", "melquais10");
			Conta conta = new Conta (titular.getText(), numConta.getText(), tipoConta.getText());
			try {
				dao.openConnection();
				dao.create(Conta);
				dao.closeConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		btnClean.addActionListener((event) -> {
			titular.setText("");
			numConta.setText("");
			tipoConta.setText("");
		}
	}
}
