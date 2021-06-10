import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import java.awt.event.*;


class Window extends JFrame{

    private JPanel panel;
    private LabelButton exit;

    public Window(String windowName, int winWidth, int winHeight){
        super(windowName);
        
        setSize(winWidth, winHeight);
        setLocationRelativeTo(null);

        setUndecorated(true);
        setOpacity(0.3f);

        setLayout(new GridBagLayout());

        buildPanel();
        add(panel);

    }

    private void buildPanel(){

        //buttons and shit
        exit = new LabelButton("Exit");

        exit.setBorderPainted(false);

        //panel
        panel = new JPanel();

        //registering event listners 
        exit.addActionListener(new ExitButtonListner());

        //adding the components to the panel
        panel.add(exit);
    }

    /** 
     * Exit button event listner.
     * Closes window and dumps resources. 1
     */
    private class ExitButtonListner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
        }
    }

}