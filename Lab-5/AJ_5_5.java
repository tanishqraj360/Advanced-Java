import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AJ_5_5 {
  AJ_5_5() {
    JFrame f = new JFrame("Checkbox Example");
    final JLabel label = new JLabel();
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setSize(400, 100);

    JCheckBox checkbox1 = new JCheckBox("C++");
    checkbox1.setBounds(150, 100, 50, 50);
    JCheckBox checkbox2 = new JCheckBox("Java");
    checkbox2.setBounds(150, 150, 50, 50);

    f.add(checkbox1);
    f.add(checkbox2);
    f.add(label);

    checkbox1.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent ie) {
        label.setText("C++ Checkbox: " + (ie.getStateChange() == 1 ? "checked" : "unchecked"));
      }
    });

    checkbox2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent ie) {
        label.setText("Java Checkbox: " + (ie.getStateChange() == 1 ? "checked" : "unchecked"));
      }
    });

    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
  }

  public static void main(String[] args) {
    new AJ_5_5();
  }
}
