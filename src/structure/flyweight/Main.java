package structure.flyweight;

import java.util.HashMap;

/**
 * @Author huang_2
 * @Date 2019/12/19 10:43 下午
 * @Description 享元模式 运用共享技术有效地支持大量细粒度的对象。
 *
 * 复用对象最简单的方式是，用一个 HashMap 来存放每次新生成的对象。每次需要一个对象的时候，
 * 先到 HashMap 中看看有没有，如果没有，再生成新的对象，然后将这个对象放入 HashMap 中。
 */
public class Main {

    private static HashMap<String ,Object> cache  = new HashMap<>();


    public static Object getObj(String key){
        if(cache.containsKey(key)){
            return cache.get(key);
        }else{
            Object obj = new Object();
            cache.put(key,obj);
            return obj;
        }
    }
}
