package designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ProjectName: interview_practice
 * @Package: designpatterns
 * @ClassName: JDKProxy
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/9 19:51
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理买房");
        Object invoke = method.invoke(target, args);
        System.out.println("代理买房结束");
        return invoke;
    }


}