package demo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object targetObject;

    public ProxyFactory(InterfaceObject targetObject) {
        this.targetObject = targetObject;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理对象执行 before " + method.getName());
                        Object methodResult = method.invoke(targetObject, args);
                        System.out.println("代理对象执行 after " + method.getName());
                        return methodResult;
                    }
                });
    }
}
