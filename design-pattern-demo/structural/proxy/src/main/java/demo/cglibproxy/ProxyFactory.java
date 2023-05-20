package demo.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    public static Object getProxyInstance(Object targetObject) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            System.out.println("代理对象执行 before " + method.getName());
        /*
          如果我们通过反射 methodProxy.invoke(arg0, ...) 这种方式是无法调用到父类的方法的
          子类有方法重写，隐藏了父类的方法，父类的方法已经不可见
          如果调 methodProxy.invoke(arg0, ...) 会造成死循环，不停调用当前函数，发生 StackOverflowError
         */
            Object methodResult = proxy.invokeSuper(obj, args);
            System.out.println("代理对象执行 after " + method.getName());
            return methodResult;
        });
        return enhancer.create();
    }
}
