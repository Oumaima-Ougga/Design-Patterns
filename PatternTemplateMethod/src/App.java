import template.AbstractTemplate;
import template.TemplateImpl1;
import template.TemplateImpl2;

public class App {
    public static void main(String[] args) {
        AbstractTemplate template= new TemplateImpl1();
        template.process(45,0.45);

        template= new TemplateImpl2();
        template.process(45,0.45);

    }
}
