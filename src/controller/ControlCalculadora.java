package controller;

import java.util.Map;
import javax.swing.JButton;
import model.OperationsCalculadora;
import view.CaratulaExt;

/**
 *
 * @author Miketo
 */
public class ControlCalculadora {
    private final CaratulaExt caratula;
    private final OperationsCalculadora opers;
    private double num1;
    private double ans;
    private String signoOper;
    private final Map<Integer, JButton> numButtons;
    private final Map<String, JButton> operButtons;

    public ControlCalculadora(CaratulaExt caratula, OperationsCalculadora opers) {
        this.caratula = caratula;
        this.opers = opers;
        caratula.getLblOperation().setText("0");
        caratula.getLblDisplay().setText("0");
        
        ans = 0;
        numButtons = caratula.getNumButtons();
        operButtons = caratula.getOperButtons();
    }
    
    public void addEvents() {
        for (Map.Entry<Integer, JButton> entry : numButtons.entrySet()) {
            String numStr = String.valueOf(entry.getKey());
            JButton button = entry.getValue();
            
            button.addActionListener(v -> {
                concatenateNumbers(numStr);
            });
        }
        
        /*
        "+", btnAdd
        "-", btnSubtract
        "*", btnMultiply
        "/", btnDivide
        "=", btnEquals
        "del", btnDelDigit
        "ac", btnDelAll
        ".", btnPoint
        "per", btnPercent
        "ans", btnAns
        */
        operButtons.get("+").addActionListener(v -> applyOperation("+"));
        operButtons.get("-").addActionListener(v -> applyOperation("-"));
        operButtons.get("*").addActionListener(v -> applyOperation("*"));
        operButtons.get("/").addActionListener(v -> applyOperation("/"));
        operButtons.get("=").addActionListener(v -> btnEquals());
        operButtons.get("del").addActionListener(v -> deleteDigit());
        operButtons.get("ac").addActionListener(v -> reset());
        operButtons.get(".").addActionListener(v -> addPoint());
        operButtons.get("per").addActionListener(v -> calcPercent());
        operButtons.get("ans").addActionListener(v -> getAns());
    }
    
    private void concatenateNumbers(String num) {
        String cadDisplay = caratula.getLblDisplay().getText();
        
        if (cadDisplay.equals("0") || !Character.isDigit(cadDisplay.charAt(0))) {
            cadDisplay = "";
        }
        
        caratula.getLblDisplay().setText(cadDisplay + num);
        
        String text = this.caratula.getLblOperation().getText();
        if (!text.equals("0") && !text.contains(signoOper))
            this.caratula.getLblOperation().setText(text + " " + signoOper);
    }
    
    private void applyOperation(String signo) {
        //set sign
        String strDisplay = caratula.getLblDisplay().getText();
        caratula.getLblDisplay().setText(signo);
        this.signoOper = signo;
        
        if (!Character.isDigit(strDisplay.charAt(0))) {
            return;
        }
        
        //Save the first number
        this.num1 = Double.parseDouble(strDisplay);
        caratula.getLblOperation().setText(intOrDouble(num1));
    }
    
    private void btnEquals() {
        String strDisplay = caratula.getLblDisplay().getText();
        //si no hay caracteres tal, se puede hacer operaciones
        //if (cadDisplay.equals("0") || cadDisplay.charAt(0)=='=')
        if (strDisplay.charAt(0)=='=')
            return;
        
        System.out.println("Ando aquí");
        double num2 = 0;
        double result = 0;
        
        //intenta parsear el segundo número
        try {
          num2 = Double.parseDouble(strDisplay);  
        } catch (NumberFormatException e) {
            //System.out.println("No es parseable. " + e);
        }
        
        //Efectuar la operación elegida
        switch (signoOper) {
            case "+" -> result = opers.sum(num1, num2);
            case "-" -> result = opers.subtract(num1, num2);
            case "*" -> result = opers.multiply(num1, num2);
            case "/" -> {
                Double division = opers.divide(num1, num2);
                
                if (division == null) {
                    caratula.getLblDisplay().setText("Syntax Error");
                    return;
                }
                
                result = division;
            }
        }
        
        //setea etiqueta operaciones
        caratula.getLblOperation().setText(intOrDouble(num1) + " " + signoOper + " " + intOrDouble(num2));
        ans = result;    //resguardar resultado
        
        caratula.getLblDisplay().setText("= " + intOrDouble(result));
    }
    
    private String intOrDouble(double num) {
        if ((int) num == num) 
            return String.valueOf((int)num);
        
        return String.valueOf(num);
    }
    
    private void deleteDigit() {
        String strDisplay = caratula.getLblDisplay().getText();
        
        if (strDisplay.equals("0") || !Character.isDigit(strDisplay.charAt(0)))
            return;
        
        if (strDisplay.length() == 1) {
            caratula.getLblDisplay().setText("0");
            return;
        }
        
        caratula.getLblDisplay().setText(strDisplay.substring(0, strDisplay.length()-1));
    }
    
    private void reset() {
        caratula.getLblDisplay().setText("0");
        caratula.getLblOperation().setText("0");
        this.signoOper = "+";
        this.num1 = 0;
    }
    
    private void addPoint() {
        String strDisplay = caratula.getLblDisplay().getText();
        
        if (strDisplay.contains(".") || !Character.isDigit(strDisplay.charAt(0)))
            return;
        
        caratula.getLblDisplay().setText(strDisplay + ".");
    }
    
    private void calcPercent() {
        String strDisplay = caratula.getLblDisplay().getText();
        double num = 0;
        
        try {
          num = Double.parseDouble(strDisplay);  
        } catch (NumberFormatException e) {
            //System.out.println("No es parseable. " + e);
        } 
        
        num = opers.percent(num);
        
        caratula.getLblDisplay().setText(String.valueOf(num));
    }
    
    private void getAns() {
        String strDisplay = caratula.getLblDisplay().getText();
        //si no hay caracteres tal, se puede hacer operaciones
//        if (strDisplay.charAt(0)=='=')
//            return;
        
        if (strDisplay.charAt(0)=='0' || !Character.isDigit(strDisplay.charAt(0))) {
            caratula.getLblDisplay().setText(String.valueOf(intOrDouble(ans)));
        }
    }
}
