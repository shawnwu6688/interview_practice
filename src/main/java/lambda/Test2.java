package lambda;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
    @Contract(pure = true)
    public static @NotNull Comparator<String> stringComparator() {

        return (a, b) -> a.length() - b.length();
    }

    private static String testSupplier(@NotNull Supplier<String> supply) {
        return supply.get();
    }

    public static void formatterPersonMsg(Consumer<String[]> con1, Consumer<String[]> con2,String[] strArray) {
        con1.andThen(con2).accept(strArray);
    }
    public static void formMsg(NewConsumer<String[]> con1, NewConsumer<String[]> con2,NewConsumer<String[]> con3,String[] strArray) {
        con1.andThenAndThen(con2,con3).newAccept(strArray);
    }

    public static void generateX(Consumer<String> consumer) {
        consumer.accept("hello consumer");
    }

    private static void methodTest(Predicate<String> predicate) {
        boolean b = predicate.test("OOM SOF");
        System.out.println(b);
    }

    private static void numberToString(Function<Number, String> function) {
        String apply = function.apply(12);
        System.out.println("转换结果:"+apply);
    }

    // 静态方法
    private static void method_andThen(Function<Integer, Integer> f1,Function<Integer, Integer> f2) {
        Integer apply = f1.andThen(f2).apply(2);
        System.out.println(apply);
    }
    private static void method_compose(Function<Integer, Integer> f1,Function<Integer, Integer> f2) {
        Integer apply = f1.compose(f2).apply(2);
        System.out.println(apply);
    }


    public static void main(String[] args) {
        Object apply = Function.identity().apply(2);
        System.out.println(apply);
        //method_andThen(s->s+1, s->s=s*2);//6
        //method_compose(s->s+1, s->s=s*s);//5

        String[] strArray = {"迪丽热巴,女 ", "古力娜扎,女 ", "马尔扎哈,男 "};
        formMsg((s1) -> {
            for (int i = 0; i < s1.length; i++) {
                System.out.print(s1[i].split("\\,")[0] + " ");
            }
            System.out.println();
        }, (s2) -> {
            System.out.println();
            for (int i = 0; i < s2.length; i++) {
                System.out.print(s2[i].split("\\,")[1] + " ");
            }
            System.out.println();
        },(s3)->{
            for (int i = 0; i < s3.length; i++) {
                System.out.print(s3[i].replace(",",":"));
            }
        },strArray);
        System.out.println();


        //System.out.println(testSupplier(() -> "生产数据"));
        //String[] array = {"abc", "ab", "abcd"};
        //
        //Arrays.sort(array, stringComparator());
        //
        //System.out.println(Arrays.toString(array));


    }


}