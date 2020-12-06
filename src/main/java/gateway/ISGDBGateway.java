package gateway;

import repository.Repository;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;

public class ISGDBGateway {

    public final Repository repo = new Repository();

    public HashMap<String, String> get(String key) throws IOException {
        Optional<String> optional = Optional.ofNullable(repo.read(key));
        HashMap<String, String> response = new HashMap<>();

        if (optional.isPresent()) {
            response.put("message", "Objeto não existente");
        } else {
            response.put("value", optional.get().split(" ")[1]);
        }

        return response;
    }

    public HashMap<String, String> insert(String key, String value){
        return null;
    }
}
