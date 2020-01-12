package structure.proxy;

import creation.factory.Food;
import jdk.nashorn.internal.scripts.JD;
import structure.proxy.jdk_dynamic.JDKDynamicProxy;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Author huang_2
 * @Date 2019/12/19 8:32 下午
 * @Description TODO
 */
public class Main {

    public static void main(String[] args) throws Exception{
        // 这里用代理类来实例化
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();


        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // 动态代理
        JDKDynamicProxy dynamicProxy = new JDKDynamicProxy(new FoodServiceImpl());
        FoodService foodService2 = dynamicProxy.createProxy();
        foodService2.makeChicken();


        //JDK中有个规范，只要要是$开头的一般都是自动生成的
        // 反编译
//        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{FoodService.class});
//        FileOutputStream os = new FileOutputStream("/soft/$Proxy0.class");
//        os.write(bytes);
//        os.close();
    }
}
