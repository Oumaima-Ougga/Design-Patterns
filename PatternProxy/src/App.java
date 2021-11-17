import proxy.AppContext;
import proxy.CacheProxy;
import proxy.CacheSecureProxy;
import proxy.SecureProxy;
import std.Client;
import std.StandardImpl;

public class App {
    public static void main(String[] args) {
        Client client= new Client();
        client.setStandard(new CacheProxy());
        System.out.println("Premier appel");
        client.computer(87);
        System.out.println("Deuxième appel");
        client.computer(87);
        System.out.println("Troisième appel");
        client.computer(70);
        AppContext.authenticate("admin","1234","ADMIN");
        Client client1= new Client();
        client1.setStandard(new CacheSecureProxy());
        System.out.println("Premier appel");
        client1.computer(87);


    }
}
