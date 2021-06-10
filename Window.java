import java.awt.*;
import javax.swing.*;


class Window extends JFrame{

    private JPanel panel;
    private JButton exit;

    public Window(String windowName, int winWidth, int winHeight){
        super(windowName);
        
        setSize(winWidth, winHeight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setUndecorated(true);
        setOpacity(0.3f);

        setLayout(new GridBagLayout());
        
        //buttons and shit
        exit = new JButton("Exit");

        //panel
        panel = new JPanel();
        panel.add(exit);

        add(panel);

    }

}