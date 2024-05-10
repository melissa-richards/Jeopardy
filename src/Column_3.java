
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_3 {
    public void C3() throws Exception {

        boolean exit = false;
        while (exit == false) {
            String choice = (JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
            if ((choice.equals("1"))||(choice.equals("one"))) {
                String question_1 = JOptionPane.showInputDialog("What is the scientific name of the human");
                if (question_1.equalsIgnoreCase("homosapien") || question_1.equalsIgnoreCase("homo sapien")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            } 
            else if ((choice.equals("2"))||(choice.equals("two"))) {
                String question_2 = JOptionPane.showInputDialog("What human body part stays the same size from birth");
                if (question_2.equalsIgnoreCase("eye") || question_2.equalsIgnoreCase("eyes")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            } 
            else if ((choice.equals("3"))||(choice.equals("three"))) {
                String question_3 = JOptionPane.showInputDialog("Triskaidekaphobia is the fear of this number");
                if (question_3.equalsIgnoreCase("13")||question_3.equalsIgnoreCase("thirteen")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "ERROR");
                exit = false;
            }
        }
    }
}