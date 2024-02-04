import java.io.File;
import java.io.IOException;
public class L14C3 {
    public static void main(String[] args) throws IOException{
        File f = new File("d:\\abc.txt");
        f.createNewFile();
    }
}
