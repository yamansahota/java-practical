import java.awt.*;

class awt2 {
    public static void main(String[] args) {
        Frame f = new Frame("Frame");
        List l= new List(4, false);
        l.add("Java");
        l.add("Java");
        l.add("Java");
        l.add("Java");
        f.setSize(400,400);
        f.add(l);
        f.setVisible(true);

    }
}
