/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author cjcor
 */
public class AssignValueDialog extends javax.swing.JDialog {

    private String value;

    /**
     * Creates new form AssignedValueDialog
     * @param varible the name of the variable to put it value.
     */
    public AssignValueDialog(java.awt.Frame parent, boolean modal, String variable) {
        super(parent, modal);
        initComponents();
        lbCharacter.setText(variable + ":");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btAssign = new javax.swing.JButton();
        tfValue = new javax.swing.JTextField();
        lbCharacter = new javax.swing.JLabel();
        lbError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Asignar Valor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btAssign.setBackground(new java.awt.Color(102, 102, 255));
        btAssign.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btAssign.setForeground(new java.awt.Color(255, 255, 255));
        btAssign.setText("Asignar Valor");
        btAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAssignActionPerformed(evt);
            }
        });
        jPanel1.add(btAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, -1));

        tfValue.setBackground(new java.awt.Color(255, 255, 255));
        tfValue.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        tfValue.setForeground(new java.awt.Color(0, 0, 0));
        tfValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValueActionPerformed(evt);
            }
        });
        tfValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfValueKeyReleased(evt);
            }
        });
        jPanel1.add(tfValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 30));

        lbCharacter.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbCharacter.setForeground(new java.awt.Color(0, 0, 0));
        lbCharacter.setText("A");
        jPanel1.add(lbCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 25, 30));

        lbError.setBackground(new java.awt.Color(204, 204, 204));
        lbError.setFont(new java.awt.Font("Roboto Light", 0, 10)); // NOI18N
        lbError.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.add(lbError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValueActionPerformed

    }//GEN-LAST:event_tfValueActionPerformed

    /**
     * Asign the value to a variable if the text is not empty.
     * @param evt 
     */
    private void btAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAssignActionPerformed
        if (!tfValue.getText().isEmpty()) {
            try {
                double temp = Double.parseDouble(tfValue.getText());
                value = temp + "";
                this.setVisible(false);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                this.dispose();
            } catch (NumberFormatException ex) {
                lbError.setText("Digite un n??mero v??lido");
            }
        } else {
            lbError.setText("Por favor llene el campo");
        }
    }//GEN-LAST:event_btAssignActionPerformed

    /**
     * Event used to eliminate the label error text when a key is released
     * @param evt 
     */
    private void tfValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValueKeyReleased
        lbError.setText("");
    }//GEN-LAST:event_tfValueKeyReleased

    /**
     * Get of the variable value
     * @return a String with the value of the variable
     */
    public String getValue() {
        return value;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAssign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCharacter;
    private javax.swing.JLabel lbError;
    private javax.swing.JTextField tfValue;
    // End of variables declaration//GEN-END:variables
}
