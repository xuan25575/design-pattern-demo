package structure.proxy.jdk_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author huang_2
 * @Date 2019/12/19 8:36 下午
 * @Description jdk 动态代理
 */
public class JDKDynamicProxy implements InvocationHandler {


    // 目标对象
    private Object target;



    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 泛型方法  创建代理对象
     * @param <T>
     * @return
     */
    public <T> T createProxy(){
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        T t = (T) Proxy.newProxyInstance(classLoader,interfaces,this);
        return t;
    }


    /**
     * 实际调用的代理方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("增强前");

        Object obj = method.invoke(target, args);

        System.out.println("增强后");

        return obj;
    }

}
