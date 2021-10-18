package comp;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    private List<Component> childs = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    public void addComponent(Component component){
        childs.add(component);
        component.level=this.level+1;
    }
    public void removeComponent(Component component){
        childs.remove(component);
    }


    @Override
    public void show() {
        System.out.println(tab()+ "Folder :"+ name);
        for (Component c:childs){
            c.show();

        }
    }
}
