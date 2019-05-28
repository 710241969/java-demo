package demo;

/**
 * 具体目标
 *
 * @author wangyiming
 */
public class ConcreteSubject extends AbstractSubject {

    @Override
    public void notifyObserver() {
        System.out.println("目标类发生变化");
        System.out.println("通知所有观察者");

        for (InterfaceObserver observer : observerList) {
            observer.update();
        }
    }
}
