import java.io.FileNotFoundException;

public class API {
    public static void main(String[] args) throws FileNotFoundException {
        creater("D:\\\\Test\\\\text.txt");
    }
    private static void creater(String path) throws FileNotFoundException {
        FileWriter writer = new FileWriter();
        writer.fileWriter(path);
    }
}