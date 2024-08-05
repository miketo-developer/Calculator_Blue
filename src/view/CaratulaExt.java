package view;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Miketo
 */
public class CaratulaExt extends javax.swing.JFrame {

    public CaratulaExt() {
        initComponents();
        loadNumButtons();
        loadOperButtons();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlSombra = new javax.swing.JPanel();
        pnlDisplay = new javax.swing.JPanel();
        lblDisplay = new javax.swing.JLabel();
        lblOperation = new javax.swing.JLabel();
        pnlBotonera = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDelDigit = new javax.swing.JButton();
        btnDelAll = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnAns = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(102, 204, 255));

        pnlSombra.setBackground(new java.awt.Color(51, 51, 51));
        pnlSombra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pnlDisplay.setBackground(new java.awt.Color(153, 153, 0));

        lblDisplay.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        lblDisplay.setForeground(new java.awt.Color(0, 0, 0));
        lblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDisplay.setText("123456789");

        lblOperation.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        lblOperation.setForeground(new java.awt.Color(0, 0, 0));
        lblOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOperation.setText("123+456");

        javax.swing.GroupLayout pnlDisplayLayout = new javax.swing.GroupLayout(pnlDisplay);
        pnlDisplay.setLayout(pnlDisplayLayout);
        pnlDisplayLayout.setHorizontalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDisplayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOperation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        pnlDisplayLayout.setVerticalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDisplayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOperation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDisplay)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSombraLayout = new javax.swing.GroupLayout(pnlSombra);
        pnlSombra.setLayout(pnlSombraLayout);
        pnlSombraLayout.setHorizontalGroup(
            pnlSombraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSombraLayout.createSequentialGroup()
                .addComponent(pnlDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSombraLayout.setVerticalGroup(
            pnlSombraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSombraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBotonera.setOpaque(false);
        pnlBotonera.setLayout(new java.awt.GridLayout(4, 5, 10, 10));

        btn7.setBackground(new java.awt.Color(0, 0, 153));
        btn7.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn7.setFocusPainted(false);
        pnlBotonera.add(btn7);

        btn8.setBackground(new java.awt.Color(0, 0, 153));
        btn8.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn8.setFocusPainted(false);
        pnlBotonera.add(btn8);

        btn9.setBackground(new java.awt.Color(0, 0, 153));
        btn9.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn9.setFocusPainted(false);
        pnlBotonera.add(btn9);

        btnDelDigit.setBackground(new java.awt.Color(255, 51, 51));
        btnDelDigit.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnDelDigit.setForeground(new java.awt.Color(255, 255, 255));
        btnDelDigit.setText("DEL");
        btnDelDigit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        btnDelDigit.setFocusPainted(false);
        pnlBotonera.add(btnDelDigit);

        btnDelAll.setBackground(new java.awt.Color(255, 51, 51));
        btnDelAll.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnDelAll.setForeground(new java.awt.Color(255, 255, 255));
        btnDelAll.setText("AC");
        btnDelAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        btnDelAll.setFocusPainted(false);
        pnlBotonera.add(btnDelAll);

        btn4.setBackground(new java.awt.Color(0, 0, 153));
        btn4.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn4.setFocusPainted(false);
        pnlBotonera.add(btn4);

        btn5.setBackground(new java.awt.Color(0, 0, 153));
        btn5.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn5.setFocusPainted(false);
        pnlBotonera.add(btn5);

        btn6.setBackground(new java.awt.Color(0, 0, 153));
        btn6.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn6.setFocusPainted(false);
        pnlBotonera.add(btn6);

        btnMultiply.setBackground(new java.awt.Color(0, 0, 153));
        btnMultiply.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btnMultiply.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiply.setText("x");
        btnMultiply.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnMultiply.setFocusPainted(false);
        pnlBotonera.add(btnMultiply);

        btnDivide.setBackground(new java.awt.Color(0, 0, 153));
        btnDivide.setFont(new java.awt.Font("Comic Sans MS", 1, 32)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 255, 255));
        btnDivide.setText("÷");
        btnDivide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnDivide.setFocusPainted(false);
        pnlBotonera.add(btnDivide);

        btn1.setBackground(new java.awt.Color(0, 0, 153));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn1.setFocusPainted(false);
        pnlBotonera.add(btn1);

        btn2.setBackground(new java.awt.Color(0, 0, 153));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn2.setFocusPainted(false);
        pnlBotonera.add(btn2);

        btn3.setBackground(new java.awt.Color(0, 0, 153));
        btn3.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn3.setFocusPainted(false);
        pnlBotonera.add(btn3);

        btnAdd.setBackground(new java.awt.Color(0, 0, 153));
        btnAdd.setFont(new java.awt.Font("Comic Sans MS", 1, 32)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnAdd.setFocusPainted(false);
        pnlBotonera.add(btnAdd);

        btnSubtract.setBackground(new java.awt.Color(0, 0, 153));
        btnSubtract.setFont(new java.awt.Font("Comic Sans MS", 1, 32)); // NOI18N
        btnSubtract.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtract.setText("-");
        btnSubtract.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnSubtract.setFocusPainted(false);
        pnlBotonera.add(btnSubtract);

        btn0.setBackground(new java.awt.Color(0, 0, 153));
        btn0.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn0.setFocusPainted(false);
        pnlBotonera.add(btn0);

        btnPoint.setBackground(new java.awt.Color(0, 0, 153));
        btnPoint.setFont(new java.awt.Font("Comic Sans MS", 1, 32)); // NOI18N
        btnPoint.setForeground(new java.awt.Color(255, 255, 255));
        btnPoint.setText(".");
        btnPoint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnPoint.setFocusPainted(false);
        pnlBotonera.add(btnPoint);

        btnPercent.setBackground(new java.awt.Color(0, 0, 153));
        btnPercent.setFont(new java.awt.Font("Comic Sans MS", 1, 27)); // NOI18N
        btnPercent.setForeground(new java.awt.Color(255, 255, 255));
        btnPercent.setText("%");
        btnPercent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnPercent.setFocusPainted(false);
        pnlBotonera.add(btnPercent);

        btnAns.setBackground(new java.awt.Color(0, 0, 153));
        btnAns.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnAns.setForeground(new java.awt.Color(255, 255, 255));
        btnAns.setText("Ans");
        btnAns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnAns.setFocusPainted(false);
        pnlBotonera.add(btnAns);

        btnEquals.setBackground(new java.awt.Color(0, 0, 153));
        btnEquals.setFont(new java.awt.Font("Comic Sans MS", 1, 32)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 255, 255));
        btnEquals.setText("=");
        btnEquals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnEquals.setFocusPainted(false);
        pnlBotonera.add(btnEquals);

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(pnlSombra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlSombra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(pnlBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadNumButtons() {
        numButtons = new HashMap<>();
        
        numButtons.put(0, btn0);
        numButtons.put(1, btn1);
        numButtons.put(2, btn2);
        numButtons.put(3, btn3);
        numButtons.put(4, btn4);
        numButtons.put(5, btn5);
        numButtons.put(6, btn6);
        numButtons.put(7, btn7);
        numButtons.put(8, btn8);
        numButtons.put(9, btn9);
    }
    
    private void loadOperButtons() {
        opersButtons = new HashMap<>();
        
        opersButtons.put("+", btnAdd);
        opersButtons.put("-", btnSubtract);
        opersButtons.put("*", btnMultiply);
        opersButtons.put("/", btnDivide);
        opersButtons.put("=", btnEquals);
        opersButtons.put("del", btnDelDigit);
        opersButtons.put("ac", btnDelAll);
        opersButtons.put(".", btnPoint);
        opersButtons.put("per", btnPercent);
        opersButtons.put("ans", btnAns);
    }
    
    public JLabel getLblDisplay() {
        return lblDisplay;
    }

    public JLabel getLblOperation() {
        return lblOperation;
    }

    public Map<Integer, JButton> getNumButtons() {
        return numButtons;
    }

    public Map<String, JButton> getOperButtons() {
        return opersButtons;
    }
    
    private Map<Integer, javax.swing.JButton> numButtons;
    private Map<String, javax.swing.JButton> opersButtons;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAns;
    private javax.swing.JButton btnDelAll;
    private javax.swing.JButton btnDelDigit;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblOperation;
    private javax.swing.JPanel pnlBotonera;
    private javax.swing.JPanel pnlDisplay;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlSombra;
    // End of variables declaration//GEN-END:variables
}
