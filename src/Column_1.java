
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_1 {
    public void Q1() throws Exception {

        // get user input if statement is true or false
        int result_1 = JOptionPane.showConfirmDialog(null, "A Circle is a shape, Yes or No",
                "True Or False", JOptionPane.YES_NO_OPTION);
        // if user is correct go to next question and repeat untill all 3 is correct
        if (result_1 == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, ("You are correct"));
            // question 2
            int result_2 = JOptionPane.showConfirmDialog(null, "You can eat a apple, Yes or No",
                    "True Or False", JOptionPane.YES_NO_OPTION);
            if (result_2 == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, ("You are correct"));
                // question 3
                int result_3 = JOptionPane.showConfirmDialog(null,
                        "Coal and diamond are made of diffrent elements, Yes or No",
                        "True Or False", JOptionPane.YES_NO_OPTION);
                if (result_3 == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, ("You are incorrect"));
                } else if (result_3 == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, ("You are correct"));
                } else {
                }
            } else if (result_2 == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, ("You are incorrect"));
            } else {
            }
        }
        // if user is incorrect repeat question
        else if (result_1 == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, ("You are incorrect"));
        }
        // allows user to press x to exit
        else {
        }
    }
}
