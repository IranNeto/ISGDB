package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Repository {

    private final Path fp = Paths.get("/Users/iran.neto/Documents/Studies/ISGDB/data", "data");

    public String read(String key) throws IOException {
        String line, response = null;
        try (BufferedReader br = new BufferedReader(new FileReader(String.valueOf(fp)))) {
            while ((line = br.readLine()) != null) {
                if (line.split(" ")[0].equals(key)) {
                    response = line;
                    break;
                }
            }
        }
        return response;
    }
}
