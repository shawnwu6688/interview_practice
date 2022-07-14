package singleton;

/**
 * @ProjectName: interview_practice
 * @Package: singleton
 * @ClassName: Singleton1
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/13 19:27
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO:（1）构造器私有化 （2）自行创建 并静态变量保存 （3）向外提供接口 （4）final修饰，强调是一个单例
 *
 **/
public class SingletonHungry {

    public final static SingletonHungry INSTANCE=new SingletonHungry();

    private SingletonHungry(){

    }

}