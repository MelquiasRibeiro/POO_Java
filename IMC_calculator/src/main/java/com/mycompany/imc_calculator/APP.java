 
package com.mycompany.imc_calculator;

import javax.swing.JFrame;

public class APP {
    public static void main(String[] args) {
        
       JFrame frame = new FrameCalculator("Calculadora de IMC");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    }
    
}

