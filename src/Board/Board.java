package Board;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by brianbenavides on 12/9/14.
 */
public class Board {

    private Space[][] boardSpaces;
    private int boardRows;
    private int boardColumns;

    public Board(int rows, int columns)
    {
        boardSpaces = new Space[rows][columns];
        initializeBoard(rows, columns);
    }

    private void  initializeBoard(int x, int y)
    {
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                boardSpaces[i][j] = new Space(x, y);
            }
        }
    }

    public Space getSpaceAt(int row, int column)
    {
        if(row > boardRows || column > boardColumns)
        {//Possibly throw custom exception
            return null;
        }
        else
        {
            return boardSpaces[row][column];
        }
    }

}

