public class NMcompareTo {
    public static void main(String[] args) {
        Integer x = 5;

        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));
    }
}
/**
 * 两个不同类型的数据不能用此方法来比较。
 * 
如果指定的数与参数相等返回0。
如果指定的数小于参数返回 -1。
如果指定的数大于参数返回 1。
 */