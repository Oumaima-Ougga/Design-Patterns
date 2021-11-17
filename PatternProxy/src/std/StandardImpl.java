package std;

public class StandardImpl implements Standard{
    @Override
    public double computer(double input) {
        double res= Math.atan(input);
        return res;
    }
}
