package designpatterns.proxy;

import java.lang.reflect.Proxy;

/**
 * @ProjectName: interview_practice
 * @Package: designpatterns
 * @ClassName: Test
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/9 19:55
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test {
    public static void main(String[] args) {
        Xiao xiao = new Xiao();
        JdkProxy jdkProxy = new JdkProxy(xiao);
        House house = (House) Proxy.newProxyInstance(xiao.getClass().getClassLoader(), xiao.getClass().getInterfaces(),jdkProxy);
        house.buy();

    }

}