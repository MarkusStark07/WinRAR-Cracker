package net.MarkusStark07.winrarcrack.GUI.FolderSelect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Error implements ActionListener {

    private static JFrame frame;
    private static JLabel title;
    private static JButton ok;
    private static boolean initialized = false;

    public Error() {
        if (!initialized) {
            initialized = true;


            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            int windowWidth = 560;
            int windowHeight = 268;

            int windowX = (screenWidth - windowWidth) / 2;
            int windowY = (screenHeight - windowHeight) / 2;



            JPanel panel = new JPanel();
            panel.setLayout(null);

            frame = new JFrame();
            frame.setSize(560, 268);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setTitle("Error");
            frame.setVisible(true);
            frame.add(panel);
            frame.setResizable(false);
            frame.setLocation(windowX, windowY);


            title = new JLabel("Error check console");
            title.setBounds(30, 10, 500, 70);
            title.setFont(title.getFont().deriveFont(Font.BOLD, 50));
            title.setVisible(true);

            ok = new JButton("Okay");
            ok.setFont(ok.getFont().deriveFont(Font.PLAIN, 40));
            ok.setBounds(180, 110, 150, 70);
            ok.setVisible(true);
            ok.addActionListener(new Error() {
                @Override
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            });



            panel.add(title);
            panel.add(ok);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
