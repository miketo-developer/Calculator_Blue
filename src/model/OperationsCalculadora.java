package model;

/**
 *
 * @author Miketo
 */
public class OperationsCalculadora {
    
    public Double sum(double num1, double num2) {
        return operate("+", num1, num2);
    }
    
    public Double subtract(double num1, double num2) {
        return operate("-", num1, num2);
    }
    
    public Double multiply(double num1, double num2) {
        return operate("*", num1, num2);
    }
    
    public Double divide(double num1, double num2) {
        if (num2 != 0) {
            return operate("/", num1, num2);
        }
        
        return null;
    }
    
    public Double percent(double num) {
        return Double.valueOf(oneDigitLess(String.valueOf(num / 100)));
    }
    
    private String oneDigitLess(String str) {
        final int tam = str.length() - 1;
        int cont = 0;
        
        for (int i = tam; i > 0 && cont < 6; i--) {
            if (str.charAt(i) == '0')
                cont++;
        }
        
        if (cont >= 6)
            return str.substring(0, tam);
        
        return str;
    }
    
    private Double operate(String oper, double num1, double num2) {
        String numDouble = "0";
        
        switch (oper) {
            case "+" -> {
                numDouble  = String.valueOf(num1 + num2);
            }
            case "-" -> {
                numDouble  = String.valueOf(num1 - num2);
            }
            case "*" -> {
                numDouble  = String.valueOf(num1 * num2);
            }
            case "/" -> {
                numDouble  = String.valueOf(num1 / num2);
            }
        }
        
        //solo 15 dígitos
        //numDouble = numDouble.substring(0, 15);
        
        //String numStr = oneDigitLess(numDouble);
        
        //return new BigDecimal(numDouble).stripTrailingZeros().doubleValue();
        //return Double.valueOf(numStr);
        return Double.valueOf(oneDigitLess(numDouble));
    }
    
    private String str14(String num) {
                
        return "";
    }
}
