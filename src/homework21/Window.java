/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework21;

/**
 *
 * @author Mike
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTempType = new javax.swing.ButtonGroup();
        rboFarenheit = new javax.swing.JRadioButton();
        rboCelcius = new javax.swing.JRadioButton();
        lblSelector = new javax.swing.JLabel();
        lblInput = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        txtOutput = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTempType.add(rboFarenheit);
        rboFarenheit.setSelected(true);
        rboFarenheit.setText("Farenheit");
        rboFarenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboFarenheitActionPerformed(evt);
            }
        });

        btnTempType.add(rboCelcius);
        rboCelcius.setText("Celcius");
        rboCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboCelciusActionPerformed(evt);
            }
        });

        lblSelector.setText("Select Input Temperature Type");

        lblInput.setText("Input");

        lblOutput.setText("Output");

        btnConvert.setText("Convert");
        btnConvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOutput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInput)
                                .addGap(18, 18, 18)
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConvert))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSelector)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rboFarenheit)
                        .addGap(18, 18, 18)
                        .addComponent(rboCelcius)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelector)
                    .addComponent(rboFarenheit)
                    .addComponent(rboCelcius))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInput)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConvert))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOutput)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rboFarenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboFarenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboFarenheitActionPerformed

    private void rboCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboCelciusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboCelciusActionPerformed

    private void btnConvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseClicked
        if (rboFarenheit.isSelected()){
            try {
            txtOutput.setText(new TemperatureConverterService().ConvertToCelcius(txtInput.getText()));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        } else {
            txtOutput.setText(new TemperatureConverterService().ConvertToFarenheit(txtInput.getText()));
        }
    }//GEN-LAST:event_btnConvertMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.ButtonGroup btnTempType;
    private javax.swing.JLabel lblInput;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblSelector;
    private javax.swing.JRadioButton rboCelcius;
    private javax.swing.JRadioButton rboFarenheit;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
