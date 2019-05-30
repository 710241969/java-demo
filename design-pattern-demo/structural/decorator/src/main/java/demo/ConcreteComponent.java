package demo;

/**
 * 具体构件类
 * 需要被装饰
 *
 * @author wangyiming
 */
public class ConcreteComponent extends AbstractComponent {
    @Override
    public void operation() {
        System.out.println("具体构件类 需要被装饰");
    }
}
