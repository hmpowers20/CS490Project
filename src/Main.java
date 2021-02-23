import javax.swing.*;
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {



        parseF MyParse = new parseF();

        MyParse.File();


        MainView screen = new MainView();
        JFrame window = Window.createWindow();  // create the window JFrame
        window.add(screen);
        window.pack();


        System.out.println("ng");

    }

}