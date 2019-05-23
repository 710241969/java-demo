package demo.cglibproxy;

/**
 * 真实对象
 * 可以不实现接口
 *
 * @author wangyiming
 */
public class TargetObject {

    public void doSomething() {
        System.out.println("被代理的真实对象 TargetObject 的 doSomething 方法");
    }

}
