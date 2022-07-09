package annotation;

import java.lang.annotation.*;

/**
 * @ProjectName: interview_practice
 * @Package: annotation
 * @ClassName: TestAnnotation
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/4 17:40
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
     String name() default "className";
    int number();

}