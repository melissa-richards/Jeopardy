
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_3 {
    public void C3() throws Exception {

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
        if (choice == 1) {
            String question_1 = JOptionPane.showInputDialog("What is the scientific name of the human");
            if (question_1.equalsIgnoreCase("homosapien") || question_1.equalsIgnoreCase("homo sapien")) {
                JOptionPane.showMessageDialog(null, "You are correct");
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 2) {
            String question_2 = JOptionPane.showInputDialog("What human body part stays the same size from birth");
            if (question_2.equalsIgnoreCase("eye") || question_2.equalsIgnoreCase("eyes")) {
                JOptionPane.showMessageDialog(null, "You are correct");
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 3) {
            String question_3 = JOptionPane.showInputDialog("Triskaidekaphobia is the fear of this number");
            if (question_3.equalsIgnoreCase("13")) {
                JOptionPane.showMessageDialog(null, "You are correct");
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        }
    }
}