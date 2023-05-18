package net.MarkusStark07.winrarcrack.RegKey;

import net.MarkusStark07.winrarcrack.GUI.FolderSelect.Success;

import java.io.File;
import java.io.IOException;

import static net.MarkusStark07.winrarcrack.GUI.FolderSelect.Uninstall.selectedFolderUninstall;

public class RegKeyUninstaller {
    {
        String fileName = "rarreg.key";

        File folder = new File(selectedFolderUninstall);

        File file = new File(folder, fileName);

        try {

            java.nio.file.Files.delete(file.toPath());
            System.out.println("Registration key was successfully uninstalled");
            new Success();

        } catch (IOException e) {
            System.err.println("Error occurred while saving file: " + e.getMessage());
        }
    }
}
