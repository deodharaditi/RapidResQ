/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Util;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aditi
 */
public class Validation {

    // Function to valid Strings
    public static boolean validateStringInput(JTextField inputTextField) {

        // Check for blank inputs
        if (inputTextField.getText() == null || "".equals(inputTextField.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Input cannot be blank",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            inputTextField.setBackground(Color.RED);
            return false;
        }
        inputTextField.setBackground(Color.WHITE);
        return true;
    }

    // Function to validate Numerical inputs
    public static boolean validateNumericalInput(JTextField inputTextField, int type) {

        // Check for blank inputs
        if (inputTextField.getText() == null || "".equals(inputTextField.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Input cannot be blank",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
            inputTextField.setBackground(Color.RED);
            return false;
        } // Check for non-numerical data
        else {
            try {
                // Integer input
                if (type == 1) {
                    Integer.parseInt(inputTextField.getText());
                } // Double input
                else if (type == 2) {
                    Double.parseDouble(inputTextField.getText());
                } // Long input
                else if (type == 3) {
                    Long.parseLong(inputTextField.getText());
                }

                inputTextField.setBackground(Color.WHITE);
                return true;
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null,
                        "Please enter only numerical data for the field",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                inputTextField.setBackground(Color.RED);
                return false;
            }
        }
    }

}
