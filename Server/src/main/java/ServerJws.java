import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJws {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:4455/",new BanqueService());
        System.out.println("new webservice is deployed");
    }
}
