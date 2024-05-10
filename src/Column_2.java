
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_2 {
    public void C2() throws Exception {

        boolean exit = false;
        while (exit == false) {
            String choice = (JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
            if ((choice.equals("1"))||(choice.equals("one"))) {
                String question_1 = JOptionPane.showInputDialog("What language is this program coded in");
                if (question_1.equalsIgnoreCase("java")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            } 
            else if ((choice.equals("2"))||(choice.equals("two"))) {
                String question_2 = JOptionPane.showInputDialog("What is the most popular coding language acodring to number of users");
                if (question_2.equalsIgnoreCase("python")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            } 
            else if ((choice.equals("3"))||(choice.equals("three"))) {
                String question_3 = JOptionPane.showInputDialog("what was the first coding language");
                if (question_3.equalsIgnoreCase("Plankalkül")||question_3.equalsIgnoreCase("Plankalkul")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "ERROR");
                exit = false;
            }
        }
    }
}