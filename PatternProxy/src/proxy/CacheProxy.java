package proxy;

import std.Standard;
import std.StandardImpl;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy implements Standard {
    private StandardImpl standard = new StandardImpl();
    private Map<Double,Double> cache = new HashMap<>();

    @Override
    public double computer(double input) {
        Double value = cache.get(input);
        if(value != null) {
            System.out.println("Via Cache");
            return value;
        }
        standard=new StandardImpl();
        double res= standard.computer(input);
        cache.put(input,res);
        System.out.println("Via source");
        return res;
    }
}
