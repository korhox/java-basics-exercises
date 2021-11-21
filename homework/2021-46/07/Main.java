
import javax.swing.*;
import java.awt.event.*;


class MyWindow extends JFrame {
    private JButton click;
    public MyWindow() {
        class Mickey implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.out.println("click");
                click.setText("clicked");
            }
        }
        click = new JButton("click");
        Mickey listener = new Mickey();
        click.addActionListener(listener);
        add(click);
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