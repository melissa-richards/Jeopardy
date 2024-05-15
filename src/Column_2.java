
//imports
import javax.swing.JOptionPane;

//This is the entire program
public class Column_2 {
    public int points1 = 0;
    public int points2 = 0;
    public int points3 = 0;

    public void C2() throws Exception {

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Pick a quesiton 1, 2, or 3"));
        if (choice == 1) {
            String question_1 = JOptionPane.showInputDialog("What language is this program coded in ");
            if (question_1.equalsIgnoreCase("java")) {
                JOptionPane.showMessageDialog(null, "You are correct");
                points1 = 1;
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 2) {
            String question_2 = JOptionPane.showInputDialog("What is the most popular coding language acodring to number of users");
            if (question_2.equalsIgnoreCase("python")) {
                JOptionPane.showMessageDialog(null, "You are correct");
                points2 = 2;
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        } 
        else if (choice == 3) {
            String question_3 = JOptionPane.showInputDialog("what was the fiurst coding language");
            if (question_3.equalsIgnoreCase("Plankalkül")) {
                JOptionPane.showMessageDialog(null, "You are correct");
                points3 = 3;
            } 
            else {
                JOptionPane.showMessageDialog(null, "You are incorrect");
            }
        }
    }
}