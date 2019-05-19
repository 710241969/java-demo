package demo;

/**
 * @author wangyiming
 */
public class SingletonDemo {

    /**
     * 不能提供任何 public 构造函数
     * 同时要将默认构造函数设为 private 避免外部调用
     * 基本上所有单例模式都是这样的
     */
    private SingletonDemo() {
    }

    /**
     * 通过静态常量实现单例模式
     * 线程安全：安全
     * 懒加载：无
     * 使用：一般
     */
    private static SingletonDemo SINGLETON_INSTANCE_1 = new SingletonDemo();

    public static SingletonDemo getInstance_1() {
        return SINGLETON_INSTANCE_1;
    }


    /**
     * 通过静态方法块实现单例模式，其实和静态常量实现是一样的
     * 线程安全：安全
     * 懒加载：无
     * 使用：一般
     */
    private static SingletonDemo SINGLETON_INSTANCE_2;

    static {
        SINGLETON_INSTANCE_2 = new SingletonDemo();
    }

    public static SingletonDemo getInstance_2() {
        return SINGLETON_INSTANCE_2;
    }


    /**
     * 起到了延时加载 Lazy Loading 的效果，当需要用到单例时才会生成实例，但是在多线程环境下，线程不安全
     * 线程安全：不安全
     * 懒加载：有
     * 使用：不推荐
     */
    private static SingletonDemo SINGLETON_INSTANCE_3;

    public static SingletonDemo getInstance_3() {
        if (null == SINGLETON_INSTANCE_3) {
            SINGLETON_INSTANCE_3 = new SingletonDemo();
        }
        return SINGLETON_INSTANCE_3;
    }

    /**
     * 起到了延时加载 Lazy Loading 的效果，当需要用到单例时才会生成实例，线程同步
     * 使用了类锁，每次获取实例都会加锁，效率不高
     * 线程安全：安全
     * 懒加载：有
     * 使用：不推荐
     */
    private static SingletonDemo SINGLETON_INSTANCE_4;

    public static synchronized SingletonDemo getInstance_4() {
        if (null == SINGLETON_INSTANCE_4) {
            SINGLETON_INSTANCE_4 = new SingletonDemo();
        }
        return SINGLETON_INSTANCE_4;
    }

    /**
     * 起到了延时加载 Lazy Loading 的效果，当需要用到单例时才会生成实例
     * 虽然使用同步方法块，和 SINGLETON_INSTANCE_3 一样在多线程环境下仍然线程不安全
     * 线程安全：不安全
     * 懒加载：有
     * 使用：不推荐
     */
    private static SingletonDemo SINGLETON_INSTANCE_5;

    public static SingletonDemo getInstance_5() {
        if (null == SINGLETON_INSTANCE_5) {
            synchronized (SingletonDemo.class) {
                SINGLETON_INSTANCE_5 = new SingletonDemo();
            }
        }
        return SINGLETON_INSTANCE_5;
    }

    /**
     * 起到了延时加载 Lazy Loading 的效果，当需要用到单例时才会生成实例
     * 双重检查，加锁前和加锁后都进行了检查，保证了线程安全
     * 线程安全：安全
     * 懒加载：有
     * 使用：推荐
     */
    private static volatile SingletonDemo SINGLETON_INSTANCE_6;

    public static SingletonDemo getInstance_6() {
        if (null == SINGLETON_INSTANCE_6) {
            synchronized (SingletonDemo.class) {
                if (null == SINGLETON_INSTANCE_6) {
                    SINGLETON_INSTANCE_6 = new SingletonDemo();
                }
            }
        }
        return SINGLETON_INSTANCE_6;
    }


    /**
     * 起到了延时加载 Lazy Loading 的效果，都是采用了类装载的机制来保证初始化实例时只有一个线程
     * 但是外部类加载时，内部类不会加载，内部类只有在被调用时才会加载，线程安全，而且效率高
     * 线程安全：安全
     * 懒加载：有
     * 使用：推荐
     */
    private static SingletonDemo SINGLETON_INSTANCE_7;

    private static class SingleDemoInner {
        private static SingletonDemo SINGLETON_INSTANCE_7 = new SingletonDemo();
    }

    public static SingletonDemo getInstance_7() {
        return SingleDemoInner.SINGLETON_INSTANCE_7;
    }
}
