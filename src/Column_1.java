
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_1 {
    public void Q1() throws Exception {

        String question_1 = JOptionPane.showInputDialog("Type all in lowercase");
        String question_11 = question_1.toLowerCase();
        String answer1 = "A";
        if (question_11 == answer1){
            JOptionPane.showMessageDialog(null, "You are correct");
        }
        else {
        JOptionPane.showMessageDialog(null, "You are incorrect");
        }

    }
}
