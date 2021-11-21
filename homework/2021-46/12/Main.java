import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;

    public void doIt() {
        System.out.println("hello");
        setLocation((int) (Math.random() * (1920 + 2460 + 1920)), (int) (Math.random()*1000));
    }
    
    public void clicked(ActionEvent e) {
        System.out.println("clicked");
        click.setText("clicked");

        Thread t = new Thread(this::doIt);
        t.start();
    }

    public MyWindow() {
        click = new JButton("click");
        add(click);
        click.addActionListener(this::clicked);
    }
}

class Main {
    public static void main(String [] args) {
        MyWindow window = new MyWindow();
        window.setTitle("window");
        window.setSize(400,400);
        window.setVisible(true);
    }
}