package test;

import singleton.SingletonStaticBlock;

/**
 * @ProjectName: interview_practice
 * @Package: test
 * @ClassName: TestSingleton
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/13 19:40
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class TestSingleton {
    public static void main(String[] args) {
        SingletonStaticBlock instance = SingletonStaticBlock.INSTANCE;
    }

}