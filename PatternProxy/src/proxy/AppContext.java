package proxy;

public class AppContext {
    public static String username;
    public static String password;
    public static String role;

    public static void authenticate(String u, String p, String r){
        if(p.equals("1234")){
            username=u;
            role= r;
        }

    }
}
