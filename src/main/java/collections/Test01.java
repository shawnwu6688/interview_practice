package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @ProjectName: interview_practice
 * @Package: collections
 * @ClassName: test01
 * @Description: []
 * @Author: [Shawn Wu]
 * @Date: 2022/6/13 18:39
 * @Version: V1.0
 * @Copyright: 2021  Inc. All rights reserved.
 * @TODO: 注意, 本文件Shawn Wu 所作,如果转载或使用请标明具体出处!
 **/
public class Test01 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        Map<Object, Object> map1 = Collections.synchronizedMap(map);
        ConcurrentHashMap<Object, Object> cMap = new ConcurrentHashMap<>();
        //cMap.put()
        ExecutorService pool = Executors.newCachedThreadPool();
        //每天都要提交git代码
    }
}