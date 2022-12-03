package design.patterns.creator_mode.factory_method_mode.mode_extension;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author LightRain
 * 静态成员变量用来存储创建的对象（键存储的是名称，值存储的是对应的对象)，而读取配置文件以及创建对象写在静态代码块中，目的就是只需要执行一次。
 */
public class CoffeeFactory {
    /*
      加载配置文件,获取配置中的全类名,并创建该类的对象进行储存
     */
    /**
     * 1. 定义容器对象储存咖啡类
     */
    private static HashMap<String, Coffee> map = new HashMap<String, Coffee>();

    /*
      2. 加载配置文件,只需要加载一次
     */
    static {
        //2.1 创建Properties
        Properties properties = new Properties();
        //2.2 获取字节码文件
        InputStream is = Coffee.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            //2.3 调用Properties中的load方法进行加载
            properties.load(is);
            //3. 从Properties集合中获取全类名并创建对象
            Set<Object> keySet = properties.keySet();
            for (Object key : keySet) {
                //获取全类名
                String className = properties.getProperty((String) key);
                //通过反射技术创建对象
                Class<?> clazz = Class.forName(className);
                //通过反射创建对象
                Coffee coffee = (Coffee) clazz.getDeclaredConstructor().newInstance();
                //将名称和对象储存到容器中
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 根据名称获取对象
     *
     * @param name 对象名称
     * @return Coffee
     */
    public static Coffee createCoffee(String name) {
        //通过Map获取对象
        return map.get(name);
    }

}
