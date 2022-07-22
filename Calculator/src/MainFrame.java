
import java.util.EmptyStackException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Jostin Castro
 */
public class MainFrame extends javax.swing.JFrame {

    private Queue reversePolish;
    private Queue variablesQueue;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
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
        btSqrt = new javax.swing.JButton();
        btCos = new javax.swing.JButton();
        btSen = new javax.swing.JButton();
        btFacto = new javax.swing.JButton();
        btTan = new javax.swing.JButton();
        btCalculate = new javax.swing.JButton();
        tfInput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSqrt.setBackground(new java.awt.Color(153, 153, 255));
        btSqrt.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btSqrt.setForeground(new java.awt.Color(255, 255, 255));
        btSqrt.setText("sqrt(");
        btSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSqrtActionPerformed(evt);
            }
        });
        jPanel1.add(btSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, -1));

        btCos.setBackground(new java.awt.Color(153, 153, 255));
        btCos.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btCos.setForeground(new java.awt.Color(255, 255, 255));
        btCos.setText("cos(");
        btCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCosActionPerformed(evt);
            }
        });
        jPanel1.add(btCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, -1));

        btSen.setBackground(new java.awt.Color(153, 153, 255));
        btSen.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btSen.setForeground(new java.awt.Color(255, 255, 255));
        btSen.setText("sen(");
        btSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSenActionPerformed(evt);
            }
        });
        jPanel1.add(btSen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 90, -1));

        btFacto.setBackground(new java.awt.Color(153, 153, 255));
        btFacto.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btFacto.setForeground(new java.awt.Color(255, 255, 255));
        btFacto.setText("Factorial");
        btFacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFactoActionPerformed(evt);
            }
        });
        jPanel1.add(btFacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, -1));

        btTan.setBackground(new java.awt.Color(153, 153, 255));
        btTan.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btTan.setForeground(new java.awt.Color(255, 255, 255));
        btTan.setText("tan(");
        btTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTanActionPerformed(evt);
            }
        });
        jPanel1.add(btTan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 90, -1));

        btCalculate.setBackground(new java.awt.Color(102, 255, 102));
        btCalculate.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btCalculate.setText("Calcular");
        btCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculateActionPerformed(evt);
            }
        });
        jPanel1.add(btCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 90, -1));

        tfInput.setBackground(new java.awt.Color(255, 255, 255));
        tfInput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tfInput.setForeground(new java.awt.Color(0, 0, 0));
        tfInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfInputKeyTyped(evt);
            }
        });
        jPanel1.add(tfInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 10));

        lbError.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lbError.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(lbError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, 290, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfInputKeyTyped
        // TODO add your handling code here:
        synchronized (this) {

            if (evt.getKeyChar() == 8) {
                int caretPosition = tfInput.getCaretPosition() - 1;
                if (caretPosition >= 2 && tfInput.getSelectedText() == null) {
                    String temp = "";
                    for (int i = caretPosition; i >= caretPosition - 2; i--) {
                        temp = tfInput.getText().charAt(i) + temp;
                    }
                    System.out.println(temp);
                    byte toDelete = 0;
                    switch (temp) {
                        case "cos":
                        case "sen":
                        case "tan":
                            toDelete = 2;
                            break;
                        case "qrt":
                            toDelete = 3;
                            break;
                    }
                    System.out.println(toDelete);
                    if (toDelete > 0) {
                        caretPosition = tfInput.getCaretPosition() - 1;
                        String newText = "";
                        for (int i = 0; i < tfInput.getText().length(); i++) {
                            if (i < caretPosition - toDelete || i > caretPosition) {
                                newText += tfInput.getText().charAt(i);
                            }
                        }
                        tfInput.setText(newText);
                        tfInput.setCaretPosition(caretPosition - toDelete);

                    }
                }

            }
        }
    }//GEN-LAST:event_tfInputKeyTyped

    private void btCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCosActionPerformed
        // TODO add your handling code here:
        final String COS_TEXT = "cos(";
        String inputText = tfInput.getText();
        String firstPart = inputText.substring(0, tfInput.getCaretPosition());
        String secondPart = inputText.substring(tfInput.getCaretPosition());
        tfInput.setText(firstPart + COS_TEXT + secondPart);

    }//GEN-LAST:event_btCosActionPerformed

    private void btSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSenActionPerformed
        // TODO add your handling code here:
        final String SEN_TEXT = "sen(";
        String inputText = tfInput.getText();
        String firstPart = inputText.substring(0, tfInput.getCaretPosition());
        String secondPart = inputText.substring(tfInput.getCaretPosition());
        tfInput.setText(firstPart + SEN_TEXT + secondPart);
    }//GEN-LAST:event_btSenActionPerformed

    private void btTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTanActionPerformed
        // TODO add your handling code here:
        final String TAN_TEXT = "tan(";
        String inputText = tfInput.getText();
        String firstPart = inputText.substring(0, tfInput.getCaretPosition());
        String secondPart = inputText.substring(tfInput.getCaretPosition());
        tfInput.setText(firstPart + TAN_TEXT + secondPart);
    }//GEN-LAST:event_btTanActionPerformed

    private void btSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSqrtActionPerformed
        // TODO add your handling code here:
        final String SQRT_TEXT = "sqrt(";
        String inputText = tfInput.getText();
        String firstPart = inputText.substring(0, tfInput.getCaretPosition());
        String secondPart = inputText.substring(tfInput.getCaretPosition());
        tfInput.setText(firstPart + SQRT_TEXT + secondPart);
    }//GEN-LAST:event_btSqrtActionPerformed

    private void btFactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFactoActionPerformed
        // TODO add your handling code here:
        final char FACTO_SYMBOL = '!';
        String inputText = tfInput.getText();
        String firstPart = inputText.substring(0, tfInput.getCaretPosition());
        String secondPart = inputText.substring(tfInput.getCaretPosition());
        tfInput.setText(firstPart + FACTO_SYMBOL + secondPart);
    }//GEN-LAST:event_btFactoActionPerformed

    private void btCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculateActionPerformed
        // TODO add your handling code here:
        String formula = tfInput.getText();
        if (VerifyFormula.isBalanced(formula)) {
            Queue data = transformData(formula);
            if (data != null) {
                reversePolish = ReversePolish.reversePolish(data);
                if (VerifyFormula.validateSyntax(reversePolish.copy())) {
                    try {
                        fillQueueVariables(reversePolish.copy());
                        String valuesMatrix[][] = new String[variablesQueue.size()][2];

                        try {
                            if (variablesQueue.size() > 0) {
                                AssignValueDialog variableRequest;
                                int countVariables = variablesQueue.size();
                                for (int i = 0; i < countVariables; i++) {
                                    variableRequest = new AssignValueDialog(this, true, variablesQueue.first());
                                    variableRequest.setVisible(true);
                                    String variable = variableRequest.getValue();
                                    while (variable == null) {
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException ex) {
                                            ex.printStackTrace();
                                        }
                                        variable = variableRequest.getValue();
                                    }
                                    variableRequest.dispose();
                                    valuesMatrix[i][0] = variablesQueue.dequeue();
                                    valuesMatrix[i][1] = variable;
                                }

                            }
                        } catch (EmptyQueueException ex) {
                            ex.printStackTrace();
                        }
                        MessageDialog.showMessageDialog(this, "Fórmula post fija: " + reversePolish.printAll(), "Fórmula post fija");
                        double result = Evaluate.evaluate(reversePolish, valuesMatrix);
                        MessageDialog.showMessageDialog(this, "Resultado de la formula:\n\n" + result, "Resultado");
                        tfInput.setText("");
                    } catch (InvalidFormulaException ex) {
                        lbError.setText("Error de sintaxis");
                    } catch (EmptyStackException ex) {
                        ex.printStackTrace();
                    }
                } else {
                   lbError.setText("Error de sintaxis");
                }
            }
        } else {
            lbError.setText("La fórmula dada no está balanciada");
        }

    }//GEN-LAST:event_btCalculateActionPerformed

    private void tfInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfInputKeyReleased
        lbError.setText(null);
    }//GEN-LAST:event_tfInputKeyReleased

    private Queue transformData(String formula) {
        FormulaData[] data = new FormulaData[formula.length()];
        final String[] FUNCTIONS_TEXT = {"cos", "sen", "tan", "sqrt"};
        for (int i = 0; i < data.length; i++) {
            String temp = "";
            char value = formula.charAt(i);
            switch (value) {
                case 'c':
                case 's':
                case 't':
                    if (i + 5 < formula.length()) {
                        temp = formula.substring(i, i + 5);
                        for (int j = 0; j < FUNCTIONS_TEXT.length; j++) {
                            if (temp.contains(FUNCTIONS_TEXT[j])) {
                                data[i] = new FormulaData(FUNCTIONS_TEXT[j]);
                                i += FUNCTIONS_TEXT[j].length() - 1;
                                break;
                            } else if (j == FUNCTIONS_TEXT.length - 1) {
                                data[i] = new FormulaData(Character.toString(temp.charAt(0)));
                            }
                        }
                    } else {
                        data[i] = new FormulaData(Character.toString(formula.charAt(i)));
                    }
                    break;
                case '^':
                case '!':
                    data[i] = new FormulaData(Character.toString(value));
                    break;
                case '*':
                case '/':
                    data[i] = new FormulaData(Character.toString(value));
                    break;
                case '+':
                case '-':
                    data[i] = new FormulaData(Character.toString(value));
                    break;
                case '[':
                case ']':
                case '(':
                case ')':
                case '{':
                case '}':
                    data[i] = new FormulaData(Character.toString(value));
                    break;
                case ' ':
                    //Do nothing
                    break;
                default:
                    if (Character.isDigit(value)) {
                        char digit = value;
                        byte count = 0;
                        while (Character.isDigit(digit) || value == '.') {
                            temp += digit;
                            count++;
                            if (i + count < formula.length()) {
                                digit = formula.charAt(i + count);
                            } else {
                                break;
                            }
                        }
                        i += count - 1;
                        data[i] = new FormulaData(temp);
                    } else {
                        data[i] = new FormulaData(Character.toString(value));
                    }
                    break;
            }
        }

        if (data.length > 1) {
            Queue temp = new Queue();

            for (int i = 0; i < data.length; i++) {
                if (data[i] != null) {
                    temp.enqueue(data[i].getData());
                }
            }
            return temp;
        } else {
            if (data.length == 1 && data[0] != null) {
                Queue temp = new Queue();
                temp.enqueue(data[0].getData());
                return temp;
            } else {
                return null;
            }
        }

    }

    private void fillQueueVariables(Queue data) {
        Queue tempQueue = data.copy();
        variablesQueue = new Queue();
        while (!tempQueue.empty()) {
            try {
                FormulaData temp = new FormulaData(tempQueue.dequeue());
                if (temp.getPriority() == FormulaData.VALUE_PRIORITY) {
                    if (Character.isLetter(temp.getData().charAt(0))) {
                        if (variablesQueue.search(temp.getData()) == -1) {
                            variablesQueue.enqueue(temp.getData());
                        }
                    }
                }
            } catch (EmptyQueueException ex) {
                ex.printStackTrace();
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalculate;
    private javax.swing.JButton btCos;
    private javax.swing.JButton btFacto;
    private javax.swing.JButton btSen;
    private javax.swing.JButton btSqrt;
    private javax.swing.JButton btTan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbError;
    private javax.swing.JTextField tfInput;
    // End of variables declaration//GEN-END:variables
}
