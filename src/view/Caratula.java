package view;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Miketo
 */
public class Caratula extends javax.swing.JFrame {

    public Caratula() {
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
        pnlBotonera = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setBackground(new java.awt.Color(102, 204, 255));

        pnlSombra.setBackground(new java.awt.Color(51, 51, 51));

        pnlDisplay.setBackground(new java.awt.Color(153, 153, 0));

        lblDisplay.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        lblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDisplay.setText("123456789");

        javax.swing.GroupLayout pnlDisplayLayout = new javax.swing.GroupLayout(pnlDisplay);
        pnlDisplay.setLayout(pnlDisplayLayout);
        pnlDisplayLayout.setHorizontalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDisplayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlDisplayLayout.setVerticalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplayLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblDisplay)
                .addContainerGap(10, Short.MAX_VALUE))
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
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(pnlDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlBotonera.setOpaque(false);
        pnlBotonera.setLayout(new java.awt.GridLayout(4, 4, 10, 10));

        btn1.setBackground(new java.awt.Color(0, 0, 153));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn1.setFocusPainted(false);
        pnlBotonera.add(btn1);

        btn2.setBackground(new java.awt.Color(0, 0, 153));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn2.setFocusPainted(false);
        pnlBotonera.add(btn2);

        btn3.setBackground(new java.awt.Color(0, 0, 153));
        btn3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn3.setFocusPainted(false);
        pnlBotonera.add(btn3);

        btnSumar.setBackground(new java.awt.Color(0, 0, 153));
        btnSumar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(255, 255, 255));
        btnSumar.setText("+");
        btnSumar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnSumar.setFocusPainted(false);
        pnlBotonera.add(btnSumar);

        btn4.setBackground(new java.awt.Color(0, 0, 153));
        btn4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn4.setFocusPainted(false);
        pnlBotonera.add(btn4);

        btn5.setBackground(new java.awt.Color(0, 0, 153));
        btn5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn5.setFocusPainted(false);
        pnlBotonera.add(btn5);

        btn6.setBackground(new java.awt.Color(0, 0, 153));
        btn6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn6.setFocusPainted(false);
        pnlBotonera.add(btn6);

        btnRestar.setBackground(new java.awt.Color(0, 0, 153));
        btnRestar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("-");
        btnRestar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnRestar.setFocusPainted(false);
        pnlBotonera.add(btnRestar);

        btn7.setBackground(new java.awt.Color(0, 0, 153));
        btn7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn7.setFocusPainted(false);
        pnlBotonera.add(btn7);

        btn8.setBackground(new java.awt.Color(0, 0, 153));
        btn8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn8.setFocusPainted(false);
        pnlBotonera.add(btn8);

        btn9.setBackground(new java.awt.Color(0, 0, 153));
        btn9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn9.setFocusPainted(false);
        pnlBotonera.add(btn9);

        btnMultiplicar.setBackground(new java.awt.Color(0, 0, 153));
        btnMultiplicar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicar.setText("x");
        btnMultiplicar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnMultiplicar.setFocusPainted(false);
        pnlBotonera.add(btnMultiplicar);

        btnBorrar.setBackground(new java.awt.Color(0, 0, 153));
        btnBorrar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("C");
        btnBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnBorrar.setFocusPainted(false);
        pnlBotonera.add(btnBorrar);

        btn0.setBackground(new java.awt.Color(0, 0, 153));
        btn0.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btn0.setFocusPainted(false);
        pnlBotonera.add(btn0);

        btnIgual.setBackground(new java.awt.Color(0, 0, 153));
        btnIgual.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnIgual.setFocusPainted(false);
        pnlBotonera.add(btnIgual);

        btnDividir.setBackground(new java.awt.Color(0, 0, 153));
        btnDividir.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(255, 255, 255));
        btnDividir.setText("÷");
        btnDividir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        btnDividir.setFocusPainted(false);
        pnlBotonera.add(btnDividir);

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlSombra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnlSombra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        opersButtons.put("+", btnSumar);
        opersButtons.put("-", btnRestar);
        opersButtons.put("*", btnMultiplicar);
        opersButtons.put("/", btnDividir);
        opersButtons.put("=", btnIgual);
        opersButtons.put("c", btnBorrar);
    }
    
    public JLabel getLblDisplay() {
        return lblDisplay;
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
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JPanel pnlBotonera;
    private javax.swing.JPanel pnlDisplay;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlSombra;
    // End of variables declaration//GEN-END:variables
}
