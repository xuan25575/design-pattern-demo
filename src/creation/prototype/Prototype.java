package creation.prototype;

import java.io.*;

/**
 * @Author huang_2
 * @Date 2019/12/18 10:53 下午
 * @Description 原型模式
 * 有一个原型实例，基于这个原型实例产生新的实例，也就是“克隆”了。
 *
 * Object 类中有一个 clone() 方法，它用于生成一个新的对象，当然，如果我们要调用这个方法，
 * java 要求我们的类必须先实现 Cloneable 接口，此接口没有定义任何方法，但是不这么做的话，
 * 在 clone() 的时候，会抛出 CloneNotSupportedException 异常。
 *
 * java 的克隆是浅克隆，碰到对象引用的时候，克隆出来的对象和原对象中的引用将指向同一个对象。
 * 或者 将引用可以克隆的。
 * 通常实现深克隆的方法是将对象进行序列化，然后再进行反序列化。
 */
public class Prototype implements Cloneable, Serializable {


    private static final long serialVersionUID = -7536520871097836891L;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /**
     * 序列化 深克隆
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {


        // save the object to  byteArray
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);
        out.close();


         // read a clone of the  object from byte array
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream  in = new ObjectInputStream(bis);
        Object readObject = in.readObject();


        return readObject;
    }




    public static void main(String[] args) throws Exception {

        Prototype prototype = new Prototype();
        Prototype clone = (Prototype)prototype.clone();

        // 以原对象为原型，克隆出新对象。
        System.out.println(clone == prototype); // false

        Prototype clone2 = (Prototype) prototype.deepClone();
        System.out.println(prototype == clone2); // false
    }
}
