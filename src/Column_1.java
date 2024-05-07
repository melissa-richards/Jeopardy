
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_1 {
    public void C1() throws Exception {

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
        if (choice == 1) {
            String question_1 = JOptionPane.showInputDialog("Name a police officers favourite snack");
            if (question_1.equalsIgnoreCase("donuts")) {
                JOptionPane.showMessageDialog(null, "You are correct");
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 2) {
            String question_2 = JOptionPane.showInputDialog("Name what Ms.Richards is Alergic to");
            if (question_2.equalsIgnoreCase("oranges")) {
                JOptionPane.showMessageDialog(null, "You are correct");
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 3) {
            String question_3 = JOptionPane.showInputDialog("Name the first coca-cola bottle color.");
            if (question_3.equalsIgnoreCase("green")) {
                JOptionPane.showMessageDialog(null, "You are correct");
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        }
    }
}