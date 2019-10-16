
package Tela;

import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {
    public Tela() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Altura = new javax.swing.JTextField();
        Peso = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        Altura.setText("  Digite sua Altura");
        Altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlturaActionPerformed(evt);
            }
        });

        Peso.setText("  Digite seu Peso");
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("Cacule seu IMC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Calcular)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Altura)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(9, 9, 9))
                        .addComponent(Peso)))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Calcular)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private float altura;
    private float peso;
    private float resultado;

    public void setAltura() {
        this.altura = alturaToFlot();
    }


    public float getAltura() {
        return altura;
    }
   
     public void setPeso() {
        this.peso =PesoToFlot();
    }

    public float getPeso() {
        return peso;
    }
     public void setResultado(float R) {
        this.resultado =R;
    }

    public float getResultado() {
        return resultado;
    }
 
    
    public float alturaToFlot(){
      float alturar = Float.parseFloat(Altura.getText());
      
     return alturar; 
    }
    
    public float PesoToFlot(){
      float pesor = Float.parseFloat(Peso.getText());
      
     return pesor; 
    }
    
    public void IMC(){       
        setResultado( getPeso() / getAltura()*getAltura());    
    }
       
    
    private void AlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlturaActionPerformed
    }//GEN-LAST:event_AlturaActionPerformed

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
    }//GEN-LAST:event_PesoActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed

        
        System.out.println("  "+ resultado );

        JOptionPane.showMessageDialog(null,"seu imc é: " + resultado ); 
    }//GEN-LAST:event_CalcularActionPerformed

    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altura;
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Peso;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
