import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reader_CSV {

    private String path;

    Reader_CSV(String path){
        this.path = path;
    }

    private List<String> read() throws IOException {
        return Files.readAllLines(Paths.get(path), StandardCharsets.ISO_8859_1);
    }

    public List<String> getData() throws IOException {
        return this.read();
    }
    
}
