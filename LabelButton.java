/**
 * Class that extends JButton to create a button without a background etc, 
 * to replicate a clickable label.
 */

import javax.swing.*;

class LabelButton extends JButton{

    public LabelButton(String text){
        super(text);

        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setOpaque(false);
    }


}