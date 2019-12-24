import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {

    public void fileWriter(String nameFile) throws FileNotFoundException {
        CreatFile creatFile = new CreatFile();
       File file = creatFile.createFile(nameFile);
        String path = creatFile.getAbsolutePath(file);
        PrintWriter printWriter = new PrintWriter(nameFile);
        printWriter.print(path);
        printWriter.close();
    }




}
