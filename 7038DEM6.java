import java.awt.*;
import java.awt.event.*;

class MouseL extends Frame {
    Button b1 = new Button("Ok");
    Button b2 = new Button("Cancel");

    MouseL() {
        this.setVisible(true);
        this.setSize(300, 450);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        setBackground(Color.gray);
        b1.addMouseListener(new InnerMouseL());
        b2.addMouseListener(new InnerMouseL());
        addWindowListener(new win());
        // pack();
    }

    public static void main(String[] args) {
        new MouseL();
    }
}

class win extends WindowAdapter
{
    public void windowClosing(java.awt.event.WindowEvent w)
    {
        System.exit(10);
    }
}

class InnerMouseL extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        System.out.println(e.getClickCount());
    }
}