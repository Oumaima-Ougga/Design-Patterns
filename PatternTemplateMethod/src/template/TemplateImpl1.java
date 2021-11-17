package template;

public class TemplateImpl1 extends AbstractTemplate{

    @Override
    protected double filter1(int n, double alpha) {
        return n*alpha*(1+Math.atan(n*alpha));
    }

    @Override
    protected double filter2(double sum) {
        return sum*Math.PI;
    }
}
