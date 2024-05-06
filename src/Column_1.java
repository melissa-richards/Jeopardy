
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_1 {
    public void Q1() throws Exception {

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
        if (choice == 1) {
            String question_1 = JOptionPane.showInputDialog("Name a police officers favourite snack");
            JOptionPane.showMessageDialog(null, question_1);
            /*String question_11 = question_1.toLowerCase();*/
            if (question_1 == "donut"){
                JOptionPane.showMessageDialog(null, "You are correct");
            }
            else if (question_1 != "donut"){
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
            else {
                JOptionPane.showMessageDialog(null, question_1);
            }
        }
        /*
        else if (choice == 2) {
            String question_2 = JOptionPane.showInputDialog("Name what Ms.Richards is Alergic to.");
            String question_22 = question_2.toLowerCase();
            if (question_22 == "oranges"){
                JOptionPane.showMessageDialog(null, "You are correct");
            }
            else if (question_22 != "oranges"){
            JOptionPane.showMessageDialog(null, "You are incorrect");
            }
            else {
            }
        }
        else if (choice == 3) {
            String question_3 = JOptionPane.showInputDialog("Name the first coca-cola bottle color.");
            String question_33 = question_3.toLowerCase();
            String answer3 = "green";
            if (question_33 == answer3){
                JOptionPane.showMessageDialog(null, "You are correct");
            }
            else if (question_33 != answer3){
            JOptionPane.showMessageDialog(null, "You are incorrect");
            }
            else {
            }
        }
*/
    }
}
