package threadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: interview_practice
 * @Package: threadlock
 * @ClassName: Test1
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/6/28 17:17
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Test1 {
    public static void testThread(){
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {

            int temp  = i;

            pool.execute(()-> System.out.println("执行第"+temp+"个了"));
        }
    }

    public static void main(String[] args) {
        testThread();
    }

}