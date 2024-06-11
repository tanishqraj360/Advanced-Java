import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class AJ_5_1 {
  AJ_5_1() {
    JFrame jfrm = new JFrame("A Simple Swing Application");
    jfrm.setSize(275, 100);
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel jlab = new JLabel(" Swing means powerful GUIs. ");
    jfrm.add(jlab);
    jfrm.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new AJ_5_1();
      }
    });
  }
}
