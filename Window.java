import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

import java.awt.event.*;


class Window extends JFrame{

    private JPanel panel;
    private LabelButton weather;
    private LabelButton calendar;
    private LabelButton reddit;
    private LabelButton options;
    private LabelButton exit;


    public Window(String windowName, int winWidth, int winHeight){
        super(windowName);
        
        setSize(winWidth, winHeight);
        setLocationRelativeTo(null);

        setUndecorated(true);
        setBackground(new Color(1.0f,1.0f,1.0f,0.2f));
        //setOpacity(0.3f);

        //removes taskbar
        setFocusableWindowState(false);

        //should move the main container to its own class
        buildPanel();
        add(panel);

    }

    // - These labelbutton objects should be later moved in a menu/tool bar feature
    // - Should also decide on layout type
    private void buildPanel(){

        //North Label Buttons
        calendar = new LabelButton("Calendar");
        weather = new LabelButton("Weather");
        reddit = new LabelButton("Reddit");
        options = new LabelButton("Options");
        exit = new LabelButton("Exit");
        
        //panel
        panel = new JPanel();

        panel.setBackground(new Color(1.0f,1.0f,1.0f,0.2f));

        //registering event listners 
        exit.addActionListener(new ExitButtonListner());

        //adding the components to the panel
        panel.add(calendar, BorderLayout.NORTH);
        panel.add(weather, BorderLayout.NORTH);
        panel.add(reddit, BorderLayout.NORTH);
        panel.add(options, BorderLayout.NORTH);
        panel.add(exit, BorderLayout.NORTH);
    
    }

    /** 
     * Exit button event listner.
     * Closes window and dumps resources. 
     */
    private class ExitButtonListner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
        }
    }

   

}