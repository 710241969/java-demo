package demo.staticproxy;

/**
 * 真实对象
 *
 * @author wangyiming
 */
public class TargetObject implements InterfaceObject {

    public void doSomething() {
        System.out.println("被代理的真实对象 TargetObject 的 doSomething 方法");
    }
}
