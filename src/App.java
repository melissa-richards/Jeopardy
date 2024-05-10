import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int play = JOptionPane.showConfirmDialog(null, "Do you want to play JEOPRDY",
            "True Or False", JOptionPane.YES_NO_OPTION);
        if (play == JOptionPane.YES_OPTION){
            while (play == JOptionPane.YES_OPTION) {
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
                else{
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}