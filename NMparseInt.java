public class NMparseInt {
    public static void main(String[] args) {
        int x =Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444",16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }
}
/**
static int parseInt(String s)

static int parseInt(String s, int radix)
 */

/**
parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。

如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数。
 */