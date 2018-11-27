import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String Eingabe=JOptionPane.showInputDialog("Gib dein alter ein");
        int alter=18;

        switch(Eingabe)
        {
            case "20":
                int i=Integer.parseInt(Eingabe);
                int Ergebnis=i * alter;
                JOptionPane.showMessageDialog(null,Ergebnis);
                break;
            case "Peter Pan":
                JOptionPane.showMessageDialog(null, "Bangarang");
                break;

                default:
            System.err.println("Gib 20 oder Peter Pan ein");
            break;
        }
    }
}
