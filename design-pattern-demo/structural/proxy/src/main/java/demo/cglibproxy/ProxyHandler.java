package demo.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * CGLib 代理
 * CGLib 是针对类实现代理，主要是对指定的类生成一个子类，覆盖其中的方法（继承）
 * 底层采用ASM字节码生成框架，使用字节码技术生成代理类，比使用Java反射效率要高
 * 需要注意的是，CGLib 不能对声明为final的方法进行代理
 *
 * @author wangyiming
 */
public class ProxyHandler implements MethodInterceptor {

    private Object targetObject;

    public ProxyHandler(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetObject.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理对象执行 before " + method.getName());
        // 如果我们通过反射 arg1.invoke(arg0, ...) 这种方式是无法调用到父类的方法的
        // 子类有方法重写，隐藏了父类的方法，父类的方法已经不可见
        // 如果调 arg1.invoke(arg0, ...) 很明显会死循环
        Object methodResult = methodProxy.invokeSuper(object, args);
        System.out.println("代理对象执行 after " + method.getName());
        return methodResult;
    }
}
