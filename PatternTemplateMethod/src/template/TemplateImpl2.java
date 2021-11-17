package template;

public class TemplateImpl2 extends AbstractTemplate{
    @Override
    protected double filter1(int n, double alpha) {
        return n*alpha;
    }

    @Override
    protected double filter2(double sum) {
        return Math.pow(sum,2);
    }
}
