import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class Window {
    /**
     * Creates a window with desired attributes.
     * @return JFrame representing our window.
     */


    public static JFrame createWindow() throws FileNotFoundException, InterruptedException {
        JFrame window = new JFrame("Phase 1");   // create the window JFrame
        JPanel panel = new JPanel();
        JButton startButton = new JButton("Start System");
        JButton pauseButton = new JButton("Pause System");
        panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "Waiting Process Queue", TitledBorder.CENTER, TitledBorder.TOP));
        String[] colNames = {"Process Name", "Service Time"};

        String[][] data;
        data = new String[][]{
                {"Process B", "14"},
                {"Process B", "14"},
                {"Process C", "4"},
        };
        JTable table = new JTable(data,colNames);
        panel.add(new JScrollPane(table));
        window.add(panel);
        window.setSize(550,400);





        window.setResizable(true);
        window.setLayout(new FlowLayout());
        window.setVisible(true);
        table.setVisible(true);
        window.add(startButton);
        window.add(pauseButton);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ensure that the window closes completely when exited
        return window;

    }
}