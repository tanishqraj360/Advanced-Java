import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class AJ_5_4 {
  AJ_5_4() {
    JFrame jfrm = new JFrame("Togle Button Demo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(200, 100);

    JLabel jlab = new JLabel("Button is off");
    JToggleButton jtbn = new JToggleButton("On/Off");

    jtbn.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent ie) {
        if (jtbn.isSelected()) {
          jlab.setText("Button is On");
        } else {
          jlab.setText("Button is Off");
        }
      }
    });

    jfrm.add(jtbn);
    jfrm.add(jlab);

    jfrm.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new AJ_5_4();
      }
    });
  }
}
