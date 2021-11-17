package proxy;

import std.Standard;

public class CacheSecureProxy implements Standard {
    private CacheProxy cacheProxy= new CacheProxy();

    @Override
    public double computer(double input) {
        if(!AppContext.role.equals("ADMIN")){
            throw new RuntimeException("Access Denied ....");
        }

        double res= cacheProxy.computer(input);
        return res;
    }
}
