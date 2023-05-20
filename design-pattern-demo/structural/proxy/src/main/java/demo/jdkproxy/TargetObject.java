package demo.jdkproxy;

/**
 * 真实对象
 *
 * @author wangyiming
 */
public class TargetObject implements InterfaceObject {
    public void doSomething1() {
        System.out.println("被代理的真实对象 TargetObject 的 doSomething1 方法");
    }

    public void doSomething2() {
        System.out.println("被代理的真实对象 TargetObject 的 doSomething2 方法");
    }
}
