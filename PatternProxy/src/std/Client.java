package std;

public class Client {
  private  Standard standard;

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    public void computer(double input) {
        System.out.println("**************");
        double result=standard.computer(input);
        System.out.println("Result => "+result);
        System.out.println("*********************");
    }
}
