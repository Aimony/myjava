public class Cengfabiao {
    public static void main(String[] args){
        for (int row = 1;row < 10 ;row++){
            for (int column = 1;column <= row;column++){
                System.out.println(row+"*"+column+"="+row*column);
                System.out.println("     ");
            }
            System.out.println();
        }
    }
}
