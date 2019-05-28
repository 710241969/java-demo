package demo;

/**
 * 具体观察者
 *
 * @author wangyiming
 */
public class ConcreteObserverB implements InterfaceObserver {

    @Override
    public void update() {
        System.out.println("观察者 B 观察到变化");
    }

}
