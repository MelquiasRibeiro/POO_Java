package com.mycompany.imc_calculator;
import java.awt.*;
import javax.swing.*;


public class FrameCalculator extends JFrame {
   private static final long serialVersionUID = 1L;
   public void calcularIMC(String massa, String altura) {
		float massaFloat = Float.parseFloat(massa);
		float alturaFloat = (Float.parseFloat(altura));
		float imcCalculado = massaFloat / (alturaFloat * alturaFloat);
                if (imcCalculado < 18.5){
                    JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é " + imcCalculado+
                                                        " Você está abaixo do seu peso ideial.");
                }else if( imcCalculado >= 18.5 && imcCalculado <= 24.9  ){
                    JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é " + imcCalculado+
                                                        " Você está dentro da faixa de peso ideial.");   
                }else if( imcCalculado >= 25 && imcCalculado <= 29.9  ){
                    JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é " + imcCalculado+
                                                        " Você está dentro da faixa Sobrepeso.");
                }else if( imcCalculado >= 30&& imcCalculado <= 34.9  ){
                    JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é " + imcCalculado+
                                                        " Você está dentro da faixa de obesidade grau 1.");
                }else if( imcCalculado >= 35&& imcCalculado <= 39.9  ){
                    JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é " + imcCalculado+
                                                        " Você está dentro da faixa de obesidade grau 2.");
                }else if( imcCalculado >= 40){
                    JOptionPane.showMessageDialog(null, "Seu índice de massa corporal é " + imcCalculado+
                                                        " Você está dentro da faixa de obesidade grau 3.");
                }
   }

	public FrameCalculator(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		JPanel jpnMassa = new JPanel();
		add(jpnMassa);
		
		JPanel jpnAltura = new JPanel();
		add(jpnAltura);
		
		JPanel jpnButtons = new JPanel();
		add(jpnButtons);
		
		jpnMassa.add(new JLabel("Digite sua massa (kg): "));
		JTextField massa = new JTextField(15);
		jpnMassa.add(massa);
		
		jpnAltura.add(new JLabel("Digite sua altura (m): "));
		JTextField altura = new JTextField(15);
		jpnAltura.add(altura);
		
		JButton btnCalcular = new JButton ("Calcular IMC");
		jpnButtons.add(btnCalcular);
		
		JButton btnLimpar = new JButton ("Limpar");
		jpnButtons.add(btnLimpar);
		
		JButton btnFechar = new JButton ("Fechar");
		jpnButtons.add(btnFechar);
		
		btnCalcular.addActionListener((ev) -> {
			if (altura.getText().equals("0")) {
				JOptionPane.showMessageDialog(null, "Atura invalida");
		    } else if (massa.getText().equals("0")) {
		    	JOptionPane.showMessageDialog(null, "Massa invalido");
			} else {
				calcularIMC(massa.getText(), altura.getText());
			}
		});
		btnFechar.addActionListener((ev) -> System.exit(0)); 
		btnLimpar.addActionListener((ev) -> {
			massa.setText("");
			altura.setText("");
		});
		altura.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent ev) {
				if (ev.getKeyCode() == 10) {
					calcularIMC(massa.getText(), altura.getText());
				}
			}
		});
	}
}
    