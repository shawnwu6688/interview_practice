package threadlock;

/**
 * @ProjectName: interview_practice
 * @Package: threadlock
 * @ClassName: App
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/6/29 11:04
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class App {
    void test(){
        synchronized (this){
            System.out.println("hello world");
        }
    }

}