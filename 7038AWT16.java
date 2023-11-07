import java.awt.*;

class awt3 {
    public static void main(String[] args) {
        Frame f = new Frame("Frame");
        TextArea t= new TextArea(20, 20);
        f.setSize(400,400);
        f.add(t);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
