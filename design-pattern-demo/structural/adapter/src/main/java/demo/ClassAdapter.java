package demo;

/**
 * 类适配器
 *
 * @author wangyiming
 */
public class ClassAdapter extends Adaptee implements InterfaceTarget {
    public void request() {
        specificRequest();
    }
}
