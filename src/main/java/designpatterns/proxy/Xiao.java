package designpatterns.proxy;

/**
 * @ProjectName: interview_practice
 * @Package: designpatterns.proxy
 * @ClassName: Xiao
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/9 19:57
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Xiao implements House{

    @Override
    public void buy() {
        System.out.println("buy house");
    }
}