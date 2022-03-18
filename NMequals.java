public class NMequals {
    public static void main(String[] args) {
        Integer x = 5;
        Integer y = 10;
        Integer z = 5;
        short a = 5;

        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));
    }
}
/**
 * 如 Number 对象不为 Null，且与方法的参数类型与数值都相等返回 True，否则返回 False。
 */