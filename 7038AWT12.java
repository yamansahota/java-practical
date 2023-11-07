import java.awt.*;
import java.awt.event.*;

class awt1 {
    public static void main(String a[]) {
        Frame f = new Frame("Checkbox Group");
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        CheckboxGroup c = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Java", c, true);
        Checkbox c2 = new Checkbox("C++", c, false);
        Checkbox c3 = new Checkbox("C", c, false);
        Checkbox c4 = new Checkbox("MySQL", c, false);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(c4);
        f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
        System.exit(0);
        }
        });
        f.setVisible(true);
    }
}
