    // - maybe use JMenu instead for the menu bar??

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MenuBar extends JPanel{
    private LabelButton options;
    private LabelButton exit;
    private Window windowName;

    public MenuBar(Window windowName){
        super();
        this.windowName = windowName;

        //North Label Buttons
        options = new LabelButton("Options");
        exit = new LabelButton("Exit");

        setBackground(new Color(1.0f,1.0f,1.0f,0.2f));

        //registering event listners 
        exit.addActionListener(new ExitButtonListner());

        //adding the components to the panel
        add(options, BorderLayout.NORTH);
        add(exit, BorderLayout.NORTH);
    }


    /** 
     * Exit button event listner.
     * Closes window and dumps resources. 
     */
    private class ExitButtonListner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            windowName.dispose();
        }
    }

}