package demo;

/**
 * 通过枚举实现单例模式，防止反射，防止反序列化重新创建新的对象，线程绝对安全
 * 线程安全：安全
 * 懒加载：无
 * 使用：一般
 *
 * @author wangyiming
 */
public enum SingleEnumDemo {
    SINGELTOM_INSTANCE;
}
