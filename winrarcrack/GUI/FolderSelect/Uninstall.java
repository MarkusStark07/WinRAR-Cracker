package net.MarkusStark07.winrarcrack.GUI.FolderSelect;

import net.MarkusStark07.winrarcrack.RegKey.RegKeyUninstaller;

import java.awt.*;

public class Uninstall {
    public static String selectedFolderUninstall;
    {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select WinRAR install Folder", FileDialog.LOAD);
        fileDialog.setDirectory("C:\\");

        fileDialog.setFile("rarreg.key");

        fileDialog.setVisible(true);

        selectedFolderUninstall = fileDialog.getDirectory();
        if (selectedFolderUninstall != null) {
            System.out.println("Selected folder: " + selectedFolderUninstall);
            new RegKeyUninstaller();
        } else {
            System.out.println("No folder selected.");
        }

        fileDialog.dispose();
    }
}
