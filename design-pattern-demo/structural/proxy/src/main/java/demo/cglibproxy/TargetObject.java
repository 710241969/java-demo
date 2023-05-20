package demo.cglibproxy;

/**
 * 真实对象
 * 可以不实现接口
 *
 * @author wangyiming
 */
public class TargetObject {
    public void doSomething1() {
        System.out.println("被代理的真实对象 TargetObject 的 doSomething1 方法");
    }

    public final void doSomething2() {
        System.out.println("被代理的真实对象 TargetObject 的 doSomething2 方法");
    }
}
