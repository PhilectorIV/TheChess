package Board;

import javax.swing.*;
import java.awt.*;

/**
 * Created by PhilectorIV on 12/14/14.
 */
public class PlayArea extends JPanel
{
    public PlayArea()
    {
        initChildren();
    }



    private void initChildren()
    {

        Board b = new Board(8,8);
        b.setBackground(Color.black);
        b.setSize(500, 500);
        this.add(b);

    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.pink);
        g.fillRect(0,0, 10, 800);
    }


}
