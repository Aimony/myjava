public class Xunhuanbreak {
    public static void main(String[] args){
        int [] numbers = {10,20,30,40,50};

        for(int x :numbers){
            //x 等于 30 时跳出循环
            if (x == 30){
                break;
            }
            System.out.println("x");
            System.out.println("\n");
        }
    }
}
