package net.MarkusStark07.winrarcrack.GUI;

import net.MarkusStark07.winrarcrack.GUI.FolderSelect.Install;
import net.MarkusStark07.winrarcrack.GUI.FolderSelect.Uninstall;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI implements ActionListener {

    private static JFrame frame;
    private static JLabel title;
    private static JButton install;
    private static JButton uninstall;
    private static boolean initialized = false;

    public MainGUI() {
        if (!initialized) {
            initialized = true;


            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;

            int windowWidth = 600;
            int windowHeight = 268;

            int windowX = (screenWidth - windowWidth) / 2;
            int windowY = (screenHeight - windowHeight) / 2;


            JPanel panel = new JPanel();
            panel.setLayout(null);

            frame = new JFrame();
            frame.setSize(600, 268);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setTitle("No More WinRAR Popups! (Registration Key Cracker)");
            frame.setVisible(true);
            frame.add(panel);
            frame.setResizable(false);
            frame.setLocation(windowX, windowY);

            title = new JLabel("RegKey Cracker");
            title.setBounds(100, 10, 390, 70);
            title.setFont(title.getFont().deriveFont(Font.BOLD, 50));
            title.setVisible(true);

            install = new JButton("Install");
            install.setFont(install.getFont().deriveFont(Font.PLAIN, 40));
            install.setBounds(350, 110, 200, 70);
            install.setVisible(true);
            install.addActionListener(new MainGUI() {
                @Override
                public void actionPerformed(ActionEvent e){
                    new Install();
                }
            });

            uninstall = new JButton("Uninstall");
            uninstall.setFont(uninstall.getFont().deriveFont(Font.PLAIN, 40));
            uninstall.setBounds(50, 110, 200, 70);
            uninstall.setVisible(true);
            uninstall.addActionListener(new MainGUI() {
                @Override
                public void actionPerformed(ActionEvent e){
                    new Uninstall();
                }
            });

            panel.add(title);
            panel.add(install);
            panel.add(uninstall);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
