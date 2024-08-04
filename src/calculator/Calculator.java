package calculator;

import controller.ControlCalculadora;
import model.OperationsCalculadora;
import view.CaratulaExt;

/**
 *
 * @author Miketo
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperationsCalculadora modelOpers = new OperationsCalculadora();
        CaratulaExt viewCaratula = new CaratulaExt();
        //Caratula viewCaratula = new Caratula();
        ControlCalculadora control = new ControlCalculadora(viewCaratula, modelOpers);
        
        control.addEvents();
        
        viewCaratula.setLocationRelativeTo(null);
        viewCaratula.setVisible(true);
    }
    
}
