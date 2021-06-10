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

        buildPanel();
        add(panel);

    }

    private void buildPanel(){
        //buttons and shit
        exit = new JButton("Exit");

        //panel
        panel = new JPanel();

        //adding the components to the panel
        panel.add(exit);
    }

}