package demo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    public static Object getProxyInstance(Object targetObject) {
        return Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理对象执行 before " + method.getName());
                    Object methodResult = method.invoke(targetObject, args);
                    System.out.println("代理对象执行 after " + method.getName());
                    return methodResult;
                });
    }
}
