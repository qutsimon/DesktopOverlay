import javax.swing.*;

class DesktopOverlay{

    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable(){
         @Override
         public void run(){
            Window newWindow = new Window("hello",400,300);
            newWindow.setVisible(true);
            //This sets it to the bottom - uncomment after testing
            //newWindow.toBack();
         }   
        });
    }

}