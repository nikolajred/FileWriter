import java.io.File;


public class CreatFile {
    public File createFile(String nameFile){
        File file = new File(nameFile);
        return file;
    }
    public String getAbsolutePath(File file){
        String path = file.getAbsolutePath();
        return path;
    }


}
