import javax.swing.*;

/**
 * Created by PhilectorIV on 12/14/14.
 */
public class MainWindow extends JFrame {

    public static String Title;

    public MainWindow(String Title){
        this.Title = Title;
    }


    public static void main(String args[]){

        MainWindow mw = new MainWindow("TheChess");

        mw.setSize(800, 800);
        mw.setVisible(true);
        mw.setLocationRelativeTo(null);
        mw.setResizable(false);
        mw.setTitle(Title);
    }




}
