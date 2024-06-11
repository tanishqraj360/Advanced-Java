import java.awt.Button;
import java.awt.Frame;

public class AJ_4_3 extends Frame {
  AJ_4_3() {
    Button b = new Button("Click Here");
    b.setBounds(20, 100, 80, 85);
    setSize(400, 400);
    setLayout(null);
    setVisible(true);
    add(b);
  }

  public static void main(String[] args) {
    AJ_4_3 sa = new AJ_4_3();
  }
}
