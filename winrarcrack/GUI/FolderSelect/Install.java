package net.MarkusStark07.winrarcrack.GUI.FolderSelect;

import net.MarkusStark07.winrarcrack.RegKey.RegKeyInstaller;

import java.awt.FileDialog;
import java.awt.Frame;

public class Install {
    public static String selectedFolderInstall;
    {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "Select WinRAR install Folder", FileDialog.LOAD);
        fileDialog.setDirectory("C:\\");

        fileDialog.setFile("rarreg.key");

        fileDialog.setVisible(true);

        selectedFolderInstall = fileDialog.getDirectory();
        if (selectedFolderInstall != null) {
            System.out.println("Selected folder: " + selectedFolderInstall);
            new RegKeyInstaller();
        } else {
            System.out.println("No folder selected.");
        }

        fileDialog.dispose();
    }
}
