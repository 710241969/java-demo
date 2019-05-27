package demo;

/**
 * 抽象构建，可以是抽象类，也可以是接口
 *
 * @author wangyiming
 */
public abstract class AbstractComponent {
    public abstract void operation();

    /**
     * 如不声明下面的方法，是安全组合模式
     */

    // --------------------------------
    // 分界线
    // --------------------------------

    /**
     * 声明了下面的方法，是透明组合模式
     */
/*    public abstract void addComponent();

    public abstract void remove();

    public abstract AbstractComponent getChild(int i);*/

    // --------------------------------
    // 分界线
    // --------------------------------

    /**
     * 如果是抽象类，还可以提供默认实现，如下面的抛出异常
     */
    public void add(AbstractComponent abstractComponent) throws Exception {
        throw new Exception("不支持的操作");
    }

    public void remove(AbstractComponent abstractComponent) throws Exception {
        throw new Exception("不支持的操作");
    }

    public AbstractComponent getChild(int i) throws Exception {
        throw new Exception("不支持的操作");
    }

}
