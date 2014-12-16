/**
 * Created by godawgs_philector on 12/14/14.
 */
public class AppRun {

    private static final int HEIGHT = 800;
    private static final int WIDTH = 800;

    public static void main(String args[]){

        MainWindow mw = new MainWindow("TheChess");


        mw.setSize(HEIGHT, WIDTH);
        mw.setVisible(true);
        mw.setLocationRelativeTo(null);
        mw.setResizable(false);

    }
}
