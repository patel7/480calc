package pkg480calculator;
import java.util.*;
import java.math.*;

public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TextPane = new javax.swing.JTextPane();
        button2 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        add = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        openParenthesis = new javax.swing.JButton();
        closeParenthesis = new javax.swing.JButton();
        power = new javax.swing.JButton();
        evaluate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(TextPane);
        TextPane.setEditable(false);

        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button7.setText("7");
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setText("8");
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        button9.setText("9");
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        subtract.setText("-");
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        openParenthesis.setText("(");
        openParenthesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openParenthesisActionPerformed(evt);
            }
        });

        closeParenthesis.setText(")");
        closeParenthesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeParenthesisActionPerformed(evt);
            }
        });

        power.setText("^");
        power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerActionPerformed(evt);
            }
        });

        evaluate.setText("=");
        evaluate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluateActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button1)
                            .addComponent(button4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(multiply)
                                    .addComponent(button7))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(openParenthesis)
                                    .addComponent(divide)))
                            .addComponent(clear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(closeParenthesis)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(add)
                                        .addGap(51, 51, 51)
                                        .addComponent(subtract)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(power))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(evaluate)
                                    .addComponent(button2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(button3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button0)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(multiply)
                    .addComponent(divide)
                    .addComponent(add)
                    .addComponent(subtract)
                    .addComponent(power))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button7)
                    .addComponent(button8)
                    .addComponent(button9)
                    .addComponent(openParenthesis)
                    .addComponent(closeParenthesis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button4)
                    .addComponent(button5)
                    .addComponent(button6))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1)
                    .addComponent(button2)
                    .addComponent(button3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evaluate)
                    .addComponent(clear)
                    .addComponent(Button0))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        TextPane.setText(TextPane.getText() + "1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        TextPane.setText(TextPane.getText() + "2");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        TextPane.setText(TextPane.getText() + "3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        TextPane.setText(TextPane.getText() + "4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        TextPane.setText(TextPane.getText() + "5");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        TextPane.setText(TextPane.getText() + "6");
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        TextPane.setText(TextPane.getText() + "7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        TextPane.setText(TextPane.getText() + "8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        TextPane.setText(TextPane.getText() + "9");
    }//GEN-LAST:event_button9ActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        if(TextPane.getText().equals("") || TextPane.getText().substring(TextPane.getText().length()-1).equals("(")) {
            // no change
        } else if(isOperator(TextPane.getText().substring(TextPane.getText().length()-1))) {
            TextPane.setText(TextPane.getText().substring(0,TextPane.getText().length()-1));
            TextPane.setText(TextPane.getText() + "*");
        } else {
            TextPane.setText(TextPane.getText() + "*");
        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        if(TextPane.getText().equals("") || TextPane.getText().substring(TextPane.getText().length()-1).equals("(")) {
            // no change
        } else if(isOperator(TextPane.getText().substring(TextPane.getText().length()-1))) {
            TextPane.setText(TextPane.getText().substring(0,TextPane.getText().length()-1));
            TextPane.setText(TextPane.getText() + "/");
        } else {
            TextPane.setText(TextPane.getText() + "/");
        }
    }//GEN-LAST:event_divideActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(TextPane.getText().equals("") || TextPane.getText().substring(TextPane.getText().length()-1).equals("(")) {
            // no change
        } else if(isOperator(TextPane.getText().substring(TextPane.getText().length()-1))) {
            TextPane.setText(TextPane.getText().substring(0,TextPane.getText().length()-1));
            TextPane.setText(TextPane.getText() + "+");
        } else {
            TextPane.setText(TextPane.getText() + "+");
        }
    }//GEN-LAST:event_addActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        if(TextPane.getText().equals("") || TextPane.getText().substring(TextPane.getText().length()-1).equals("(")) {
            // no change
        } else if(isOperator(TextPane.getText().substring(TextPane.getText().length()-1))) {
            TextPane.setText(TextPane.getText().substring(0,TextPane.getText().length()-1));
            TextPane.setText(TextPane.getText() + "-");
        } else {
            TextPane.setText(TextPane.getText() + "-");
        }
    }//GEN-LAST:event_subtractActionPerformed

    private void powerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerActionPerformed
        if(TextPane.getText().equals("") || TextPane.getText().substring(TextPane.getText().length()-1).equals("(")) {
            // no change
        } else if(isOperator(TextPane.getText().substring(TextPane.getText().length()-1))) {
            TextPane.setText(TextPane.getText().substring(0,TextPane.getText().length()-1));
            TextPane.setText(TextPane.getText() + "^");
        } else {
            TextPane.setText(TextPane.getText() + "^");
        }
    }//GEN-LAST:event_powerActionPerformed

    private void openParenthesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openParenthesisActionPerformed
        TextPane.setText(TextPane.getText() + "(");
    }//GEN-LAST:event_openParenthesisActionPerformed

    private void closeParenthesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeParenthesisActionPerformed
        if(TextPane.getText().equals("") || TextPane.getText().substring(TextPane.getText().length()-1).equals("(") || isOperator(TextPane.getText().substring(TextPane.getText().length()-1))) {
            // no change
        } else {
            TextPane.setText(TextPane.getText() + ")");
        }
    }//GEN-LAST:event_closeParenthesisActionPerformed

    private void evaluateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluateActionPerformed
        // Test for ending with an operator or bad parentheses
        boolean valid = true;
        if(isOperator(TextPane.getText().substring(TextPane.getText().length()-1))) {
            valid = false;
        }
        int p = 0;
        for(int i = 0; i < TextPane.getText().length(); i++) {
            if(TextPane.getText().charAt(i) == '(') {
                // add one for (
                p++;
            } else if(TextPane.getText().charAt(i) == ')') {
                // subtract one for )
                p--;
            }
            if(p < 0) {
                // if ever goes negative, more closes than opens, error
                valid = false;
                break;
            }
        }
        // if total numbers don't line up, error
        if(p != 0) {
            valid = false;
        }
        
        if(TextPane.getText().charAt(0) == 'S') {
            valid = false;
        }
        
        if(valid) {
            Stack<String> s = new Stack<String>();
            Stack<String> e = new Stack<String>();
            LinkedList<String> q = new LinkedList<String>();
            for(int i = 0; i < TextPane.getText().length(); i++) {
                int j = 0;
                while((i+j+1 <= TextPane.getText().length()) && !isOperator(TextPane.getText().substring(i+j,i+j+1)) && !isParen(TextPane.getText().substring(i+j,i+j+1)) && !isParen(TextPane.getText().substring(i+j,i+j+1))) {
                    j++;
                }
                if(j > 0) {
                    // If not the first number and after a closing paren, add a multiplication symbol
                    if(i != 0 && TextPane.getText().substring(i-1,i).equals(")")) {
                        s.push("*");
                    }
                    q.add(TextPane.getText().substring(i,i+j));
                    i=i+j-1;
                } else if(TextPane.getText().substring(i,i+1).equals("(")) {
                    // If opening paren, just toss on stack
                    if(i == 0) {
                        
                    } else if(s.isEmpty()) {
                        s.push("*");
                    } else if(!isOperator(TextPane.getText().substring(i-1,i)) && !TextPane.getText().substring(i-1,i).equals("(")){
                        s.push("*");
                    }
                    s.push(TextPane.getText().substring(i,i+1));
                } else if(TextPane.getText().substring(i,i+1).equals(")")) {
                    // If closing paren, throw into queue until right before opening paren, then toss opening paren
                    while(!s.isEmpty() && !(s.peek().equals("("))) {
                        q.add(s.pop());
                    }
                    s.pop();
                } else if(isOperator(TextPane.getText().substring(i,i+1))) {
                    // If an operator, move stuff to extra stack while stuff on stack has higher precedence than current
                    while(!s.isEmpty() && !isParen(s.peek()) && (precedence(s.peek()) > precedence(TextPane.getText().substring(i,i+1)))) {
                        e.push(s.pop());
                    }
                    // Then push new operator
                    s.push(TextPane.getText().substring(i,i+1));
                    // Then move things back to main stack
                    while(!e.isEmpty()) {
                        s.push(e.pop());
                    }
                } 
            }
            while(!s.isEmpty()) {
                q.add(s.pop());
            }
            
            /*
            LinkedList<String> copy = new LinkedList<String>(q);
            // Console output postfix for debugging
            while(!copy.isEmpty()) {
                System.out.print(copy.remove() + " ");
            }
            */
            
            String num1;
            String num2;
            double n1,n2;
            double result = 0;
            String oprnd;
            while(!q.isEmpty()) {
                while(!q.isEmpty() && !isOperator(q.peek()) && !isParen(q.peek())) {
                    s.push(q.remove());
                }
                oprnd = q.remove();
                num2 = s.pop();
                num1 = s.pop();
                n1 = Double.parseDouble(num1);
                n2 = Double.parseDouble(num2);
                if(oprnd.equals("+")) {
                    result = n1 + n2;
                } else if(oprnd.equals("-")) {
                    result = n1 - n2;
                } else if(oprnd.equals("*")) {
                    result = n1 * n2;
                } else if(oprnd.equals("/")) {
                    result = n1 / n2;
                } else if(oprnd.equals("^")) {
                    result = Math.pow(n1, n2);
                }
                s.push("" + result);
            }
            TextPane.setText(s.pop());
        } else {
            TextPane.setText("SYNTAX ERROR");
        }
    }//GEN-LAST:event_evaluateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        TextPane.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        TextPane.setText(TextPane.getText() + "0");
    }//GEN-LAST:event_Button0ActionPerformed

    private boolean isOperator(String input) {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/") || input.equals("^");
    }
    
    private boolean isParen(String input) {
        return input.equals("(") || input.equals(")");
    }
    
    // 3 for ^, 2 for * and /, 1 for + and -
    private int precedence(String input) {
        if(input.equals("+") || input.equals("-")) {
            return 1;
        } else if(input.equals("*") || input.equals("/")) {
            return 2;
        } else {
            return 3;
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JTextPane TextPane;
    private javax.swing.JButton add;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton clear;
    private javax.swing.JButton closeParenthesis;
    private javax.swing.JButton divide;
    private javax.swing.JButton evaluate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiply;
    private javax.swing.JButton openParenthesis;
    private javax.swing.JButton power;
    private javax.swing.JButton subtract;
    // End of variables declaration//GEN-END:variables
}
