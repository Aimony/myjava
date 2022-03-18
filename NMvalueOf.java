public class NMvalueOf{
    public static void main(String[] args) {
        Integer x =Integer.valueOf(9);
                Double c = Double.valueOf(5);
                Float a = Float.valueOf("80");              

                Integer b = Integer.valueOf("444",16);   // 使用 16 进制

                System.out.println(x);
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
    }
}
/**
 * valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。

该方法是静态方法。该方法可以接收两个参数一个是字符串，一个是基数。
 */

/**
static Integer valueOf(int i)
static Integer valueOf(String s)
static Integer valueOf(String s, int radix)
 */