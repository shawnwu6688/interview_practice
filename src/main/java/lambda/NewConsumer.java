package lambda;

import java.util.Objects;

/**
 * @ProjectName: interview_practice
 * @Package: lambda
 * @ClassName: NewConsumer
 * @Description: []
 * @Author: [Lance Ting]
 * @Date: 2022/6/27 19:20
 * @Version: V1.0
 * @Copyright: 2021  Inc. All rights reserved.
 * @TODO: 注意, 本文件Shawn Wu 所作,如果转载或使用请标明具体出处!
 **/
@FunctionalInterface
public interface NewConsumer<T> {
    //定一个默认抽象方法
    void newAccept(T t);

    //创建自己的andThen默认方法

    default NewConsumer<T> andThen(NewConsumer<? super T> after) {
        Objects.requireNonNull(after);
        return (t -> {
            newAccept(t);
            after.newAccept(t);
        });

    }
    //创建自己的andThenAndThen默认方法
    default NewConsumer<T> andThenAndThen(NewConsumer<? super T> after, NewConsumer<? super T> afterAfter) {
        Objects.requireNonNull(after);
        Objects.requireNonNull(afterAfter);
        return (t -> {
            newAccept(t);
            after.newAccept(t);
            afterAfter.newAccept(t);
        });

    }

}