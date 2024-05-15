
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_1 {
    public int points1 = 0;
    public int points2 = 0;
    public int points3 = 0;

    public void C1() throws Exception {

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
        if (choice == 1) {
            String question_1 = JOptionPane.showInputDialog("Name a police officers favourite snack");
            if (question_1.equalsIgnoreCase("donuts")||question_1.equalsIgnoreCase("donut")) {
                JOptionPane.showMessageDialog(null, "You are correct");
                points1 = 1;
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 2) {
            String question_2 = JOptionPane.showInputDialog("Name what Ms.Richards is Alergic to");
            if (question_2.equalsIgnoreCase("oranges")||question_2.equalsIgnoreCase("orange")) {
                JOptionPane.showMessageDialog(null, "You are correct");
                points2 = 2;
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 3) {
            String question_3 = JOptionPane.showInputDialog("Name the first coca-cola bottle color.");
            if (question_3.equalsIgnoreCase("green")) {
                JOptionPane.showMessageDialog(null, "You are correct");
                points3 = 3;
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        }
    }
}