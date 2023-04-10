package finalProject.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClearFieldButtonListener implements ActionListener {
    private JTextField inputField;

    public ClearFieldButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    public void actionPerformed (ActionEvent e) {
        inputField.setText("");
    }
}
