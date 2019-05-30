package demo;

/**
 * 抽象装饰角色
 *
 * @author wangyiming
 */
public abstract class Decorator extends AbstractComponent {
    private AbstractComponent component;

    public Decorator() {
    }

    public Decorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }

    public AbstractComponent getComponent() {
        return component;
    }

    public void setComponent(AbstractComponent component) {
        this.component = component;
    }
}
