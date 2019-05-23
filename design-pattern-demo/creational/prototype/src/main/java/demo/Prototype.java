package demo;

import java.io.*;

/**
 * Java语言提供的Cloneable接口和Serializable接口的代码非常简单，它们都是空接口，这种空接口也称为标识接口
 * 标识接口中没有任何方法的定义，其作用是告诉JRE这些接口的实现类是否具有某个功能，如是否支持克隆、是否支持序列化等
 *
 * @author wangyiming
 */
public class Prototype implements Cloneable, Serializable {
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        System.out.println("发生浅复制");
        return (Prototype) super.clone();
    }

    /**
     * 序列化就是将对象写到流的过程，写到流中的对象是原有对象的一个拷贝，而原对象仍然存在于内存中
     * 通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象
     * 因此通过序列化将对象写到一个流中，再从流里将其读出来，可以实现深克隆
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Prototype deepClone() throws IOException, ClassNotFoundException {
        System.out.println("发生深复制");
        // ByteArrayOutputStream 实现一个字节输出流、其中数据被写入到字节数组中， 缓冲区在数据写入时会自动增长
        // 关闭该流无效，关闭此流后调用方法不会有异常
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // java.io.ObjectOutputStream 代表对象输出流，可以将一个对象转换成二进制流，写入目标输出流中
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        // writeObject(Object obj) 方法可对参数指定的obj对象进行序列化，把得到的字节序列写到一个目标输出流中
        // 目标输出流就是 ObjectOutputStream 对象的构造方法传入的输出流
        objectOutputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        // java.io.ObjectInputStream 代表对象输入流
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        // readObject() 方法从一个源输入流中读取字节序列，再把它们反序列化为一个对象，并将其返回
        return (Prototype) objectInputStream.readObject();
    }

}
