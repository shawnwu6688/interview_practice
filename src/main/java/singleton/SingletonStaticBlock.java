package singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ProjectName: interview_practice
 * @Package: singleton
 * @ClassName: SingtonStaticBlock
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/13 19:49
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class SingletonStaticBlock {
    public final static SingletonStaticBlock INSTANCE;
    private String info;

    static {
        Properties pro = new Properties();
        //文件在src下，最终在bin目录下，可以使用类加载器加载文件
        try {
            InputStream resource = SingletonStaticBlock.class.getClassLoader().getResourceAsStream("singleton.properties");
            InputStream resource1 = SingletonStaticBlock.class.getResourceAsStream("/singleton.properties");

            pro.load(SingletonStaticBlock.class.getClassLoader().getResourceAsStream("singleton.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        INSTANCE = new SingletonStaticBlock(pro.getProperty("info"));
    }
    private SingletonStaticBlock(String info){
        this.info = info;
    }

}