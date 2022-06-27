package lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ProjectName: interview_practice
 * @Package: lambda
 * @ClassName: Test2
 * @Description: []
 * @Author: [Shawn Wu]
 * @Date: 2022/6/27 18:30
 * @Version: V1.0
 * @Copyright: 2021  Inc. All rights reserved.
 * @TODO: 函数式接口练习!
 **/
public class Test2 {
    public static Comparator<String> stringComparator(){

        return (a,b) -> a.length()-b.length();
    }

    public static void main(String[] args) {
        String[] array={"abc","ab","abcd"};

        Arrays.sort(array,stringComparator());

        System.out.println(Arrays.toString(array));


    }



}