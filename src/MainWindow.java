import Board.PlayArea;

import javax.swing.*;
import java.awt.*;

/**
 * Created by PhilectorIV on 12/14/14.
 */
public class MainWindow extends JFrame
{
    public MainWindow(String title)
    {
        this.setTitle(title);
        this.getContentPane().setLayout(new BorderLayout());
        initChildren();
    }

    private void initChildren()
    {

        PlayArea pa = new PlayArea();
        pa.setSize(620, 800);
        //this.getContentPane().add(pa);
        this.getContentPane().add(pa, BorderLayout.WEST);


//        PlayArea pa2 = new PlayArea();
//        pa2.setSize(300,500);
//        this.getContentPane().add(pa2).setLocation(0,0);

        //GameControl gc = new GameControl();
        //this.getContentPane().add(gc, BorderLayout.EAST);
    }
}
