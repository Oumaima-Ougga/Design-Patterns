package template;

public abstract class AbstractTemplate {
    public void process(int n, double alpha){
        double sum=0;
        for (int i =0;i<n;i++) {
            double filter1=filter1(n,alpha);
            sum+=filter1;
        }
        double param= filter2(sum);
        double res=alpha*Math.cos(sum)+param*sum;
        System.out.println("Resultat :" +res);
    }
    protected abstract double filter1(int n, double alpha);
    protected abstract double filter2(double sum);
}
