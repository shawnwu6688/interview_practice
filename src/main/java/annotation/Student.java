package annotation;

/**
 * @ProjectName: interview_practice
 * @Package: annotation
 * @ClassName: Student
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/4 18:04
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Student {
    @TestAnnotation(name = "23", number = 0)
    String name;
    @TestAnnotation(number = 12)
    int number;

}