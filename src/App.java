import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Column_1 O1 = new Column_1();
        int points11 = O1.points1;
        int points12 = O1.points2;
        int points13 = O1.points3;
        Column_2 O2 = new Column_2();
        int points21 = O2.points1;
        int points22 = O2.points2;
        int points23 = O2.points3;
        Column_3 O3 = new Column_3();
        int points31 = O3.points1;
        int points32 = O3.points2;
        int points33 = O3.points3;
        int Column = Integer.parseInt(JOptionPane.showInputDialog("Pick a Column 1, 2, or 3"));
        if (Column == 1){
            O1.C1();
            points11 = O1.points1;
            points12 = O1.points2;
            points13 = O1.points3;
            JOptionPane.showMessageDialog(null,"Points: "+ (points11 + points12 + points13 + points21 + points22 + points23 + points31 + points32 + points33));
        }
        else if (Column == 2){
            O2.C2();
            points21 = O2.points1;
            points22 = O2.points2;
            points23 = O2.points3;
            JOptionPane.showMessageDialog(null,"Points: "+ (points11 + points12 + points13 + points21 + points22 + points23 + points31 + points32 + points33));
        }
        else if (Column == 3){
            O3.C3();
            points31 = O3.points1;
            points32 = O3.points2;
            points33 = O3.points3;
            JOptionPane.showMessageDialog(null,"Points: "+ (points11 + points12 + points13 + points21 + points22 + points23 + points31 + points32 + points33));
        
        }
    }
}
