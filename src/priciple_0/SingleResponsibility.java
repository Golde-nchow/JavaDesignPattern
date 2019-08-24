package priciple_0;

/**
 * 2019/8/24 :
 * 七大原则之一：单一职责原则
 *
 * 介绍：一个类应该只有一个引起变化的原因。
 *       内聚是用来度量一个类或者模块紧密地达到单一目的或责任
 *       当一个类或模块被设计成只支持一组相关的功能时，我们说它具有高内聚。
 *
 * 注意：只有类的方法足够少，才可以在方法级别上保持单一职责。
 *       其他情况，一律都在类级别上保持单一职责。
 *       如果类已经设计好了，那么采用类的单一职责原则的代价比较高。
 *
 * 优点：降低类的复杂度，提高可维护性。
 *      降低变更带来的风险。
 *
 * 例子：比如一个 Game 类，拥有登录、登出、移动、开火、重置的操作，
 *       已经是有了多重责任了，登录登出可分到 游戏会话类，
 *       移动、开火、重置可分到 动作操作类。
 *
 * @author User : Golden_chow
 */
@SuppressWarnings("all")
public class SingleResponsibility {

    public static void main(String[] args) {
        RoadTransport roadTransport = new RoadTransport();
        WaterTransport waterTransport = new WaterTransport();
        AirTransport airTransport = new AirTransport();

        roadTransport.run("汽车");
        waterTransport.run("潜水艇");
        airTransport.run("飞机");
    }
}

/**
 * 在陆地上行驶的交通工具类
 */
class RoadTransport {
    public void run(String transportName) {
        System.out.println(transportName + "在陆地上行驶");
    }
}

/**
 * 在水上行驶的交通工具类
 */
class WaterTransport {
    public void run(String transportName) {
        System.out.println(transportName + "在水中上行驶");
    }
}

/**
 * 在天空中行驶的交通工具类
 */
class AirTransport {
    public void run(String transportName) {
        System.out.println(transportName + "在天空中行驶");
    }
}
