// package com.j2se.myInstances.example2_2;
import java.util.Scanner;

    public class XiaomingBuying {
        static int money = 20;
        public static void main(String[] args){
            menuInfo();
            try (Scanner sc = new Scanner(System.in)) {
                switch (sc.nextInt()){
                    case 1:
                        compute(1,1);
                        break;
                    case 2:
                        compute(2,2);
                        break;
                    case 3:
                        compute(3,3);
                        break;
                    case 4:
                    compute(5,4);
                        break;
                    default:
                        System.out.println("商品编号有误！");
                        break;
                }
            }
        }

    public static void menuInfo(){
        System.out.println("书本的价格为12元，您总共有20元");
        System.out.println("1 铅笔的价格为： 1元");
        System.out.println("2 橡皮的价格为： 2元");
        System.out.println("3 可乐的价格为： 3元");
        System.out.println("4 零食的价格为： 5元");
        System.out.println("请输入其他需要购买商品的序列号：");
    }
    public static void compute(int price,int idx){
        String[] itemArr = {"","铅笔","橡皮","可乐","零食"};
        int blance = money - 12;
        int nums = 0;
        nums = blance / price;
        blance = blance % price;
        System.out.println("购买完书本后，还可以购买"+nums+"个"+itemArr[idx]+"，剩余"+blance+"元。");
    }
}


