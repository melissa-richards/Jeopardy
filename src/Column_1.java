
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_1 {
    public void C1() throws Exception {

        //set varible exit to false
        boolean exit = false;
        //while exit is false keep on running the code till its true
        while (exit == false) {
            //gets user to pick a question 1 2 or 3
            String choice = (JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
            //redirect user to each question depending on thier choice and once they answer tell them if correct or incorrect then set exit to true
            if ((choice.equals("1")) || (choice.equals("one"))) {
                String question_1 = JOptionPane.showInputDialog("Name a police officers favourite snack");
                if (question_1.equalsIgnoreCase("donuts") || question_1.equalsIgnoreCase("donut")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            } 
            else if ((choice.equals("2")) || (choice.equals("two"))) {
                String question_2 = JOptionPane.showInputDialog("Name what Ms.Richards is Alergic to");
                if (question_2.equalsIgnoreCase("oranges") || question_2.equalsIgnoreCase("orange")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            } 
            else if ((choice.equals("3")) || (choice.equals("three"))) {
                String question_3 = JOptionPane.showInputDialog("Name the first coca-cola bottle color");
                if (question_3.equalsIgnoreCase("green")) {
                    JOptionPane.showMessageDialog(null, "You are correct");
                    exit = true;
                } 
                else {
                    JOptionPane.showMessageDialog(null, "You are incorrect");
                    exit = true;
                }
            } 
            //if error tell user it is an error and rerun the code
            else {
                JOptionPane.showMessageDialog(null, "ERROR");
                exit = false;
            }
        }
    }
}