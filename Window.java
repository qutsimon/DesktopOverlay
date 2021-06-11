import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Window extends JFrame{

    private JPanel panel;
    private MenuBar menu;


    public Window(String windowName, int winWidth, int winHeight){
        super(windowName);
        
        setSize(winWidth, winHeight);
        setLocationRelativeTo(null);

        setUndecorated(true);
        setBackground(new Color(1.0f,1.0f,1.0f,0.2f));
        //setOpacity(0.3f);

        //removes taskbar
        setFocusableWindowState(false);

        //top menu bar panel
        menu = new MenuBar(this);
        add(menu);

    }


   

}