import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

@Ignore
public class ServerClientTest {

    private Client client = new Client();

    @Before
    public void setup() throws IOException {
        client = new Client();
        client.startConnection("127.0.0.1", 6666);
    }

    @After
    public void tearDown() throws IOException {
        client.stopConnection();
    }

    @Test
    public void givenClient_whenServerEchosMessage_thenCorrect() throws IOException {
        String resp1 = client.sendMessage("hello");
        String resp2 = client.sendMessage("world");
        String resp3 = client.sendMessage("!");
        String resp4 = client.sendMessage(".");

        assertEquals("hello", resp1);
        assertEquals("world", resp2);
        assertEquals("!", resp3);
        assertEquals("good bye", resp4);
    }

    @Test
    public void givenGreetingClient_whenServerRespondsWhenStarted_thenCorrect() throws IOException {
        Client client = new Client();
        client.startConnection("127.0.0.1", 6666);
        String response = client.sendMessage("hello server");
        assertEquals("hello client", response);
    }
}
