package jpacontroller.exceptions;

import javax.swing.JOptionPane;

public class NullValueFieldException extends Exception {
    public NullValueFieldException(String message, Throwable cause) {
        super(message, cause);
    }
    public NullValueFieldException(String message) {
        super(message);
        
        JOptionPane.showMessageDialog(null, message, "Champs obligatoire manquant",
				JOptionPane.ERROR_MESSAGE);
    }
}
