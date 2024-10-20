/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package roi;

/**
 *
 * @author leroy
 */
import javax.swing.JOptionPane; 
public class ROI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Input Vaues using shoeInputDialog
        String amountStr = JOptionPane.showInputDialog("Enter initial investment");
        String yearsStr = JOptionPane.showInputDialog("Enter the number of years:");
        String interestRateStr = JOptionPane.showInputDialog("Enter the annual intrest rate (as percsntage):");
        
        // Convert input stringg to right data type 
        double amount = Double.parseDouble(amountStr);
        int years = Integer.parseInt(yearsStr);
        double interestRate = Double.parseDouble(interestRateStr) / 100;// convert percentage into decimal
        
        // Calculate the final investment value using while loop
        int currentYear = 0;
        double finalAmount = amount;
        
        while (currentYear < years){
        finalAmount = finalAmount +(finalAmount * interestRate);
        currentYear++;
                }
        //Display the result using showMessage
        String resultMessage = String.format("Initial Investment: $%.2f\nYears: %d\nInterest Rate: %.2f%%\nFinal Amount: $%.2f", amount, years, interestRate * 100, finalAmount);
        
        JOptionPane.showMessageDialog(null, resultMessage, "Investment Calcilation Result", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
