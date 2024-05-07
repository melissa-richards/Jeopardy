import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int Column = Integer.parseInt(JOptionPane.showInputDialog("Pick a Column 1, 2, or 3"));
        if (Column == 1){
            Column_1 O1 = new Column_1();
            O1.C1();
        }
        //TEMP COMMENT OUT
        /*
        else if (Column == 2){
            Column_2 O2 = new Column_2();
            O2.C2();
        }
        else if (Column == 3){
            Column_3 O3 = new Column_3();
            O3.C3();
        
        }*/
    }
}
