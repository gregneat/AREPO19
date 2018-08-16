import java.io.File;
import java.io.IOException;

public class RenameTester
{
    public static void main(String[] argv) throws IOException
    {
		// Path of folder where files are located
        // String folder_path = "C:\\Users\\ricky\\Desktop\\Java\\ACD19";
		String folder_path = "C:\\Users\\edans\\Documents\\GitHub\\AREPO19";
        // creating new folder
        File myfolder = new File(folder_path);
		//Renamer.shiftFileOrder(myfolder,69,76);
		Renamer.renameFilesInBinary(myfolder);
		//Renamer.renameFilesInBase10(myfolder);
		System.out.println("Files have been changed");
    }
}