package demo;

import java.util.ArrayList;
import java.util.List;


/**
 * 抽象目标
 *
 * @author wangyiming
 */
public abstract class AbstractSubject {
    public List<InterfaceObserver> observerList = new ArrayList<>();

    public void addObserver(InterfaceObserver observer) {
        this.observerList.add(observer);
    }

    public void deleteObserver(InterfaceObserver observer) {
        this.observerList.remove(observer);
    }

    abstract public void notifyObserver();
}
