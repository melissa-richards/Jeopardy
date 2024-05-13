//import
import javax.swing.JOptionPane;
public class App {
    //main class
    public static void main(String[] args) throws Exception {
        //askes user if they want to play jeoprdy and if they do run the code else exit the code
        int play = JOptionPane.showConfirmDialog(null, "Do you want to play JEOPRDY",
            "True Or False", JOptionPane.YES_NO_OPTION);
        if (play == JOptionPane.YES_OPTION){
            // while they keep wanting to play keep on running the code
            while (play == JOptionPane.YES_OPTION) {
                //ask them what coloumn they want to choose for quesitons and direct them to each class depending on thier answers
                String Column = (JOptionPane.showInputDialog("Pick a Column 1, 2, or 3"));
                if ((Column.equals("1"))||(Column.equals("one"))){
                    Column_1 O1 = new Column_1();
                    O1.C1();
                }
                else if ((Column.equals("2"))||(Column.equals("two"))){
                    Column_2 O2 = new Column_2();
                    O2.C2();
                }
                else if ((Column.equals("3"))||(Column.equals("three"))){
                    Column_3 O3 = new Column_3();
                    O3.C3();                
                }
                //if it is an error tell the user and rerun the code
                else{
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            }
        }
    }
}