/**
 * Class that extends JButton to create a button without a background etc, 
 * to replicate a clickable label.
 */

import javax.swing.*;
import java.awt.*;

class LabelButton extends JButton{

    public LabelButton(String text){
        super(text);

        //stoped the changing colour on rollover - also removes focus colouring
        //some reason setfocuspainted doesn't work
        setRolloverEnabled(false);
        setFocusable(false);

        //
        setFocusPainted(false);
        setMargin(new Insets(0, 0, 0, 0));
        setContentAreaFilled(false);
        setBorderPainted(false);
        setOpaque(false);

    }

    

}