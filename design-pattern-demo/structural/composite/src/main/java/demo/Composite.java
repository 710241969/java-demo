package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 *
 * @author wangyiming
 */
public class Composite extends AbstractComponent {
    private List<AbstractComponent> childrenList = new ArrayList<AbstractComponent>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("树枝 " + name + " ：被访问！");
        for (AbstractComponent abstractComponent : childrenList) {
            abstractComponent.operation();
        }
    }

    @Override
    public void add(AbstractComponent abstractComponent) {
        childrenList.add(abstractComponent);
    }

    @Override
    public void remove(AbstractComponent abstractComponent) {
        childrenList.remove(abstractComponent);
    }

    @Override
    public AbstractComponent getChild(int i) {
        return childrenList.get(i);
    }
}
