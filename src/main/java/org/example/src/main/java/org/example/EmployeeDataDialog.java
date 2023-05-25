package org.example;
import javax.swing.*;



public class EmployeeDataDialog extends JDialog {

    private boolean dialogResult = false;
    private String[] employeeData = null;

    public EmployeeDataDialog(JFrame parentFrame) {
        super(parentFrame, "Update Employee", true);

        JTextField lastNameField = new JTextField();
        JTextField firstNameField = new JTextField();
        JTextField sssField = new JTextField();
        JTextField philHealthField = new JTextField();
        JTextField tinField = new JTextField();
        JTextField pagibigField = new JTextField();

        Object[] fields = {
                "Last Name:", lastNameField,
                "First Name:", firstNameField,
                "SSS No.:", sssField,
                "PhilHealth No.:", philHealthField,
                "TIN:", tinField,
                "Pagibig No.:", pagibigField
        };

        int option = JOptionPane.showConfirmDialog(this, fields, "Update Employee", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            
            String lastName = lastNameField.getText();
            String firstName = firstNameField.getText();
            String sss = sssField.getText();
            String philHealth = philHealthField.getText();
            String tin = tinField.getText();
            String pagibig = pagibigField.getText();

            // Store the employee data
            employeeData = new String[]{lastName, firstName, sss, philHealth, tin, pagibig};

            
            dialogResult = true;

           
            dispose();
        } else {
            // User canceled the update operation
            dispose();
        }
    }

    public boolean showDialog() {
        return dialogResult;
    }

    public String[] getEmployeeData() {
        return employeeData;
    }
}
