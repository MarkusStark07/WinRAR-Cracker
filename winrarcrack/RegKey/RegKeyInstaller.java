package net.MarkusStark07.winrarcrack.RegKey;

import net.MarkusStark07.winrarcrack.GUI.FolderSelect.Success;

import java.io.File;
import java.io.IOException;

import static net.MarkusStark07.winrarcrack.GUI.FolderSelect.Install.selectedFolderInstall;

public class RegKeyInstaller {
    {
        String fileName = "rarreg.key";
        String fileContent = "RAR registration data\n" +
                "\n" +
                "WinRAR\n" +
                "\n" +
                "Unlimited Company License\n" +
                "\n" +
                "UID=4b914fb772c8376bf571\n" +
                "\n" +
                "6412212250f5711ad072cf351cfa39e2851192daf8a362681bbb1d\n" +
                "\n" +
                "cd48da1d14d995f0bbf960fce6cb5ffde62890079861be57638717\n" +
                "\n" +
                "7131ced835ed65cc743d9777f2ea71a8e32c7e593cf66794343565\n" +
                "\n" +
                "b41bcf56929486b8bcdac33d50ecf773996052598f1f556defffbd\n" +
                "\n" +
                "982fbe71e93df6b6346c37a3890f3c7edc65d7f5455470d13d1190\n" +
                "\n" +
                "6e6fb824bcf25f155547b5fc41901ad58c0992f570be1cf5608ba9\n" +
                "\n" +
                "aef69d48c864bcd72d15163897773d314187f6a9af350808719796";

        File folder = new File(selectedFolderInstall);

        File file = new File(folder, fileName);

        try {

            java.nio.file.Files.write(file.toPath(), fileContent.getBytes());
            System.out.println("Registration key was successfully installed");
            new Success();

        } catch (IOException e) {
            System.err.println("Error occurred while saving file: " + e.getMessage());
        }
    }
}
