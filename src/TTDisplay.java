import javax.swing.*;

public class TTDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TTDisplay");
        frame.setContentPane(new TTDisplay().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JTable table1;


}
