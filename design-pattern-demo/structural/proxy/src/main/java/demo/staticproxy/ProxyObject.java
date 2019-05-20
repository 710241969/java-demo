package demo.staticproxy;

/**
 * 代理对象
 *
 * @author wangyiming
 */
public class ProxyObject implements InterfaceObject {

    private TargetObject targetObject;

    public ProxyObject(TargetObject targetObject) throws Exception {
        if (null == targetObject) {
            throw new Exception("传入为 null");
        }
        this.targetObject = targetObject;
    }

    public void doSomething() {
        System.out.println("代理对象执行 before doSomething");
        targetObject.doSomething();
        System.out.println("代理对象执行 after doSomething");
    }
}
