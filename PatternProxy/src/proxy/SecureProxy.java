package proxy;

import std.Standard;
import std.StandardImpl;

public class SecureProxy implements Standard {
    private StandardImpl standard ;

    @Override
    public double computer(double input) {
        if(!AppContext.role.equals("ADMIN")){
            throw new RuntimeException("Access Denied ....");
        }
        standard= new StandardImpl();
        double res= standard.computer(input);
        return res;
    }
}
