package designpatterns;

import java.beans.Statement;

/**
 * @ProjectName: interview_practice
 * @Package: designpatterns
 * @ClassName: StatementCallback
 * @Description: []
 * @Author: [Lance Ting]
 * @Date: 2022/7/9 19:33
 * @Version: V1.0
 * @Copyright: 2021  Inc. All rights reserved.
 * @TODO: 注意, 本文件Shawn Wu 所作,如果转载或使用请标明具体出处!
 **/
public interface StatementCallback {
    Object doWithStatement(Statement stmt);

}