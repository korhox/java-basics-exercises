import javax.swing.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {
        click = new JButton("click");
        add(click);
        click.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                click.setText("Clicked");
            }
        });
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